<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chỉnh Sửa Nhân Viên</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
            text-align: center;
        }
        h2 {
            color: #333;
        }
        .form-container {
            background: white;
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        label {
            display: block;
            margin: 10px 0 5px;
            font-weight: bold;
        }
        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background: #007bff;
            color: white;
            font-size: 16px;
            border: none;
            cursor: pointer;
            padding: 10px;
            margin-top: 10px;
        }
        input[type="submit"]:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>
    <h2>Chỉnh Sửa Nhân Viên</h2>
    <div class="form-container">
       <form action="/SpringMVCPagination/nhanvien/editsave" method="post">
    <input type="hidden" name="pvv_maNhanVien" value="${command.pvv_maNhanVien}" />

    <label>Họ Tên:</label>
    <input type="text" name="pvv_hoTen" value="${command.pvv_hoTen}" required />

    <label>Ngày Sinh:</label>
    <input type="date" name="pvv_ngaySinh" value="${command.pvv_ngaySinh}" required />

    <label>Giới Tính:</label>
    <select name="pvv_gioiTinh" required>
        <option value="Nam" ${command.pvv_gioiTinh == 'Nam' ? 'selected' : ''}>Nam</option>
        <option value="Nữ" ${command.pvv_gioiTinh == 'Nữ' ? 'selected' : ''}>Nữ</option>
    </select>

    <label>Địa Chỉ:</label>
    <input type="text" name="pvv_diaChi" value="${command.pvv_diaChi}" required />

    <label>Số Điện Thoại:</label>
    <input type="text" name="pvv_soDienThoai" value="${command.pvv_soDienThoai}" required />

    <label>Email:</label>
    <input type="email" name="pvv_email" value="${command.pvv_email}" required />

    <label>Mã Phòng Ban:</label>
    <input type="number" name="pvv_maPhongBan" value="${command.pvv_maPhongBan}" required />

    <label>Chức Vụ:</label>
    <input type="text" name="pvv_chucVu" value="${command.pvv_chucVu}" required />

    <label>Ngày Vào Làm:</label>
    <input type="date" name="pvv_ngayVaoLam" value="${command.pvv_ngayVaoLam}" required />

    <input type="submit" value="Cập Nhật" />
</form>

    </div>
</body>
</html>
