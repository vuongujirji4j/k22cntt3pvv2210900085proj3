<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Thêm Đánh Giá</title>
</head>
<body>
    <h2>Thêm Đánh Giá</h2>
    <form action="save" method="post">
        <label>Kỳ Đánh Giá:</label>
        <input type="text" name="kyDanhGia" required /><br>

        <label>Điểm Số:</label>
        <input type="number" name="diemSo" required /><br>

        <label>Nhận Xét:</label>
        <textarea name="nhanXet"></textarea><br>

        <input type="submit" value="Lưu" />
    </form>
</body>
</html>
