<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%------------------------------------------------------------%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/profileDesireList.css">
    <link rel="stylesheet" href="css/profile_bootstrap.css">
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
            <a href="index.html" class="menu-item menu-item-logOut">Log out</a>
            <%--<button class="menu-item menu-item-logOut">Log out</button>--%>
        </div>
    </div>
</header>
<div class="middle container">
    <div class="user-data">
        <section>

            <div class="container" style="margin-top: 30px;">
                <div class="profile-head">
                    <div class="col-md- col-sm-4 col-xs-12">
                        <img src="http://www.newlifefamilychiropractic.net/wp-content/uploads/2014/07/300x300.gif"
                             class="img-responsive"/>
                        <h6>Jenifer Smith</h6>
                    </div><!--col-md-4 col-sm-4 col-xs-12 close-->


                    <div class="col-md-5 col-sm-5 col-xs-12">
                        <h5>Jenifer Smith</h5>

                        <ul>
                            <!-- <li><span class="glyphicon glyphicon-briefcase"></span> 5 years</li> -->
                            <li><span class="glyphicon glyphicon-map-marker"></span> U.S.A.</li>
                            <!-- <li><span class="glyphicon glyphicon-home"></span> 555 street Address,toedo 43606 U.S.A.</li> -->
                            <li><span class="glyphicon glyphicon-phone"></span> <a href="#" title="call">(+021) 956
                                789123</a></li>
                            <li><span class="glyphicon glyphicon-envelope"></span><a href="#" title="mail">jenifer123@gmail.com</a>
                            </li>

                        </ul>


                    </div><!--col-md-8 col-sm-8 col-xs-12 close-->


                </div><!--profile-head close-->
            </div><!--container close-->


            <div id="sticky" class="container">

                <!-- Nav tabs -->
                <ul class="nav nav-tabs nav-menu" role="tablist">
                    <li class="active">
                        <a href="#profile" role="tab" data-toggle="tab">
                            <i class="fa fa-male"></i> Profile
                        </a>
                    </li>
                    <li><a href="#change" role="tab" data-toggle="tab">
                        <i class="fa fa-key"></i> Edit Profile
                    </a>
                    </li>
                </ul><!--nav-tabs close-->

                <!-- Tab panes -->
                <div class="tab-content">
                    <div class="tab-pane fade active in" id="profile">
                        <div class="container">
                            <div class="col-sm-11" style="float:left;">
                                <div class="hve-pro">
                                    <p>Hello I’m Jenifer Smith, a leading expert in interactive and creative design
                                        specializing in the mobile medium.
                                        My graduation from Massey University with a Bachelor of Design majoring in
                                        visual communication.</p>
                                </div><!--hve-pro close-->
                            </div><!--col-sm-12 close-->
                            <br clear="all"/>
                            <div class="row">
                                <div class="col-md-12">
                                    <h4 class="pro-title">Bio Graph</h4>
                                </div><!--col-md-12 close-->


                                <div class="col-md-6">

                                    <div class="table-responsive responsiv-table">
                                        <table class="table bio-table">
                                            <tbody>
                                            <tr>
                                                <td>Firstname</td>
                                                <td>: jenifer</td>
                                            </tr>
                                            <tr>
                                                <td>Lastname</td>
                                                <td>: smith</td>
                                            </tr>
                                            <tr>
                                                <td>Birthday</td>
                                                <td>: 10 january 1980</td>
                                            </tr>
                                            <tr>
                                                <td>Contury</td>
                                                <td>: U.S.A.</td>
                                            </tr>
                                            <tr>
                                                <td>Occupation</td>
                                                <td>: Web Designer</td>
                                            </tr>

                                            </tbody>
                                        </table>
                                    </div><!--table-responsive close-->
                                </div><!--col-md-6 close-->

                                <div class="col-md-6">

                                    <div class="table-responsive responsiv-table">
                                        <table class="table bio-table">
                                            <tbody>
                                            <tr>
                                                <td>Email</td>
                                                <td>: jenifer123@gmail.com</td>
                                            </tr>
                                            <tr>
                                                <td>Phone</td>
                                                <td>: (+021) 956 789123</td>
                                            </tr>
                                            <tr>
                                                <td>Twiter</td>
                                                <td>#@jenifer123</td>
                                            </tr>

                                            </tbody>
                                        </table>
                                    </div><!--table-responsive close-->
                                </div><!--col-md-6 close-->

                            </div><!--row close-->


                        </div><!--container close-->
                    </div><!--tab-pane close-->

                    <div class="tab-pane fade" id="change">
                        <div class="container fom-main">
                            <div class="row">
                                <div class="col-sm-12">
                                    <h2 class="register">Edit Your Profile</h2>
                                </div><!--col-sm-12 close-->

                            </div><!--row close-->
                            <br/>
                            <div class="row">

                                <form class="form-horizontal main_form text-left" action=" " method="post"
                                      id="contact_form">
                                    <fieldset>


                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">First Name</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <input name="first_name" placeholder="First Name"
                                                           class="form-control" type="text">
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Text input-->

                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">Last Name</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <input name="last_name" placeholder="Last Name" class="form-control"
                                                           type="text">
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Text input-->
                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">E-Mail</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <input name="email" placeholder="E-Mail Address"
                                                           class="form-control" type="text">
                                                </div>
                                            </div>
                                        </div>


                                        <!-- Text input-->

                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">Phone #</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <input name="phone" placeholder="(845)555-1212" class="form-control"
                                                           type="text">
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Text input-->

                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">Address</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <textarea class="form-control" name="comment"
                                                              placeholder="Project Description"></textarea>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">Project Description</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <textarea class="form-control" name="comment"
                                                              placeholder="Project Description"></textarea>
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Select Basic -->

                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">Choose Password</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <input name="first_name" placeholder="Choose Password"
                                                           class="form-control" type="password">
                                                </div>
                                            </div>
                                        </div>


                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">Confiram Password</label>
                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <input name="first_name" placeholder="Confiram Password"
                                                           class="form-control" type="password">
                                                </div>
                                            </div>
                                        </div>


                                        <!-- radio checks -->
                                        <div class="form-group col-md-12">
                                            <label class="col-md-10 control-label">Gender</label>
                                            <div class="col-md-6">
                                                <div class="radio col-md-2">
                                                    <label>
                                                        <input type="radio" name="hosting" value="yes"/> Male
                                                    </label>
                                                </div>
                                                <div class="radio col-md-2">
                                                    <label>
                                                        <input type="radio" name="hosting" value="no"/> Female
                                                    </label>
                                                </div>
                                            </div>
                                        </div>

                                        <!-- upload profile picture -->
                                        <div class="col-md-12 text-left">
                                            <div class="uplod-picture">
<span class="btn btn-default uplod-file">
    Upload Photo <input type="file"/>
</span>
                                            </div><!--uplod-picture close-->
                                        </div><!--col-md-12 close-->
                                        <!-- Button -->
                                        <div class="form-group col-md-10">
                                            <div class="col-md-6">
                                                <button type="submit" class="btn btn-warning submit-button">Save
                                                </button>
                                                <button type="submit" class="btn btn-warning submit-button">Cancel
                                                </button>

                                            </div>
                                        </div>
                                    </fieldset>
                                </form>
                            </div><!--row close-->
                        </div><!--container close -->
                    </div><!--tab-pane close-->
                </div><!--tab-content close-->
            </div><!--container close-->

        </section><!--section close-->
    </div>
    <div class="user-dreams table-responsive">
        <div class="dreamsList">
            My Dreams list
        </div>
        <section>
            <form method="post" action="desires?action=filter">
                <div class="filter">
                    <span class="fa fa-filter"></span>
                    <input class="form-control" type="text" name="category" placeholder="Enter category"
                           value="${desireCategory}">
                    <button type="submit">Filter</button>
                </div>
            </form>
            <table class="table table-striped" border="1" cellpadding="8" cellspacing="0">
                <thead>
                <tr>
                    <th>Date</th>
                    <th>Desire</th>
                    <th>Barter</th>
                    <th>Category</th>
                    <th></th>
                    <th><a href="desires?action=create"><span id="addDreamIcon" class="fa fa-plus"></span></a></th>
                </tr>
                </thead>
                <c:forEach items="${desireList}" var="barter">
                    <jsp:useBean id="barter" scope="page" type="dreamco.project.model.Desire"/>
                    <tr>
                        <td>${barter.dateTime.toLocalDate()} ${barter.dateTime.toLocalTime()}</td>
                        <td>${barter.description}</td>
                        <td>${barter.barter}</td>
                        <td>${barter.categories}</td>
                        <td><a href="desires?action=update&id=${barter.id}"><span class="fa fa-edit"></span></a></td>
                        <td><a href="desires?action=delete&id=${barter.id}"><span class="fa fa-close"></span></a></td>
                    </tr>
                </c:forEach>
            </table>
        </section>
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
                    <td><span class="fa fa-phone"></span></td>
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
<script src="js/main.js"></script>
</body>
</html>
<%------------------------------------------------------------%>
<%--<html>
<head>
    <title>User barter</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/dreams.css">
</head>
<body>
<section>
<h2><a href="index.html">Home</a></h2>
<h2>User barter</h2>
    <form method="post" action="desires?action=filter">
        <dl>
            <dt>Category:</dt>
            <dd><input type="text" name="category" value="${desireCategory}"></dd>
        </dl>
        <button type="submit">Filter</button>
    </form>
    <hr>
<a href="desires?action=create">Add barter</a>
<hr>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Date</th>
        <th>Desire</th>
        <th>Barter</th>
        <th>Category</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <c:forEach items="${desireList}" var="barter">
        <jsp:useBean id="barter" scope="page" type="dreamco.project.model.Desire"/>
        <tr>
            <td>${barter.dateTime.toLocalDate()} ${barter.dateTime.toLocalTime()}</td>
            <td>${barter.description}</td>
            <td>${barter.barter}</td>
            <td>${barter.categories}</td>
            <td><a href="desires?action=update&id=${barter.id}">Update</a> </td>
            <td><a href="desires?action=delete&id=${barter.id}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>
</section>
</body>
</html>--%>
