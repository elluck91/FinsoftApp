<!doctype html>
<%@ page import = "java.io.*,java.util.*, org.elluck91.finsoft.main.employee.Employee" %>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="../../resources/assets/img/apple-icon.png" />
    <link rel="icon" type="image/png" href="../../resources/assets/img/favicon.png" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Material Dashboard by Creative Tim</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <!-- Bootstrap core CSS     -->
    <link href="../../resources/assets/css/bootstrap.min.css" rel="stylesheet" />
    <!--  Material Dashboard CSS    -->
    <link href="../../resources/assets/css/material-dashboard.css?v=1.2.0" rel="stylesheet" />
    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="../../resources/assets/css/demo.css" rel="stylesheet" />
    <!--     Fonts and icons     -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons" rel='stylesheet'>
</head>

<body>
    <div class="wrapper">
        <div class="sidebar" data-color="purple" data-image="../../resources/assets/img/sidebar-1.jpg">
            <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
            <div class="logo">
                <a href="http://www.creative-tim.com" class="simple-text">
                    Creative Tim
                </a>
            </div>
            <div class="sidebar-wrapper">
                <ul class="nav">
                    <li>
                        <a href="dashboard.html">
                            <i class="material-icons">dashboard</i>
                            <p>Dashboard</p>
                        </a>
                    </li>
                    <li class="active">
                        <a href="./user.html">
                            <i class="material-icons">person</i>
                            <p>User Profile</p>
                        </a>
                    </li>
                    <li>
                        <a href="./table.html">
                            <i class="material-icons">content_paste</i>
                            <p>Table List</p>
                        </a>
                    </li>
                    <li>
                        <a href="./typography.html">
                            <i class="material-icons">library_books</i>
                            <p>Typography</p>
                        </a>
                    </li>
                    <li>
                        <a href="./icons.html">
                            <i class="material-icons">bubble_chart</i>
                            <p>Icons</p>
                        </a>
                    </li>
                    <li>
                        <a href="./maps.html">
                            <i class="material-icons">location_on</i>
                            <p>Maps</p>
                        </a>
                    </li>
                    <li>
                        <a href="./notifications.html">
                            <i class="material-icons text-gray">notifications</i>
                            <p>Notifications</p>
                        </a>
                    </li>
                    <li class="active-pro">
                        <a href="upgrade.html">
                            <i class="material-icons">unarchive</i>
                            <p>Upgrade to PRO</p>
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
                        <a class="navbar-brand" href="#"> Profile </a>
                    </div>
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <a href="#pablo" class="dropdown-toggle" data-toggle="dropdown">
                                    <i class="material-icons">person</i>
                                    <p class="hidden-lg hidden-md">Profile</p>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-8">
                            <div class="card">
                                <div class="card-header" data-background-color="purple">
                                    <h4 class="title">Edit Profile</h4>
                                    <p class="category">Complete your profile</p>
                                </div>
                                <div class="card-content">
                                    <form method="POST" action="/employee">
                                        <div class="row">
                                            <!-- <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Department</label>
                                                    <select class="form-control" id="department" name="department">
                                                        <option>Customer Service</option>
                                                        <option>Development</option>
                                                        <option>Finance</option>
                                                        <option>Human Resources</option>
                                                        <option>Marketing</option>
                                                        <option>Production</option>
                                                        <option>Quality Management</option>
                                                        <option>Research</option>
                                                        <option>Sales</option>
                                                        <option selected="selected"><c:out value="" /></select></option>
                                                </div>
                                            </div> -->
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label for="id" class="control-label">Employee #</label>
                                                    <input type="number" class="form-control" name="id" value="${employee.getEmp_no()}" readonly="readonly">
                                                </div>
                                            </div>

                                            <input type=hidden name="gender" value=${employee.getGender()}>
                                            
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Email</label>
                                                    <input type="text" class="form-control" name="email" value="${employee.getEmail()}">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Title</label>
                                                    <!-- <input type="text" class="form-control" name="department" value=${employee.getDepartment().getDept_no()}> -->
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Salary</label>
                                                    <!-- <input type="text" class="form-control" name="salaries" value=${employee.getSalaries().get(0).getSalary()}> -->
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Fist Name</label>
                                                    <input type="text" class="form-control" name="firstName" value=${employee.getFirstName()}>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Last Name</label>
                                                    <input type="text" class="form-control" name="lastName" value=${employee.getLastName()}>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Birth Date</label>
                                                    <input type="date" class="form-control" name="birthDate" value=${employee.getBirthDate()}>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group label-floating">
                                                    <label class="control-label">Hire Date</label>
                                                    <input type="text" class="form-control" name="hireDate" value=${employee.getHireDate()}>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="form-group">
                                                    <label>About Me</label>
                                                    <div class="form-group label-floating">
                                                        <label class="control-label"> Lamborghini Mercy, Your chick she so thirsty, I'm in that two seat Lambo.</label>
                                                        <textarea class="form-control" rows="5"></textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                          <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>

                                        <input type="submit" class="btn btn-primary pull-right" value="Update Profile"/>
                                        <div class="clearfix"></div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card card-profile">
                                <div class="card-avatar">
                                    <a href="#pablo">
                                        <img class="img" src="../../resources/assets/img/faces/marc.jpg" />
                                    </a>
                                </div>
                                <div class="content">
                                    <h6 class="category text-gray">CEO / Co-Founder</h6>
                                    <h4 class="card-title">Alec Thompson</h4>
                                    <p class="card-content">
                                        Don't be scared of the truth because we need to restart the human foundation in truth And I love you like Kanye loves Kanye I love Rick Owens’ bed design but the back is...
                                    </p>
                                    <a href="#pablo" class="btn btn-primary btn-round">Follow</a>
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
                        <a href="http://www.creative-tim.com">Creative Tim</a>, made with love for a better web
                    </p>
                </div>
            </footer>
        </div>
    </div>
</body>
<!--   Core JS Files   -->
<script src="../../resources/assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="../../resources/assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../../resources/assets/js/material.min.js" type="text/javascript"></script>
<!--  Charts Plugin -->
<script src="../../resources/assets/js/chartist.min.js"></script>
<!--  Dynamic Elements plugin -->
<script src="../../resources/assets/js/arrive.min.js"></script>
<!--  PerfectScrollbar Library -->
<script src="../../resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<!--  Notifications Plugin    -->
<script src="../../resources/assets/js/bootstrap-notify.js"></script>
<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
<!-- Material Dashboard javascript methods -->
<script src="../../resources/assets/js/material-dashboard.js?v=1.2.0"></script>
<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script src="../../resources/assets/js/demo.js"></script>

</html>