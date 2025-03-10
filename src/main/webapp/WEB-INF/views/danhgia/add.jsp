<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Thêm Đánh Giá</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding: 20px;
        }
        .container {
            background: white;
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        h2 {
            color: #333;
        }
        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
            text-align: left;
        }
        input, select, textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            width: 100%;
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px;
            margin-top: 15px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Thêm Đánh Giá</h2>
        <form action="save" method="post">
            <label>Nhân Viên:</label>
            <select name="pvv_maNhanVien">
                <c:forEach var="nv" items="${listNhanVien}">
                    <option value="${nv.pvv_maNhanVien}">${nv.pvv_hoTen}</option>
                </c:forEach>
            </select>
            
            <label>Kỳ Đánh Giá:</label>
            <input type="text" name="pvv_kyDanhGia" required />
            
            <label>Điểm Số:</label>
            <input type="number" name="pvv_diemSo" required />
            
            <label>Nhận Xét:</label>
            <textarea name="pvv_nhanXet"></textarea>
            
            <button type="submit">Lưu</button>
        </form>
    </div>
</body>
</html>
