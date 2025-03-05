<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Chỉnh Sửa Đánh Giá</title>
</head>
<body>
    <h2>Chỉnh Sửa Đánh Giá</h2>
    <form action="../update" method="post">
        <input type="hidden" name="maDanhGia" value="${danhGia.maDanhGia}" />

        <label>Mã Nhân Viên:</label>
        <select name="maNhanVien">
            <c:forEach var="nv" items="${listNhanVien}">
                <option value="${nv.maNhanVien}" ${nv.maNhanVien == danhGia.maNhanVien ? 'selected' : ''}>
                    ${nv.tenNhanVien}
                </option>
            </c:forEach>
        </select><br>

        <label>Kỳ Đánh Giá:</label>
        <input type="text" name="kyDanhGia" value="${danhGia.kyDanhGia}" required /><br>

        <label>Điểm Số:</label>
        <input type="number" name="diemSo" value="${danhGia.diemSo}" required /><br>

        <label>Nhận Xét:</label>
        <textarea name="nhanXet">${danhGia.nhanXet}</textarea><br>

        <input type="submit" value="Cập Nhật" />
    </form>
</body>
</html>
