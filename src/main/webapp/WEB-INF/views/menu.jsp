<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu Chuc Nang</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        .menu-container {
            max-width: 600px;
            margin: 50px auto;
            text-align: center;
        }
        .menu-list {
            list-style: none;
            padding: 0;
        }
        .menu-list li {
            margin: 10px 0;
        }
    </style>
</head>
<body>

    <div class="menu-container">
        <h2>Chuc Nang</h2>
        <ul class="menu-list">
            <c:forEach items="${menuItems}" var="item">
                <li>
                    <a class="btn btn-primary w-100" href="${item.url}">
                        ${item.name}
                    </a>
                </li>
            </c:forEach>
        </ul>
    </div>

</body>
</html>
