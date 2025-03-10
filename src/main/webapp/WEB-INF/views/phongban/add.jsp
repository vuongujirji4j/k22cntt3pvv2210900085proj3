<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Thêm Phòng Ban</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
            padding: 20px;
        }
        .container {
            max-width: 500px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
        }
        input, textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ddd;
            border-radius: 5px;
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
            margin-top: 15px;
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
        <h2>Thêm Phòng Ban</h2>
        <form action="save" method="post">
            <label for="pvv_tenPhongBan">Tên Phòng Ban:</label>
            <input type="text" id="pvv_tenPhongBan" name="pvv_tenPhongBan" required/>

            <label for="pvv_moTa">Mô Tả:</label>
            <textarea id="pvv_moTa" name="pvv_moTa"></textarea>

            <label for="pvv_truongPhong">Trưởng Phòng (Mã Nhân Viên):</label>
            <input type="number" id="pvv_truongPhong" name="pvv_truongPhong"/>

            <input type="submit" value="Lưu" class="btn"/>
        </form>

        <a href="${pageContext.request.contextPath}/phongban" class="back-link">← Quay lại danh sách</a>
    </div>
</body>
</html>
