<!doctype html>
<%@ page import = "java.io.*,java.util.*, org.elluck91.finsoft.main.employee.Employee" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="${pageContext.request.contextPath}/resources/assets/img/apple-icon.png" />
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/assets/img/favicon.png" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Material Dashboard by Creative Tim</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <!-- Bootstrap core CSS     -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
    <!--  Material Dashboard CSS    -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/material-dashboard.css?v=1.2.0" rel="stylesheet" />
    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/demo.css" rel="stylesheet" />
    <!--     Fonts and icons     -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons" rel='stylesheet'>
</head>

<body>
    <div class="wrapper">
        <div class="sidebar" data-color="purple" data-image="${pageContext.request.contextPath}/resources/assets/img/sidebar-1.jpg">
            <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
            <div class="logo">
                <a href="http://localhost:8080" class="simple-text">
                    Finsoft
                </a>
            </div>
            <div class="sidebar-wrapper">
                <ul class="nav">
                    <li class="active">
                        <a href="/">
                            <i class="material-icons">dashboard</i>
                            <p>Dashboard</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/employee">
                            <i class="material-icons">person</i>
                            <p>Add Employee</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/employee/name/A/0">
                            <i class="material-icons">content_paste</i>
                            <p>Employees</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/employee/dept/General/0">
                            <i class="material-icons">bubble_chart</i>
                            <p>Departments</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="main-panel">
            <nav class="navbar navbar-transparent navbar-absolute">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"> Table List </a>
                    </div>
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <a href="#pablo" class="dropdown-toggle" data-toggle="dropdown">
                                    <i class="material-icons">person</i>
                                    <p class="hidden-lg hidden-md">Profile</p>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="/logout">Logout</a>
                                    </li>

                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card card-plain">
                                <div class="card-header" data-background-color="purple">
                                    <h4 class="title">Last Name</h4>     
                                    <a href="${pageContext.request.contextPath}/employee/name/A/0" class="category">A</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/B/0" class="category">B</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/C/0" class="category">C</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/D/0" class="category">D</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/E/0" class="category">E</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/F/0" class="category">F</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/G/0" class="category">G</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/H/0" class="category">H</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/I/0" class="category">I</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/J/0" class="category">J</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/K/0" class="category">K</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/L/0" class="category">L</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/M/0" class="category">M</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/N/0" class="category">N</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/O/0" class="category">O</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/P/0" class="category">P</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/Q/0" class="category">Q</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/R/0" class="category">R</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/S/0" class="category">S</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/T/0" class="category">T</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/U/0" class="category">U</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/V/0" class="category">V</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/W/0" class="category">W</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/X/0" class="category">X</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/Y/0" class="category">Y</a>
                                    <a href="${pageContext.request.contextPath}/employee/name/Z/0" class="category">Z</a>                                   
                                </div>
                                <div class="card-content table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                            <th>Employee #</th>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Hire Date</th>
                                            <th>Salary</th>
                                            <th>Department</th>
                                        </thead>
                                        <tbody>
                                            <c:forEach begin="0" end= "${ employee.size() }" step="1" varStatus="loopCounter"
                                                items="${employee}" var="emp">
                                            <tr>
                                                <td>
                                                    <a href="${pageContext.request.contextPath}/employee/${emp.getId()}"><c:out value="${emp.getId()}" /></a>
                                                </td>
                                                <td>
                                                    <c:out value="${emp.getFirstName()}" />
                                                </td>
                                                <td>
                                                    <c:out value="${emp.getLastName()}" />
                                                </td>
                                                <td>
                                                    <c:out value="${emp.getHireDate()}" />
                                                </td>
                                                <td>
                                                    <c:out value="${emp.getSalary()}" />
                                                </td>
                                                <td>
                                                    <c:out value="${emp.getDept()}" />
                                                </td>
                                            </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                    <c:if test="${index > 0}">
                                        <a href="/employee/name/${name}/${index-1}">Previous</a>
                                    </c:if>
                                    <c:if test="${index < (count/10)}">
                                        <a href="/employee/name/${name}/${index+1}">Next</a>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="footer">
                <div class="container-fluid">
                    <nav class="pull-left">
                        <ul>
                            <li>
                                <a href="#">
                                    Home
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Company
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Portfolio
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Blog
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <p class="copyright pull-right">
                        &copy;
                        <script>
                            document.write(new Date().getFullYear())
                        </script>
                        <a href="http://localhost:8080">Finsoft</a>, financial software.
                    </p>
                </div>
            </footer>
        </div>
    </div>
</body>
<!--   Core JS Files   -->
<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/material.min.js" type="text/javascript"></script>
<!--  Charts Plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>
<!--  Dynamic Elements plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>
<!--  PerfectScrollbar Library -->
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
<!-- Material Dashboard javascript methods -->
<script src="${pageContext.request.contextPath}/resources/assets/js/material-dashboard.js?v=1.2.0"></script>
<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script src="${pageContext.request.contextPath}/resources/assets/js/demo.js"></script>

</html>