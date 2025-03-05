<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>Thêm Ứng Viên</h2>
<form action="save" method="post">
    Họ Tên: <input type="text" name="hoTen" required><br>
    Vị Trí Ứng Tuyển: <input type="text" name="viTriUngTuyen" required><br>
    Trạng Thái: <input type="text" name="trangThai" required><br>
    Kết Quả Phỏng Vấn: <textarea name="ketQuaPhongVan"></textarea><br>
    <input type="submit" value="Lưu">
</form>
