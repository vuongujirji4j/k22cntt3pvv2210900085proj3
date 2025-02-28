<html>
<head>
    <title>Chinh Sua Nhan Vien</title>
</head>
<body>
    <h2>Chinh Sua Nhan Vien</h2>
    <form action="/SpringMVCPagination/nhanvien/editsave" method="post">
        <input type="hidden" name="maNhanVien" value="${command.maNhanVien}" />
        Ho Ten: <input type="text" name="hoTen" value="${command.hoTen}" required/><br/>
        Ngay Sinh: <input type="date" name="ngaySinh" value="${command.ngaySinh}" required/><br/>
        Gioi Tinh: <input type="text" name="gioiTinh" value="${command.gioiTinh}" required/><br/>
        Đia Chi: <input type="text" name="diaChi" value="${command.diaChi}" required/><br/>
        So Đien Thoai: <input type="text" name="soDienThoai" value="${command.soDienThoai}" required/><br/>
        Email: <input type="email" name="email" value="${command.email}" required/><br/>
        Ma Phong Ban: <input type="number" name="maPhongBan" value="${command.maPhongBan}" required/><br/>
        Chuc Vu: <input type="text" name="chucVu" value="${command.chucVu}" required/><br/>
        Ngay Vao Lam: <input type="date" name="ngayVaoLam" value="${command.ngayVaoLam}" required/><br/>
        <input type="submit" value="Cap Nhat"/>
    </form>
</body>
</html>