<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Đơn Nghỉ Phép</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center text-info">📋 Danh Sách Đơn Nghỉ Phép</h2>

        <div class="d-flex justify-content-between align-items-center mb-3">
            <a href="add" class="btn btn-success">➕ Thêm Đơn Nghỉ Phép</a>
              <a href="${pageContext.request.contextPath}/">Trang Chủ</a>
            <input type="text" id="searchInput" class="form-control w-25" placeholder="🔍 Tìm kiếm...">
        </div>

        <table class="table table-bordered table-hover text-center">
            <thead class="table-dark">
                <tr>
                    <th>Mã Đơn</th>
                    <th>Mã NV</th>
                    <th>Ngày BĐ</th>
                    <th>Ngày KT</th>
                    <th>Lý Do</th>
                    <th>Trạng Thái</th>
                    <th>Hành Động</th>
                </tr>
            </thead>
            <tbody id="tableBody">
                <c:forEach var="don" items="${listDonNghiPhep}">
                    <tr>
                        <td>${don.pvv_MaDon}</td>
                        <td>${don.pvv_MaNhanVien}</td>
                        <td>${don.pvv_NgayBatDau}</td>
                        <td>${don.pvv_NgayKetThuc}</td>
                        <td>${don.pvv_LyDo}</td>
                        <td>
                            <span class="badge 
                                <c:if test='${don.pvv_TrangThai == "Phê duyệt"}'>bg-success</c:if>
                                <c:if test='${don.pvv_TrangThai == "Từ chối"}'>bg-danger</c:if>
                                <c:if test='${don.pvv_TrangThai == "Chờ duyệt"}'>bg-warning</c:if>">
                                ${don.pvv_TrangThai}
                            </span>
                        </td>
                        <td>
                            <a href="edit/${don.pvv_MaDon}" class="btn btn-warning btn-sm">✏️ Sửa</a>
                            <a href="delete/${don.pvv_MaDon}" class="btn btn-danger btn-sm" 
                               onclick="return confirm('Bạn có chắc chắn muốn xóa đơn nghỉ phép này?')">🗑️ Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script>
        document.getElementById("searchInput").addEventListener("keyup", function() {
            let value = this.value.toLowerCase();
            let rows = document.querySelectorAll("#tableBody tr");

            rows.forEach(row => {
                let text = row.textContent.toLowerCase();
                row.style.display = text.includes(value) ? "" : "none";
            });
        });
    </script>
</body>
</html>
