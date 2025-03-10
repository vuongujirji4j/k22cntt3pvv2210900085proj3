<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Danh Sách Chấm Công</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding: 20px;
        }
        h2 {
            color: #333;
        }
        .container {
            background: white;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
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
        a {
            text-decoration: none;
            padding: 5px 10px;
            color: white;
            border-radius: 5px;
        }
        .btn-add {
            display: inline-block;
            background-color: #28a745;
            margin-bottom: 10px;
        }
        .btn-edit {
            background-color: #ffc107;
        }
        .btn-delete {
            background-color: #dc3545;
        }
        a:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Danh Sách Chấm Công</h2>
        <a href="${pageContext.request.contextPath}/chamcong/add" class="btn-add">Thêm Chấm Công</a>
        <table>
            <tr>
                <th>Mã Chấm Công</th>
                <th>Nhân Viên</th>
                <th>Ngày</th>
                <th>Giờ Vào</th>
                <th>Giờ Ra</th>
                <th>Hành Động</th>
            </tr>
            <c:forEach var="cc" items="${listChamCong}">
                <tr>
                    <td>${cc.pvv_maChamCong}</td>
                    <td>${cc.pvv_maNhanVien}</td>
                    <td>${cc.pvv_ngay}</td>
                    <td>${cc.pvv_gioVao}</td>
                    <td>${cc.pvv_gioRa}</td>
                    <td>
                        <a href="edit/${cc.pvv_maChamCong}" class="btn-edit">Sửa</a>
                        <a href="delete/${cc.pvv_maChamCong}" class="btn-delete" onclick="return confirm('Bạn có chắc chắn muốn xóa?')">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
