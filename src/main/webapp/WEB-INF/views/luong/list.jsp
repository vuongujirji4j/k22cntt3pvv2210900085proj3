<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Danh Sách Lương</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
            padding: 20px;
        }
        .container {
            max-width: 900px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
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
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
        .btn {
            background-color: #28a745;
            color: white;
            padding: 8px 12px;
            text-decoration: none;
            border-radius: 5px;
            display: inline-block;
            margin-top: 10px;
        }
        .btn:hover {
            background-color: #218838;
        }
        .action-links a {
            text-decoration: none;
            color: #007bff;
            margin: 0 5px;
        }
        .action-links a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Danh Sách Lương</h2>
        <table>
            <tr>
                <th>Mã Lương</th>
                <th>Mã Nhân Viên</th>
                <th>Tháng</th>
                <th>Năm</th>
                <th>Lương Cơ Bản</th>
                <th>Phụ Cấp</th>
                <th>Khấu Trừ</th>
                <th>Lương Thực Nhận</th>
                <th>Hành Động</th>
            </tr>
            <c:forEach var="l" items="${listLuong}">
                <tr>
                    <td>${l.pvv_maLuong}</td>
                    <td>${l.pvv_maNhanVien}</td>
                    <td>${l.pvv_thang}</td>
                    <td>${l.pvv_nam}</td>
                    <td>${l.pvv_luongCoBan}</td>
                    <td>${l.pvv_phuCap}</td>
                    <td>${l.pvv_khauTru}</td>
                    <td>${l.pvv_luongThucNhan}</td>
                    <td class="action-links">
                        <a href="edit/${l.pvv_maLuong}">Sửa</a> |
                        <a href="delete/${l.pvv_maLuong}" onclick="return confirm('Bạn có chắc chắn muốn xóa?')">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="add" class="btn">+ Thêm Lương</a>
          <a href="${pageContext.request.contextPath}/">Trang Chủ</a>
    </div>
</body>
</html>
