<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome Admin Please type login name and password </h1>
	<form action="Loginadmin" method="post">
		admin name:<input type="text" name="adminname"> 
		password:<input	type="text" name="password"> 
		<input type="submit"name="login"> <input type="reset" name="clear">
	</form>
	<a href="index.jsp">back</a>
</body>
</html>