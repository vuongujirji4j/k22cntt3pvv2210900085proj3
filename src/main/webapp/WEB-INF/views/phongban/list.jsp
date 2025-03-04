<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh Sách Phòng Ban</title>
</head>
<body>
    <h2>Danh Sách Phòng Ban</h2>
    <a href="phongban/add">Them Phong Ban</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Ten Phong Ban</th>
            <th>Mo Ta</th>
            <th>Truong Phong</th>
            <th>Hanh đong</th>
        </tr>
        <c:forEach items="${list}" var="pb">
            <tr>
                <td>${pb.maPhongBan}</td>
                <td>${pb.tenPhongBan}</td>
                <td>${pb.moTa}</td>
                <td>${pb.truongPhong}</td>
                <td>
                    <a href="phongban/edit/${pb.maPhongBan}">Sua</a>
                    <a href="phongban/delete/${pb.maPhongBan}" onclick="return confirm('Xác nhận xóa?')">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
