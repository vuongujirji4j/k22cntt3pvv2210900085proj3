<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Thêm Khóa Học</title>
</head>
<body>
    <h2>Thêm Khóa Học</h2>
    <form:form action="save" modelAttribute="daotao" method="post">
        <table>
            <tr>
                <td>Tên Khóa Học:</td>
                <td><form:input path="tenKhoaHoc" required="true"/></td>
            </tr>
            <tr>
                <td>Nội Dung:</td>
                <td><form:textarea path="noiDung" required="true"/></td>
            </tr>
            <tr>
                <td>Ngày Bắt Đầu:</td>
                <td><form:input type="date" path="ngayBatDau" required="true"/></td>
            </tr>
            <tr>
                <td>Ngày Kết Thúc:</td>
                <td><form:input type="date" path="ngayKetThuc" required="true"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Lưu"/>
                    <a href="list">Hủy</a>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
