<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Them Cham Cong</title>
</head>
<body>
    <h2>Them Cham Cong</h2>
    <form action="${pageContext.request.contextPath}/chamcong/save" method="post">
        <label>Nhan Vien:</label>
        <select name="maNhanVien">
            <c:forEach var="nv" items="${listNhanVien}">
                <option value="${nv.maNhanVien}">${nv.hoTen}</option>
            </c:forEach>
        </select><br>

        <label>Ngay:</label>
        <input type="date" name="ngay" required><br>

        <label>Gio Vao:</label>
        <input type="time" name="gioVao" required><br>

        <label>Gio Ra:</label>
        <input type="time" name="gioRa" required><br>

        <input type="submit" value="Luu">
    </form>
</body>
</html>
