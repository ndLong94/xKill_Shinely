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
<!-- 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
<!--   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
	
	
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
                <a class="navbar-brand" href="${pageContext.request.contextPath }/VMDetail/default.html" style="color: white;">OpenStack Dashboard</a>
            </div>
            <!-- Top Menu Items -->
            
            
<!--             <ul class="nav navbar-right top-nav" style="background-color: #337ab7"> -->
<!--                 <li class="dropdown"> -->
<!--                     <a style="color: white; background-color: #337ab7"><i class="fa fa-user" style="background-color: #337ab7; color: white;" ></i> Hello!...</a> -->
<!--                 </li> -->
<!--             </ul> -->
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse" style="background-color: #337ab7">
                <ul class="nav navbar-nav side-nav" style="background-color: #f5f5f5;">
                	<li >
                        <a href="${pageContext.request.contextPath }/VMDetail/default.html" style="color: #114070"><i class="fa fa-fw fa-align-justify"></i> Default Tenant</a>
                    </li>
                    <li >
                        <a href="${pageContext.request.contextPath }/VMDetail.html" style="color: #114070"><i class="fa fa-fw fa-desktop"></i> VM Details</a>
                    </li>
                    <li class="active">
                        <a href="${pageContext.request.contextPath }/VMDetail/timeline.html" style="color: #114070"><i class="fa fa-fw fa-clock-o"></i> VM Timeline</a>
                    </li>
                    <li  >
                        <a href="${pageContext.request.contextPath }/Network.html" style="color: #114070"><i class="fa fa-fw fa-rss-square"></i> Network</a>
                    </li>
                    <li  >
                        <a href="${pageContext.request.contextPath }/usage.html" style="color: #114070"><i class="fa fa-fw fa-database"></i> Usage Overview</a>
                    </li>
                    <li  >
                        <a href="${pageContext.request.contextPath }/url.html" style="color: #114070"><i class="fa fa-fw fa-edit"></i> Configuration Page</a>
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
