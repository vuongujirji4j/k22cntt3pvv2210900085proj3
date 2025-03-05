<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh Sach Cham Cong</title>
</head>
<body>
    <h2>Danh Sach Cham Cong</h2>
    <a href="${pageContext.request.contextPath}/chamcong/add" >Them cham cong</a>
    <table border="1">
        <tr>
            <th>Ma Cham Cong</th>
            <th>Nhan Vien</th>
            <th>Ngay</th>
            <th>Gio Vao</th>
            <th>Gio Ra</th>
            <th>Hanh dong</th>
        </tr>
        <c:forEach var="cc" items="${listChamCong}">
            <tr>
                <td>${cc.maChamCong}</td>
                <td>${cc.maNhanVien}</td>
                <td>${cc.ngay}</td>
                <td>${cc.gioVao}</td>
                <td>${cc.gioRa}</td>
                <td>
                    <a href="edit/${cc.maChamCong}">Sua</a>
                    <a href="delete/${cc.maChamCong}" onclick="return confirm('Xóa?')">Xoa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
