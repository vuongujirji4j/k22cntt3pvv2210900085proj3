<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h2>Thêm Đơn Nghỉ Phép</h2>

<form:form action="save" modelAttribute="donNghiPhep">
    <table>
        <tr>
            <td>Mã Nhân Viên:</td>
            <td><form:input path="pvv_MaNhanVien" /></td>
        </tr>
        <tr>
            <td>Ngày Bắt Đầu:</td>
            <td><form:input type="date" path="pvv_NgayBatDau" /></td>
        </tr>
        <tr>
            <td>Ngày Kết Thúc:</td>
            <td><form:input type="date" path="pvv_NgayKetThuc" /></td>
        </tr>
        <tr>
            <td>Lý Do:</td>
            <td><form:textarea path="pvv_LyDo" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Lưu" /></td>
        </tr>
    </table>
</form:form>
    