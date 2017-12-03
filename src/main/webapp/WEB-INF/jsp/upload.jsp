<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="${pageContext.request.contextPath }/product/add.html" enctype="multipart/form-data">
	<input type="text" name="ownerId"><br/><br/>
	<input type="text" name="categoryId"><br/><br/>
	<input type="text" name="description"><br/><br/>
	<input type="text" name="title"><br/><br/> 
	<input type="text" name="quantity"><br/><br/>
	<input type="text" name="postDate"><br/><br/>
	<input type="text" name="expireDate"><br/><br/>
	<input type="text" name="villageId"><br/><br/> 
	
    <input type="file" name="fileuploads" multiple="multiple"/><br/><br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>