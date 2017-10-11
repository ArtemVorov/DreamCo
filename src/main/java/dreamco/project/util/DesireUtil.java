package dreamco.project.util;

import dreamco.project.model.Desire;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

/**
 * Created by temaprof on 24.09.2016.
 */
public class DesireUtil {
//    public static final List<Desire> BARTER = Arrays.asList(
//            new Desire(LocalDateTime.of(2016, Month.SEPTEMBER, 24, 9, 0), "Need apple iphone 7", "Do something for you", "Desire"),
//            new Desire(LocalDateTime.of(2016, Month.SEPTEMBER, 22, 14, 23), "Need Tesla model S", "Do something for you", "Job"),
//            new Desire(LocalDateTime.of(2016, Month.SEPTEMBER, 17, 6, 35), "Need some house in California", "Do something for you", "Hobbie")
//    );


//    public static List<Desire> getBARTER() {
//        return BARTER;
//    }


    public static final int DEFAULT_BARTER = 3;
    public static List<Desire> getBARTERwithCollections(List<Desire> desires, int DEFAULT_BARTER) {
        return desires;
    }

    public static List<Desire> getFilteredWithCategory(Collection<Desire> desires, String category) {
       // CategoriesUtil.categoryInitialize(Collections.synchronizedCollection(desires));
       // List<Desire> categoriesList = Collections.synchronizedList(CategoriesUtil.getCategory(category));
        return (List<Desire>) desires;
    }
}
