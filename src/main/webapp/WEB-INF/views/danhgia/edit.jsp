<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Chinh Sua danh Gia</title>
</head>
<body>
    <h2>Chinh Sua Đanh Gia</h2>
    <form action="../update" method="post">
        <input type="hidden" name="maDanhGia" value="${danhGia.maDanhGia}" />

        <label>Nhan Vien:</label>
        <select name="maNhanVien">
            <c:forEach var="nv" items="${listNhanVien}">
                <option value="${nv.maNhanVien}">${nv.hoTen}</option>
            </c:forEach>
        </select><br>

        <label>Ky danh Gia:</label>
        <input type="text" name="kyDanhGia" value="${danhGia.kyDanhGia}" required /><br>

        <label>diem So:</label>
        <input type="number" name="diemSo" value="${danhGia.diemSo}" required /><br>

        <label>Nhan Xet:</label>
        <textarea name="nhanXet">${danhGia.nhanXet}</textarea><br>

        <input type="submit" value="Cap Nhat" />
    </form>
</body>
</html>
