<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Thêm Lương</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
            padding: 20px;
        }
        .container {
            max-width: 500px;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin: auto;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            font-weight: bold;
            margin-top: 10px;
            display: block;
        }
        select, input {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        .btn {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
            margin-top: 15px;
        }
        .btn:hover {
            background-color: #218838;
        }
        .back-link {
            display: block;
            text-align: center;
            margin-top: 10px;
            text-decoration: none;
            color: #007bff;
        }
        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Thêm Lương</h2>
        <form action="save" method="post">
            <label>Mã Nhân Viên:</label>
            <select name="pvv_maNhanVien">
                <c:forEach var="nv" items="${listNhanVien}">
                    <option value="${nv.pvv_maNhanVien}">${nv.pvv_hoTen}</option>
                </c:forEach>
            </select>

            <label>Tháng:</label>
            <input type="number" name="pvv_thang" required />

            <label>Năm:</label>
            <input type="number" name="pvv_nam" required />

            <label>Lương Cơ Bản:</label>
            <input type="text" name="pvv_luongCoBan" required />

            <label>Phụ Cấp:</label>
            <input type="text" name="pvv_phuCap" required />

            <label>Khấu Trừ:</label>
            <input type="text" name="pvv_khauTru" required />

            <label>Lương Thực Nhận:</label>
            <input type="text" name="pvv_luongThucNhan" required />

            <input type="submit" class="btn" value="Lưu" />
        </form>
        <a href="list" class="back-link">Quay lại danh sách</a>
    </div>
</body>
</html>
