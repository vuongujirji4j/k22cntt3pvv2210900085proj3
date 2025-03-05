<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh Sach danh Gia</title>
</head>
<body>
    <h2>Danh Sach danh Gia</h2>
    <a href="add">Them Đanh Gia</a>
    <table border="1">
        <tr>
            <th>Ma danh Gia</th>
            <th>Ma Nhan Vien</th>
            <th>Ky Đanh Gia</th>
            <th>diem So</th>
            <th>Nhan Xet</th>
            <th>Hanh Đong</th>
        </tr>
        <c:forEach var="dg" items="${listDanhGia}">
            <tr>
                <td>${dg.maDanhGia}</td>
                <td>${dg.maNhanVien}</td>
                <td>${dg.kyDanhGia}</td>
                <td>${dg.diemSo}</td>
                <td>${dg.nhanXet}</td>
                <td>
                    <a href="edit/${dg.maDanhGia}">Sua</a> |
                    <a href="delete/${dg.maDanhGia}">Xoa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
