<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Quan Ly Nhan Su</title>
    <style>
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }
        li {
            float: left;
        }
        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }
        li a:hover {
            background-color: #111;
        }
    </style>
</head>
<body>
    <ul>
        <li><a href="${pageContext.request.contextPath}/">Trang Chu</a></li>
        <li><a href="${pageContext.request.contextPath}/nhanvien/view">Quan Ly Nhan Vien</a></li>
        <li><a href="${pageContext.request.contextPath}/phongban">Quan Ly Phong Ban</a></li>
        <li><a href="${pageContext.request.contextPath}/chamcong">Cham Cong</a></li>
        <li><a href="${pageContext.request.contextPath}/luong">Luong</a></li>
        <li><a href="${pageContext.request.contextPath}/danhgia">danh Gia</a></li>
        <li><a href="${pageContext.request.contextPath}/daotao">dao Tao</a></li>
        <li><a href="${pageContext.request.contextPath}/ungvien">ung Vien</a></li>
    </ul>
</body>
</html>
