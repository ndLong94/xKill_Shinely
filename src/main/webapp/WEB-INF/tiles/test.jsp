<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	
	<!-- 	BOOTSTRAP -->
	<link href="${pageContext.servletContext.contextPath }/resources/css/styleTable.css" type="text/css" rel="stylesheet"/>
	<link href="${pageContext.servletContext.contextPath }/resources/css/bootstrap.css" type="text/css" rel="stylesheet"/>
	<link href="${pageContext.servletContext.contextPath }/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
	<link href="${pageContext.servletContext.contextPath }/resources/font-awesome/css/font-awesome.css" type="text/css" rel="stylesheet"/>
	<link href="${pageContext.servletContext.contextPath }/resources/css/sb-admin.css" type="text/css" rel="stylesheet"/>
<%-- 	<link href="${pageContext.servletContext.contextPath }/resources/css/bootstrap-rtl.css" type="text/css" rel="stylesheet"/> --%>
<%-- 	<link href="${pageContext.servletContext.contextPath }/resources/css/bootstrap-rtl.min.css" type="text/css" rel="stylesheet"/> --%>	
<%-- 	<link href="${pageContext.servletContext.contextPath }/resources/css/sb-admin-rtl.css" type="text/css" rel="stylesheet"/> --%>
<%-- 	<link href="${pageContext.servletContext.contextPath }/resources/css/plugins/moriss.css" type="text/css" rel="stylesheet"/> --%>
<%-- 	<link href="${pageContext.servletContext.contextPath }/resources/font-awesome/css/font-awesome.min.css" type="text/css" rel="stylesheet"/> --%>
	
</head>

<body style="background-color: #d0d9e5">

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${pageContext.request.contextPath }/vm-details.html" style="color: white;">OpenStack Dashboard</a>
<%--                 <img src="${pageContext.request.contextPath }/resources/image/logo.png" style="background-color: white;"> --%>
                
            </div>
            <!-- Top Menu Items -->
            
            
<!--             <ul class="nav navbar-right top-nav"> -->
<!--                 <li class="dropdown"> -->
<!--                     <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a> -->
<!--                     <ul class="dropdown-menu message-dropdown"> -->
<!--                         <li class="message-preview"> -->
<!--                             <a href="#"> -->
<!--                                 <div class="media"> -->
<!--                                     <span class="pull-left"> -->
<!--                                         <img class="media-object" src="http://placehold.it/50x50" alt=""> -->
<!--                                     </span> -->
<!--                                     <div class="media-body"> -->
<!--                                         <h5 class="media-heading"><strong>John Smith</strong> -->
<!--                                         </h5> -->
<!--                                         <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p> -->
<!--                                         <p>Lorem ipsum dolor sit amet, consectetur...</p> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </a> -->
<!--                         </li> -->
<!--                         <li class="message-preview"> -->
<!--                             <a href="#"> -->
<!--                                 <div class="media"> -->
<!--                                     <span class="pull-left"> -->
<!--                                         <img class="media-object" src="http://placehold.it/50x50" alt=""> -->
<!--                                     </span> -->
<!--                                     <div class="media-body"> -->
<!--                                         <h5 class="media-heading"><strong>John Smith</strong> -->
<!--                                         </h5> -->
<!--                                         <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p> -->
<!--                                         <p>Lorem ipsum dolor sit amet, consectetur...</p> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </a> -->
<!--                         </li> -->
<!--                         <li class="message-preview"> -->
<!--                             <a href="#"> -->
<!--                                 <div class="media"> -->
<!--                                     <span class="pull-left"> -->
<!--                                         <img class="media-object" src="http://placehold.it/50x50" alt=""> -->
<!--                                     </span> -->
<!--                                     <div class="media-body"> -->
<!--                                         <h5 class="media-heading"><strong>John Smith</strong> -->
<!--                                         </h5> -->
<!--                                         <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p> -->
<!--                                         <p>Lorem ipsum dolor sit amet, consectetur...</p> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </a> -->
<!--                         </li> -->
<!--                         <li class="message-footer"> -->
<!--                             <a href="#">Read All New Messages</a> -->
<!--                         </li> -->
<!--                     </ul> -->
<!--                 </li> -->
<!--                 <li class="dropdown"> -->
<!--                     <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a> -->
<!--                     <ul class="dropdown-menu alert-dropdown"> -->
<!--                         <li> -->
<!--                             <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a> -->
<!--                         </li> -->
<!--                         <li class="divider"></li> -->
<!--                         <li> -->
<!--                             <a href="#">View All</a> -->
<!--                         </li> -->
<!--                     </ul> -->
<!--                 </li> -->
<!--                 <li class="dropdown"> -->
<!--                     <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a> -->
<!--                     <ul class="dropdown-menu"> -->
<!--                         <li> -->
<!--                             <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a> -->
<!--                         </li> -->
<!--                         <li class="divider"></li> -->
<!--                         <li> -->
<!--                             <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a> -->
<!--                         </li> -->
<!--                     </ul> -->
<!--                 </li> -->
<!--             </ul> -->
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse" style="background-color: #337ab7">
                <ul class="nav navbar-nav side-nav" style="background-color: #f5f5f5;">
                    <li >
                        <a href="${pageContext.request.contextPath }/VMDetail.html" style="color: #114070"><i class="fa fa-fw fa-desktop"></i> VM Details</a>
                    </li>
                    <li  >
                        <a href="${pageContext.request.contextPath }/Network.html" style="color: #114070"><i class="fa fa-fw fa-bar-chart-o"></i> Network</a>
                    </li>
                    
                    <li  >
                        <a href="${pageContext.request.contextPath }/url.html" style="color: #114070"><i class="fa fa-fw fa-edit"></i> Configuration Page</a>
                    </li>
                    
                    <li class="active" >
                        <a href="${pageContext.request.contextPath }/test.html" style="color: #114070"><i class="fa fa-fw fa-edit"></i> test</a>
                    </li>
                 
                  
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper" style="padding: 0px">

            <div class="container-fluid" style="background-color: #d0d9e5" style="padding: 0px">

  				 <tiles:insertAttribute name="content" />

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
<!--     <script src="js/jquery.js"></script> -->

<!--     Bootstrap Core JavaScript -->
<!--     <script src="js/bootstrap.min.js"></script> -->

<!--     Morris Charts JavaScript -->
<!--     <script src="js/plugins/morris/raphael.min.js"></script> -->
<!--     <script src="js/plugins/morris/morris.min.js"></script> -->
<!--     <script src="js/plugins/morris/morris-data.js"></script> -->

</body>

</html>
