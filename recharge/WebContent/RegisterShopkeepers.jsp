<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterShopkeeper" method="post">
	
		Full Name:<input type="text" id="fullname" name="fullname">
		Fathers Name :<input type="text" id="fathersname" name="fathersname">
		Address::<input type="text" id="address" name="address">
		
		Password:<input type="text" id="password1" name="password1">
		Mobile no::<input type="text" id="mobile_no" name="mobile_no">
		 <input type="submit" value="submit"> <input type="reset" name="clear">
	</form>
	<a href="index.jsp">back</a>
</body>
</html>