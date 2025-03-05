<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Them Luong</title>
</head>
<body>
    <h2>Them Luong</h2>
    <form action="save" method="post">
        <label>Ma Nhan Vien:</label>
        <select name="maNhanVien">
            <c:forEach var="nv" items="${listNhanVien}">
                <option value="${nv.maNhanVien}">${nv.hoTen}</option>
            </c:forEach>
        </select>
        <br>

        <label>Thang:</label>
        <input type="number" name="thang" required />
        <br>

        <label>Nam:</label>
        <input type="number" name="nam" required />
        <br>

        <label>Luong Co Ban:</label>
        <input type="text" name="luongCoBan" required />
        <br>

        <label>Phu Cap:</label>
        <input type="text" name="phuCap" required />
        <br>

        <label>Khau Tru:</label>
        <input type="text" name="khauTru" required />
        <br>

        <label>Luong Thuc Nhan:</label>
        <input type="text" name="luongThucNhan" required />
        <br>

        <input type="submit" value="Luu" />
    </form>
    <br>
    <a href="list">Quay lai danh sach</a>
</body>
</html>
