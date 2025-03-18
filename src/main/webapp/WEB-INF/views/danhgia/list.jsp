<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Danh Sách Đánh Giá</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f4f4f4;
        }
        h2 {
            color: #333;
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            background: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #007BFF;
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        a {
            text-decoration: none;
            color: white;
            background-color: #28a745;
            padding: 8px 12px;
            border-radius: 4px;
            display: inline-block;
        }
        a:hover {
            background-color: #218838;
        }
        .delete-link {
            background-color: #dc3545;
        }
        .delete-link:hover {
            background-color: #c82333;
        }
        .add-button {
            display: block;
            width: 200px;
            margin: 10px auto;
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>Danh Sách Đánh Giá</h2>
    <a href="add" class="add-button">Thêm Đánh Giá</a>
      <a href="${pageContext.request.contextPath}/">Trang Chủ</a>
    <table>
        <tr>
            <th>Mã Đánh Giá</th>
            <th>Mã Nhân Viên</th>
            <th>Kỳ Đánh Giá</th>
            <th>Điểm Số</th>
            <th>Nhận Xét</th>
            <th>Hành Động</th>
        </tr>
        <c:forEach var="dg" items="${listDanhGia}">
            <tr>
                <td>${dg.pvv_maDanhGia}</td>
                <td>${dg.pvv_maNhanVien}</td>
                <td>${dg.pvv_kyDanhGia}</td>
                <td>${dg.pvv_diemSo}</td>
                <td>${dg.pvv_nhanXet}</td>
                <td>
                    <a href="edit/${dg.pvv_maDanhGia}">Sửa</a> |
                    <a href="delete/${dg.pvv_maDanhGia}" class="delete-link" onclick="return confirm('Bạn có chắc chắn muốn xóa?')">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
