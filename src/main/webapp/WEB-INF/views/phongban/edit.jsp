<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Chỉnh Sửa Phòng Ban</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
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
            color: #343a40;
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
            border: 1px solid #ced4da;
            border-radius: 5px;
        }
        .btn {
            background-color: #007bff;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
            margin-top: 15px;
        }
        .btn:hover {
            background-color: #0056b3;
        }
        .back-link {
            display: block;
            text-align: center;
            margin-top: 15px;
            text-decoration: none;
            color: #28a745;
        }
        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Chỉnh Sửa Phòng Ban</h2>
        <form action="${pageContext.request.contextPath}/phongban/editsave" method="post">
        
<!-- Kiểm tra nếu maPhongBan không có giá trị, đặt mặc định là 0 -->
<input type="hidden" name="pvv_maPhongBan" value="${command.pvv_maPhongBan }" />

            <label >Tên Phòng Ban:</label>
            <input type="text"  name="pvv_tenPhongBan" value="${command.pvv_tenPhongBan}" required/>

            <label >Mô Tả:</label>
            <textarea id="pvv_moTa" name="pvv_moTa">${command.pvv_moTa}</textarea>

            <label>Trưởng Phòng (Mã Nhân Viên):</label>
            <input type="number" id="pvv_truongPhong" name="pvv_truongPhong" value="${command.pvv_truongPhong}"/>

            <input type="submit" value="Cập Nhật" class="btn"/>
 
        </form>

        <a href="${pageContext.request.contextPath}/phongban" class="back-link">← Quay lại danh sách</a>
    </div>
</body>
</html>
