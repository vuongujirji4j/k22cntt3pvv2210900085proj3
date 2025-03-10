<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thêm hợp đồng</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Thêm Hợp Đồng</h2>
        <form action="${pageContext.request.contextPath}/hopdong/save" method="post">
            <div class="mb-3">
                <label class="form-label">Mã Nhân Viên</label>
                <select class="form-select" name="pvv_maNhanVien" required>
                    <c:forEach var="nhanVien" items="${listNhanVien}">
                        <option value="${nhanVien.pvv_maNhanVien}">${nhanVien.pvv_maNhanVien} - ${nhanVien.pvv_hoTen}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">Loại Hợp Đồng</label>
                <input type="text" class="form-control" name="pvv_loaiHopDong" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Ngày Bắt Đầu</label>
                <input type="date" class="form-control" name="pvv_ngayBatDau" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Ngày Kết Thúc</label>
                <input type="date" class="form-control" name="pvv_ngayKetThuc">
            </div>
            <div class="mb-3">
                <label class="form-label">Lương Cơ Bản</label>
                <input type="number" class="form-control" name="pvv_luongCoBan" step="0.01">
            </div>
            <div class="mb-3">
                <label class="form-label">Phụ Cấp</label>
                <input type="number" class="form-control" name="pvv_phuCap" step="0.01">
            </div>
            <div class="mb-3">
                <label class="form-label">Trạng Thái</label>
                <select class="form-select" name="pvv_trangThai">
                    <option value="Đang hiệu lực">Đang hiệu lực</option>
                    <option value="Hết hạn">Hết hạn</option>
                </select>
            </div>
            <button type="submit" class="btn btn-success">Lưu</button>
            <a href="${pageContext.request.contextPath}/hopdong/list" class="btn btn-secondary">Hủy</a>
        </form>
    </div>
</body>
</html>
