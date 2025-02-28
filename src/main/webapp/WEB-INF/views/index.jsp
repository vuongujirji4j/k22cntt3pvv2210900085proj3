<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang Quản Lý Nhân Sự</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        .container { margin-top: 20px; }
        .footer { text-align: center; padding: 10px; background-color: #f1f1f1; margin-top: 20px; }
    </style>
</head>
<body>

    <!-- Thanh Điều Hướng -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Quản Lý Nhân Sự</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="menu">Menu Chức Năng</a></li>
                    <li class="nav-item"><a class="nav-link" href="view">Danh Sách Nhân Viên</a></li>
                    <li class="nav-item"><a class="nav-link" href="empform">Thêm Nhân Viên</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Nội Dung Chính -->
    <div class="container text-center">
        <h1 class="mt-4">Chào Mừng Đến Trang Quản Lý Nhân Sự</h1>
        <p class="lead">Nền tảng giúp bạn quản lý nhân viên một cách hiệu quả.</p>

        <div class="alert alert-info">
            <c:set var="message" value="Hello, JSP!" />
            <p>${message}</p>
        </div>

        <a href="menu" class="btn btn-primary">Đến Menu Chức Năng</a>
    </div>

    <!-- Footer -->
    <div class="footer">
        <p>&copy; 2024 - Trang Web Quản Lý Nhân Sự</p>
    </div>

</body>
</html>
