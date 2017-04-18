<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<tiles:importAttribute name="javascripts"/>
	<tiles:importAttribute name="stylesheets"/>
	
	<title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
	
    <!-- stylesheets -->
    <c:forEach var="eachCss" items="${stylesheets}">
        <link rel="stylesheet" type="text/css" href="<c:url value="${eachCss}"/>">
    </c:forEach>
    <!-- end stylesheets -->
	
</head>
<body>
	<tiles:insertAttribute name="header" />

	<tiles:insertAttribute name="body" />

	<tiles:insertAttribute name="footer" />
	
	<!-- scripts -->
    <c:forEach var="eachScript" items="${javascripts}">
        <script src="<c:url value="${eachScript}"/>"></script>
    </c:forEach>
    <!-- end scripts -->
</body>
</html>