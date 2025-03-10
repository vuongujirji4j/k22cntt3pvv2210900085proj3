<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh sửa hợp đồng</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Chỉnh sửa Hợp Đồng</h2>
        <form action="${pageContext.request.contextPath}/hopdong/update" method="post">
            <input type="hidden" name="pvv_maHopDong" value="${hopDong.pvv_maHopDong}">

            <div class="mb-3">
                <label class="form-label">Mã Nhân Viên</label>
                <select class="form-select" name="pvv_maNhanVien" required>
                    <c:forEach var="nhanVien" items="${listNhanVien}">
                        <option value="${nhanVien.pvv_maNhanVien}" 
                            <c:if test="${nhanVien.pvv_maNhanVien == hopDong.pvv_maNhanVien}">selected</c:if>>
                            ${nhanVien.pvv_maNhanVien} - ${nhanVien.pvv_hoTen}
                        </option>
                    </c:forEach>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">Loại Hợp Đồng</label>
                <input type="text" class="form-control" name="pvv_loaiHopDong" value="${hopDong.pvv_loaiHopDong}" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Ngày Bắt Đầu</label>
                <input type="date" class="form-control" name="pvv_ngayBatDau" value="${hopDong.pvv_ngayBatDau}" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Ngày Kết Thúc</label>
                <input type="date" class="form-control" name="pvv_ngayKetThuc" value="${hopDong.pvv_ngayKetThuc}">
            </div>
            <div class="mb-3">
                <label class="form-label">Lương Cơ Bản</label>
                <input type="number" class="form-control" name="pvv_luongCoBan" step="0.01" value="${hopDong.pvv_luongCoBan}">
            </div>
            <div class="mb-3">
                <label class="form-label">Phụ Cấp</label>
                <input type="number" class="form-control" name="pvv_phuCap" step="0.01" value="${hopDong.pvv_phuCap}">
            </div>
            <div class="mb-3">
                <label class="form-label">Trạng Thái</label>
                <select class="form-select" name="pvv_trangThai">
                    <option value="Đang hiệu lực" <c:if test="${hopDong.pvv_trangThai == 'Đang hiệu lực'}">selected</c:if>>Đang hiệu lực</option>
                    <option value="Hết hạn" <c:if test="${hopDong.pvv_trangThai == 'Hết hạn'}">selected</c:if>>Hết hạn</option>
                </select>
            </div>
            <button type="submit" class="btn btn-success">Cập nhật</button>
            <a href="${pageContext.request.contextPath}/hopdong/list" class="btn btn-secondary">Hủy</a>
        </form>
    </div>
</body>
</html>
