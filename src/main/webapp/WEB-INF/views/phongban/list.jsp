<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Danh Sách Phòng Ban</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            margin: 20px;
            padding: 20px;
        }
        .container {
            max-width: 800px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #343a40;
        }
        .btn-add {
            display: inline-block;
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            text-decoration: none;
            border-radius: 5px;
            margin-bottom: 15px;
        }
        .btn-add:hover {
            background-color: #218838;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        .btn {
            padding: 5px 10px;
            text-decoration: none;
            color: white;
            border-radius: 5px;
        }
        .btn-edit {
            background-color: #ffc107;
        }
        .btn-edit:hover {
            background-color: #e0a800;
        }
        .btn-delete {
            background-color: #dc3545;
        }
        .btn-delete:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Danh Sách Phòng Ban</h2>
        <a href="phongban/add" class="btn-add">+ Thêm Phòng Ban</a>
        <table>
            <tr>
                <th>ID</th>
                <th>Tên Phòng Ban</th>
                <th>Mô Tả</th>
                <th>Trưởng Phòng</th>
                <th>Hành Động</th>
            </tr>
            <c:forEach items="${list}" var="pb">
                <tr>
                    <td>${pb.pvv_maPhongBan}</td>
                    <td>${pb.pvv_tenPhongBan}</td>
                    <td>${pb.pvv_moTa}</td>
                    <td>${pb.pvv_truongPhong}</td>
                    <td>
                        <a href="phongban/edit/${pb.pvv_maPhongBan}" class="btn btn-edit">✏ Sửa</a>
                        <a href="phongban/delete/${pb.pvv_maPhongBan}" class="btn btn-delete" onclick="return confirm('Xác nhận xóa?')">🗑 Xóa</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
