<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thêm Chấm Công</title>
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
        select, input {
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
    <h2>Thêm Chấm Công</h2>
    <div class="form-container">
        <form action="${pageContext.request.contextPath}/chamcong/save" method="post">
            <label>Nhân Viên:</label>
            <select name="pvv_maNhanVien">
                <c:forEach var="nv" items="${listNhanVien}">
                    <option value="${nv.pvv_maNhanVien}">${nv.pvv_hoTen}</option>
                </c:forEach>
            </select>
            
            <label>Ngày:</label>
            <input type="date" name="pvv_ngay" required>
            
            <label>Giờ Vào:</label>
            <input type="time" name="pvv_gioVao" required>
            
            <label>Giờ Ra:</label>
            <input type="time" name="pvv_gioRa" required>
            
            <input type="submit" value="Lưu">
        </form>
    </div>
</body>
</html>
