<!-- <a href="empform">Add Employeeb</a>
<a href="view">View Employees </a> -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>trang ly nhan su</title>
</head>
<body>
     <div class="header">
     <h1>chao mung den quan ly nhan su</h1>
     </div>
     <div class="content">
        <%
        //viet ma java
        String message ="hello,jsp!";
        out.print("<p>"+message+"</p>");
        %>
     </div>
     <a href="menu">den menu chuc nang</a>
     <div class="footer">
     <p>&copy; 2024 trang web cua ban</p>
     </div>
</body>
</html>