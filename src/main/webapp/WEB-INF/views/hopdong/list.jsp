<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Hợp Đồng</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center text-primary">📄 Danh Sách Hợp Đồng</h2>
        
        <div class="d-flex justify-content-between align-items-center mb-3">
            <a href="add" class="btn btn-success">➕ Thêm Hợp Đồng</a>
            <input type="text" id="searchInput" class="form-control w-25" placeholder="🔍 Tìm kiếm...">
        </div>

        <table class="table table-bordered table-hover text-center">
            <thead class="table-dark">
                <tr>
                    <th>Mã HĐ</th>
                    <th>Mã NV</th>
                    <th>Loại HĐ</th>
                    <th>Ngày BĐ</th>
                    <th>Ngày KT</th>
                    <th>Trạng Thái</th>
                    <th>Hành Động</th>
                </tr>
            </thead>
            <tbody id="tableBody">
                <c:forEach var="hd" items="${listHopDong}">
                    <tr>
                        <td>${hd.pvv_maHopDong}</td>
                        <td>${hd.pvv_maNhanVien}</td>
                        <td>${hd.pvv_loaiHopDong}</td>
                        <td>${hd.pvv_ngayBatDau}</td>
                        <td>${hd.pvv_ngayKetThuc}</td>
                        <td>
                            <span class="badge 
                                <c:if test='${hd.pvv_trangThai == "Đang hiệu lực"}'>bg-success</c:if>
                                <c:if test='${hd.pvv_trangThai == "Hết hạn"}'>bg-danger</c:if>
                                <c:if test='${hd.pvv_trangThai == "Chờ duyệt"}'>bg-warning</c:if>">
                                ${hd.pvv_trangThai}
                            </span>
                        </td>
                        <td>
                            <a href="edit/${hd.pvv_maHopDong}" class="btn btn-warning btn-sm">✏️ Sửa</a>
                            <a href="delete/${hd.pvv_maHopDong}" class="btn btn-danger btn-sm" 
                               onclick="return confirm('Bạn có chắc chắn muốn xóa hợp đồng này?')">🗑️ Xóa</a>
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
