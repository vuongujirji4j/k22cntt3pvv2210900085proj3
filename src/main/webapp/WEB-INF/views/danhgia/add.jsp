<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Them danh Gia</title>
</head>
<body>
    <h2>Them Đanh Gia</h2>
    <form action="save" method="post">
         <label>Nhan Vien:</label>
        <select name="maNhanVien">
            <c:forEach var="nv" items="${listNhanVien}">
                <option value="${nv.maNhanVien}">${nv.hoTen}</option>
            </c:forEach>
        </select><br>
        
        <label>Ky danh Gia:</label>
        <input type="text" name="kyDanhGia" required /><br>

        <label>diem So:</label>
        <input type="number" name="diemSo" required /><br>

        <label>Nhan Xet:</label>
        <textarea name="nhanXet"></textarea><br>

        <input type="submit" value="Luu" />
    </form>
</body>
</html>
