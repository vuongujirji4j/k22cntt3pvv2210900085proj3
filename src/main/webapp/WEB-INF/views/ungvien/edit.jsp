<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>Chỉnh Sửa Ứng Viên</h2>

<form action="${pageContext.request.contextPath}/ungvien/update" method="post">
    <input type="hidden" name="maUngVien" value="${ungVien.maUngVien}">
    
    Họ Tên: <input type="text" name="hoTen" value="${ungVien.hoTen}" required><br>
    Vị Trí Ứng Tuyển: <input type="text" name="viTriUngTuyen" value="${ungVien.viTriUngTuyen}" required><br>
    Trạng Thái: <input type="text" name="trangThai" value="${ungVien.trangThai}" required><br>
    Kết Quả Phỏng Vấn: <textarea name="ketQuaPhongVan">${ungVien.ketQuaPhongVan}</textarea><br>
    
    <input type="submit" value="Cập Nhật">
    <a href="${pageContext.request.contextPath}/ungvien/list">Hủy</a>
</form>
