<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chỉnh Sửa Chấm Công</title>
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
        button {
            background: #007bff;
            color: white;
            font-size: 16px;
            border: none;
            cursor: pointer;
            padding: 10px;
            margin-top: 10px;
        }
        button:hover {
            background: #0056b3;
        }
        .back-link {
            display: block;
            margin-top: 15px;
            color: #007bff;
            text-decoration: none;
        }
        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Chỉnh Sửa Chấm Công</h2>
    <div class="form-container">
      <form action="${pageContext.request.contextPath}/chamcong/update" method="post">
        <input type="hidden" name="pvv_maChamCong" value="${chamCong.pvv_maChamCong}" />
        
        <label>Nhan vien:</label>
        <select name="pvv_maNhanVien" required>
            <c:forEach var="pvv_nhanVien" items="${listNhanVien}">
                <option value="${pvv_nhanVien.pvv_maNhanVien}" ${pvv_nhanVien.pvv_maNhanVien == chamCong.pvv_maNhanVien ? 'selected' : ''}>
                    ${pvv_nhanVien.pvv_hoTen}
                </option>
            </c:forEach>
        </select>
        
        <label>Ngay cham cong:</label>
        <input type="date" name="pvv_ngay" value="<fmt:formatDate value='${chamCong.pvv_ngay}' pattern='yyyy-MM-dd' />" required />
        
        <label>Gio vao:</label>
        <input type="time" name="pvv_gioVao" value="${chamCong.pvv_gioVao}" required />
        
        <label>Gio ra:</label>
        <input type="time" name="pvv_gioRa" value="${chamCong.pvv_gioRa}" required />
        
        <button type="submit">Cap nhat</button>
    </form>
        <a class="back-link" href="${pageContext.request.contextPath}/chamcong/list">Quay lại danh sách</a>
    </div>
</body>
</html>
