package dreamco.project.web;

import dreamco.project.model.Desire;
import dreamco.project.web.desire.DesireRestController;
import org.slf4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by temaprof on 23.09.2016.
 */
public class DesireServlet extends HttpServlet {
    private static final Logger LOG = getLogger(DesireServlet.class);

    private ConfigurableApplicationContext springContext;
    private DesireRestController desireController;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        springContext = new ClassPathXmlApplicationContext("spring/spring-app.xml", "spring/spring-db.xml");
        desireController = springContext.getBean(DesireRestController.class);
    }

    @Override
    public void destroy() {
        springContext.close();
        super.destroy();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            final Desire desire = new Desire(
                    LocalDateTime.parse(request.getParameter("dateTime")),
                    request.getParameter("description"),
                    request.getParameter("barter"),
                    request.getParameter("category"));

            if (request.getParameter("id").isEmpty()) {
                LOG.info("Create {}", desire);
                desireController.create(desire);
            } else {
                LOG.info("Update {}", desire);
                desireController.update(desire, getId(request));
            }
            response.sendRedirect("desires");
        } else if ("filter".equals(action)) {
            String desireCategory = resetParam("category", request);
            request.setAttribute("desireList", desireController.getCategory(desireCategory));
            request.getRequestDispatcher("/desireList.jsp").forward(request, response);
        }
    }

    private String resetParam(String param, HttpServletRequest request) {
        String value = request.getParameter(param);
        request.setAttribute(param, value);
        return value;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            LOG.info("getAll");
            request.setAttribute("desireList", desireController.getAll());
            request.getRequestDispatcher("/desireList.jsp").forward(request, response);

        } else if ("delete".equals(action)) {
            int id = getId(request);
            LOG.info("Delete {}", id);
            desireController.delete(id);
            response.sendRedirect("desires");

        } else if ("create".equals(action) || "update".equals(action)) {
            final Desire desire = action.equals("create") ?
                    new Desire(LocalDateTime.now().withNano(0).withSecond(0), "", "", "") :
                    desireController.get(getId(request));
            request.setAttribute("desire", desire);
            request.getRequestDispatcher("/desireEdit.jsp").forward(request, response);
        }

//        request.setAttribute("desireList", DesireUtil.getBARTER());
//        request.getRequestDispatcher("/desireList.jsp").forward(request, response);
        //response.sendRedirect("desireList.jsp");
    }


    private int getId(HttpServletRequest request) {
        String paramId = Objects.requireNonNull(request.getParameter("id"));
        return Integer.valueOf(paramId);
    }
}
