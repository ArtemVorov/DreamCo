<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%------------------------------------------------------------%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dreams</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/dreams.css">
</head>
<body>
<header>
    <div class="menu">
        <div class="container menu-container">
            <div class="menu-logo">
                <div class="menu-logo-icon">D</div>
                <div class="menu-logo-text-container">
                    <a href="index.html" class="menu-logo-text menu-logo-text-up">Dream.Co</a><br>
                    <a href="index.html" class="menu-logo-text menu-logo-text-down">make it happen</a>
                </div>
            </div>
            <a href="index.html" class="menu-item menu-item-1">Home</a>
            <a href="dreams.jsp" class="menu-item menu-item-1">Dreams</a>
            <a href="desires" class="menu-item menu-item-1">Profile</a>
        </div>
    </div>
</header>

<div class="middle container">
    <div class="listOfDreams">
        <span>List of Dreams</span>
    </div>
    <div class="dreams">
        <table class="table">
            <thead>
            <tr>
                <th>Data</th>
                <th>Name of dream</th>
                <th>User</th>
                <th></th>
            </tr>
            </thead>
            <tr>
                <td>12.02.16</td>
                <td>Motocycles</td>
                <td><a class="fa" href="">Ivan Petryak</a></td>
                <td><span class="fa fa-check"></span></td>
            </tr>
            <tr>
                <td>12.02.16</td>
                <td>Jumping</td>
                <td><a class="fa" href="">Jenifer Smith</a></td>
                <td><span class="fa fa-check"></span></td>
            </tr>
        </table>
    </div>
</div>

<footer>
    <div class="footer-content container">
        <div class="projected">
            <table>
                <tr>
                    <td>Projected by:</td>
                    <td><span class="fa fa-user-circle-o"></span>Darya Makarova</td>
                </tr>
                <tr>
                    <td></td>
                    <td><span class="fa fa-user-circle-o"></span>Artem Vorov</td>
                </tr>
                <tr>
                    <td></td>
                    <td><span class="fa fa-user-circle-o"></span>Dmitry Lopata</td>
                </tr>
            </table>
        </div>
        <div class="aboutUs">
            <a href="">About Us:</a>
        </div>
        <div class="help">
            <span href="">Help:</span>
            <table>
                <tr>
                    <td><span class="fa fa-envelope"></span></td>
                    <td><a href="darya.aleks.mak@gmail.com">darya.aleks.mak@gmail.com</a></td>
                </tr>
                <tr>
                    <td> <span class="fa fa-phone"></span></td>
                    <td><a href="">09670445991</a></td>
                </tr>
            </table>
        </div>
        <div class="contact">
            <a href="">Contact:</a>
            <div class="contact-icons">
                <a href="#" class="fa fa-vk"></a>
                <a href="#" class="fa fa-twitter"></a>
                <a href="#" class="fa fa-skype"></a>
            </div>
        </div>
    </div>
</footer>
<!------------------------JS----------------------------->
<script src="jquery/jquery-3.1.0.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>