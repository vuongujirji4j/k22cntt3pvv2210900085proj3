</html><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Danh Sach Nhan Vien</title>
</head>
<body>
    <h2>Danh Sach Nhan Vien</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Ho Ten</th><th>Email</th><th>Chuc Vu</th><th>Hanh dong</th>
        </tr>
        <c:forEach var="nv" items="${list}">
            <tr>
                <td>${nv.maNhanVien}</td>
                <td>${nv.hoTen}</td>
                <td>${nv.email}</td>
                <td>${nv.chucVu}</td>
                <td>
                    <a href="edit/${nv.maNhanVien}">Chinh Sua</a> |
                    <a href="delete/${nv.maNhanVien}" onclick="return confirm('Ban co chac muon xoa?')">Xoa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="form">Them Nhan Vien Moi</a>
</body>
</html>