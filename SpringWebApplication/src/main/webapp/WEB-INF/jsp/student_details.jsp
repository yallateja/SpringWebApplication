<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Details !</h2>
<label>First Name :</label> ${student.firstName}<br>
<label>Last Name :</label> ${student.lastName}<br>

<label>Country :</label> ${student.country}<br>
<label>Favourite Language :</label> ${student.favLang}<br>

<label>Operating Systems :</label>

<ul>

		<c:forEach items="${student.operatingSystems}" var="stu">		
		<li>${stu}</li>
		</c:forEach>

</ul>

</body>
</html>