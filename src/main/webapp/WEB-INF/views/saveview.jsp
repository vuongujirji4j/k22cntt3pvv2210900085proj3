<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Them Nhan Vien</title>
</head>
<body>
    <h2>Them Nhan Vien</h2>
    <form action="save" method="post">
        Ho Ten: <input type="text" name="hoTen" required/><br/>
        Ngay Sinh: <input type="date" name="ngaySinh" required/><br/>
        Gioi Tinh: <input type="text" name="gioiTinh" required/><br/>
        dia Chi: <input type="text" name="diaChi" required/><br/>
        So dien Thoai: <input type="text" name="soDienThoai" required/><br/>
        Email: <input type="email" name="email" required/><br/>
        Ma Phong Ban: <input type="number" name="maPhongBan" required/><br/>
        Chuc Vu: <input type="text" name="chucVu" required/><br/>
        Ngay Vao Lam: <input type="date" name="ngayVaoLam" required/><br/>
        <input type="submit" value="Luu"/>
    </form>
</body>
</html>