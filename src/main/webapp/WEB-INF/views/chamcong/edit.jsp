<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Chinh sua cham cong</title>
    <style>
        label { display: block; margin-top: 10px; }
        input, select { width: 100%; padding: 5px; margin-top: 5px; }
        button { margin-top: 10px; padding: 8px 12px; }
    </style>
</head>
<body>
    <h2>Chinh sua cham cong</h2>
    <form action="${pageContext.request.contextPath}/chamcong/update" method="post">
        <input type="hidden" name="maChamCong" value="${chamCong.maChamCong}" />
        
        <label>Nhan vien:</label>
        <select name="maNhanVien" required>
            <c:forEach var="nhanVien" items="${listNhanVien}">
                <option value="${nhanVien.maNhanVien}" ${nhanVien.maNhanVien == chamCong.maNhanVien ? 'selected' : ''}>
                    ${nhanVien.hoTen}
                </option>
            </c:forEach>
        </select>
        
        <label>Ngay cham cong:</label>
        <input type="date" name="ngay" value="<fmt:formatDate value='${chamCong.ngay}' pattern='yyyy-MM-dd' />" required />
        
        <label>Gio vao:</label>
        <input type="time" name="gioVao" value="${chamCong.gioVao}" required />
        
        <label>Gio ra:</label>
        <input type="time" name="gioRa" value="${chamCong.gioRa}" required />
        
        <button type="submit">Cap nhat</button>
    </form>
    <br>
    <a href="${pageContext.request.contextPath}/chamcong/list">Quay lai danh sach</a>
</body>
</html>
