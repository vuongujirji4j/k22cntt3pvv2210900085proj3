<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh Sách Nhân Viên</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            background: white;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background: linear-gradient(135deg, #007bff, #6610f2);
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        a {
            text-decoration: none;
            color: #007bff;
            font-weight: bold;
        }
        a:hover {
            color: #0056b3;
        }
        .btn-add {
            display: block;
            width: fit-content;
            margin: 20px auto;
            padding: 10px 20px;
            background: #28a745;
            color: white;
            text-align: center;
            border-radius: 5px;
            font-weight: bold;
        }
        .btn-add:hover {
            background: #218838;
        }
    </style>
</head>
<body>
    <h2>Danh Sách Nhân Viên</h2>
    <table>
        <tr>
            <th>ID</th><th>Họ Tên</th><th>Email</th><th>Chức Vụ</th><th>Hành Động</th>
        </tr>
        <c:forEach var="nv" items="${list}">
            <tr>
                <td>${nv.pvv_maNhanVien}</td>
                <td>${nv.pvv_hoTen}</td>
                <td>${nv.pvv_email}</td>
                <td>${nv.pvv_chucVu}</td>
                <td>
                    <a href="edit/${nv.pvv_maNhanVien}">Chỉnh Sửa</a> |
                    <a href="delete/${nv.pvv_maNhanVien}" onclick="return confirm('Bạn có chắc muốn xóa?')">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="form" class="btn-add">Thêm Nhân Viên Mới</a>
     <a href="${pageContext.request.contextPath}/">Trang Chủ</a>
</body>
</html>
