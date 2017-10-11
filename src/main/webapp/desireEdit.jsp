<%--
  Created by IntelliJ IDEA.
  User: Artyom
  Date: 25.09.2016
  Time: 12:28
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>DesireEditor</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
 <section>
     <h2><a href="index.html">Home</a></h2>
     <h3>${param.action == 'create' ? 'Create barter' : 'Edit barter'}</h3>
     <hr>
     <jsp:useBean id="desire" type="dreamco.project.model.Desire" scope="request"/>
     <form method="post" action="desires">
         <input type="hidden" name="id" value="${desire.id}">
         <dl>
             <dt>Date Time:</dt>
             <dd><input type="datetime-local" value="${desire.dateTime}" name="dateTime"></dd>
         </dl>
         <dl>
             <dt>Desire description</dt>
             <dd><input type="text" value="${desire.description}" name="description"></dd>
         </dl>
         <dl>
             <dt>Barter propose</dt>
             <dd><input type="text" value="${desire.barter}" name="barter"></dd>
         </dl>
         <dl>
             <dt>Category</dt>
             <dd><input type="text" value="${desire.categories}" name="category"></dd>
         </dl>
         <button type="submit">Save</button>
         <button onclick="window.history.back()">Cancel</button>
     </form>
 </section>
</body>
</html>
