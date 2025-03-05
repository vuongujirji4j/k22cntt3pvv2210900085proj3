<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<h2>Danh Sách Ứng Viên</h2>
<a href="add">Thêm Ứng Viên</a>
<table border="1">
    <tr>
        <th>Mã</th>
        <th>Họ Tên</th>
        <th>Vị Trí Ứng Tuyển</th>
        <th>Trạng Thái</th>
        <th>Hành Động</th>
    </tr>
    <c:forEach var="uv" items="${listUngVien}">
        <tr>
            <td>${uv.maUngVien}</td>
            <td>${uv.hoTen}</td>
            <td>${uv.viTriUngTuyen}</td>
            <td>${uv.trangThai}</td>
            <td>
                <a href="edit/${uv.maUngVien}">Sửa</a> |
                <a href="delete/${uv.maUngVien}" onclick="return confirm('Xác nhận xóa?')">Xóa</a>
            </td>
        </tr>
    </c:forEach>
    
</table>
