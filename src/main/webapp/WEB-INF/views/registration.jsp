<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration here</h1>
		<f:form action="save" method="post" modelAttribute="product">
		<pre>
			Prod Id: <f:input path="id"/><br>
			Prod Name: <f:input path="name"/><br>
			Prod Cost: <f:input path="cost"/><br>
			<input type="submit" value="submit">
		</pre>
		</f:form>
		${msg}
		${fail}
		
</body>
</html>