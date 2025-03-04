<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Them Phong Ban</title>
</head>
<body>
    <h2>Them Phong Ban</h2>
    
    <form action="save" method="post">
        Ten Phong Ban: <input type="text" name="tenPhongBan" required/><br/>
        Mo Ta: <textarea name="moTa"></textarea><br/>
        Truong Phong (Ma Nhan Vien): <input type="number" name="truongPhong"/><br/>
        
        <input type="submit" value="Lưu"/>
    </form>
    
    <br/>
    <a href="${pageContext.request.contextPath}/phongban">Quay lai danh sach</a>
</body>
</html>
