<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh Sách Đánh Giá</title>
</head>
<body>
    <h2>Danh Sách Đánh Giá</h2>
    <a href="add">Thêm Đánh Giá</a>
    <table border="1">
        <tr>
            <th>Mã Đánh Giá</th>
            <th>Mã Nhân Viên</th>
            <th>Kỳ Đánh Giá</th>
            <th>Điểm Số</th>
            <th>Nhận Xét</th>
            <th>Hành Động</th>
        </tr>
        <c:forEach var="dg" items="${listDanhGia}">
            <tr>
                <td>${dg.maDanhGia}</td>
                <td>${dg.maNhanVien}</td>
                <td>${dg.kyDanhGia}</td>
                <td>${dg.diemSo}</td>
                <td>${dg.nhanXet}</td>
                <td>
                    <a href="edit/${dg.maDanhGia}">Sửa</a> |
                    <a href="delete/${dg.maDanhGia}">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
