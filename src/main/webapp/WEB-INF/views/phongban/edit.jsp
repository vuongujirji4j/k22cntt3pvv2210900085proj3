<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Chinh Sua Phong Ban</title>
</head>
<body>
    <h2>Chinh Sua Phong Ban</h2>
    
    <form action="updatePhongBan" method="post">
        <input type="hidden" name="maPhongBan" value="${phongBan.maPhongBan}"/>
        
        Tên Phong Ban: <input type="text" name="tenPhongBan" value="${phongBan.tenPhongBan}" required/><br/>
        Mo Ta: <textarea name="moTa">${phongBan.moTa}</textarea><br/>
        Truong Phong (Ma Nhan Vien): <input type="number" name="truongPhong" value="${phongBan.truongPhong}"/><br/>
        
        <input type="submit" value="Cap Nhat"/>
    </form>
    
    <br/>
    <a href="${pageContext.request.contextPath}/phongban">Quay lai danh sach</a>
</body>
</html>
