<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Student Form !</h2>
<form:form action="processStudent" method="POST" modelAttribute="student">
<label>FirstName :</label><form:input path="firstName"/><br>
<label>LastName :</label><form:input path="lastName"/><br>


<input type="submit"/>

</form:form>

</form>
</body>
</html>