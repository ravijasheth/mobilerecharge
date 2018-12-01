<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome Shopkeeper Please type login name and password </h1>
	<form action="Loginshopkeeper" method="post">
		Mobile no<input type="text" name="mobile_no"> 
		password:<input	type="text" name="password1"> 
		<input type="submit"name="login"> <input type="reset" name="clear">
	</form>
	<a href="index.jsp">back</a>
</body>
</html>