<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Chinh Sua Luong</title>
</head>
<body>
    <h2>Chinh Sua Luong</h2>
    <form action="../update" method="post">
        <input type="hidden" name="maLuong" value="${luong.maLuong}" />

        <label>Ma Nhan Vien:</label>
        <select name="maNhanVien">
            <c:forEach var="nv" items="${listNhanVien}">
                <option value="${nv.maNhanVien}" ${nv.maNhanVien == luong.maNhanVien ? 'selected' : ''}>${nv.hoTen}</option>
            </c:forEach>
        </select>
        <br>

        <label>Thang:</label>
        <input type="number" name="thang" value="${luong.thang}" required />
        <br>

        <label>Nam:</label>
        <input type="number" name="nam" value="${luong.nam}" required />
        <br>

        <label>Luong Co Ban:</label>
        <input type="text" name="luongCoBan" value="${luong.luongCoBan}" required />
        <br>

        <label>Phu Cap:</label>
        <input type="text" name="phuCap" value="${luong.phuCap}" required />
        <br>

        <label>Khau Tru:</label>
        <input type="text" name="khauTru" value="${luong.khauTru}" required />
        <br>

        <label>Luong Thuc Nhan:</label>
        <input type="text" name="luongThucNhan" value="${luong.luongThucNhan}" required />
        <br>

        <input type="submit" value="Cap nhat" />
    </form>
    <br>
    <a href="../list">Quay lai danh sach</a>
</body>
</html>
