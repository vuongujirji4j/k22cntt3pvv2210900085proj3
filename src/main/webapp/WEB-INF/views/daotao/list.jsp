<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Danh sách Khóa Học</title>
</head>
<body>
    <h2>Danh sách Khóa Học</h2>
    <a href="add">Thêm mới</a>
    <table border="1">
        <tr>
            <th>Tên Khóa Học</th>
            <th>Nội Dung</th>
            <th>Ngày Bắt Đầu</th>
            <th>Ngày Kết Thúc</th>
            <th>Hành động</th>
        </tr>
        <c:forEach var="dt" items="${listDaoTao}">
            <tr>
                <td>${dt.tenKhoaHoc}</td>
                <td>${dt.noiDung}</td>
                <td>${dt.ngayBatDau}</td>
                <td>${dt.ngayKetThuc}</td>
                <td>
                    <a href="edit/${dt.maKhoaHoc}">Sửa</a> |
                    <a href="delete/${dt.maKhoaHoc}" onclick="return confirm('Xác nhận xóa?')">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
