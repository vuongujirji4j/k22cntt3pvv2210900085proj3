<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh Sach Luong</title>
</head>
<body>
    <h2>Danh Sach Luong</h2>
    <table border="1">
        <tr>
            <th>Ma Luong</th>
            <th>Ma Nhan Vien</th>
            <th>Thang</th>
            <th>Nam</th>
            <th>Luong Co Ban</th>
            <th>Phu Cap</th>
            <th>Khau Tru</th>
            <th>Luong Thuc Nhan</th>
            <th>Hanh dong</th>
        </tr>
        <c:forEach var="l" items="${listLuong}">
            <tr>
                <td>${l.maLuong}</td>
                <td>${l.maNhanVien}</td>
                <td>${l.thang}</td>
                <td>${l.nam}</td>
                <td>${l.luongCoBan}</td>
                <td>${l.phuCap}</td>
                <td>${l.khauTru}</td>
                <td>${l.luongThucNhan}</td>
                <td>
                    <a href="edit/${l.maLuong}">Sua</a> |
                    <a href="delete/${l.maLuong}">Xoa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="add">Them Luong</a>
</body>
</html>
