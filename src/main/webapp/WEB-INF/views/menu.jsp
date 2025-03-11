<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản Lý Nhân Sự</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .navbar {
            background: linear-gradient(135deg, #007bff, #6610f2);
            padding: 0;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .navbar ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            display: flex;
            justify-content: center;
        }
        .navbar li {
            position: relative;
        }
        .navbar li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
            font-size: 16px;
            transition: 0.3s;
        }
        .navbar li a:hover {
            background-color: rgba(255, 255, 255, 0.2);
            border-radius: 5px;
        }
        .navbar li::after {
            content: "";
            position: absolute;
            width: 0;
            height: 2px;
            background: white;
            bottom: 0;
            left: 50%;
            transition: all 0.3s ease;
        }
        .navbar li:hover::after {
            width: 100%;
            left: 0;
        }
        .container {
            max-width: 800px;
            margin: 20px auto;
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <ul>
            <li><a href="${pageContext.request.contextPath}/">Trang Chủ</a></li>
            <li><a href="${pageContext.request.contextPath}/nhanvien/view">Quản Lý Nhân Viên</a></li>
            <li><a href="${pageContext.request.contextPath}/phongban">Quản Lý Phòng Ban</a></li>
            <li><a href="${pageContext.request.contextPath}/chamcong/list">Chấm Công</a></li>
            <li><a href="${pageContext.request.contextPath}/luong/list">Lương</a></li>
            <li><a href="${pageContext.request.contextPath}/danhgia/list">Đánh Giá</a></li>
            <li><a href="${pageContext.request.contextPath}/hopdong/list">Hợp đồng</a></li>
            <li><a href="${pageContext.request.contextPath}/donnghiphep/list">Đơn Nghỉ Phép</a></li>
        </ul>
    </nav>
    <div class="container">
        <h2>Giới thiệu về hệ thống quản lý nhân sự</h2>
        <p>Trong bối cảnh kinh doanh hiện đại, việc quản lý nhân sự không chỉ dừng lại ở việc lưu trữ thông tin cá nhân. Nó bao gồm quản lý tuyển dụng, đào tạo, chấm công, lương thưởng, đánh giá hiệu suất và nhiều hơn thế nữa.</p>
        <p>Một hệ thống quản lý nhân sự toàn diện sẽ giúp:</p>
        <ul>
            <li>Tự động hóa quy trình: Giảm thiểu công việc thủ công, tiết kiệm thời gian.</li>
            <li>Đảm bảo tính chính xác: Hạn chế sai sót trong quản lý dữ liệu.</li>
            <li>Cung cấp dữ liệu kịp thời: Hỗ trợ ra quyết định chiến lược dựa trên dữ liệu thực tế.</li>
            <li>Nâng cao trải nghiệm nhân viên: Tạo môi trường làm việc chuyên nghiệp và minh bạch.</li>
        </ul>
        <h3>Chức năng chính</h3>
        <ul>
            <li>Quản lý hồ sơ nhân viên.</li>
            <li>Quản lý tuyển dụng và ứng viên.</li>
            <li>Chấm công và quản lý thời gian làm việc.</li>
            <li>Quản lý lương thưởng.</li>
            <li>Đánh giá hiệu suất nhân viên.</li>
            <li>Đào tạo và phát triển nhân sự.</li>
            <li>Báo cáo và phân tích dữ liệu nhân sự.</li>
        </ul>
        <h3>Đối tượng người dùng</h3>
        <ul>
            <li><b>Nhân viên:</b> Truy cập thông tin cá nhân, bảng lương, đơn nghỉ phép.</li>
            <li><b>Quản lý:</b> Phê duyệt yêu cầu, đánh giá hiệu suất, quản lý nhóm.</li>
            <li><b>Phòng nhân sự:</b> Quản lý tuyển dụng, đào tạo, lương thưởng.</li>
            <li><b>Ban lãnh đạo:</b> Xem báo cáo tổng quan để đưa ra quyết định chiến lược.</li>
        </ul>
    </div>
</body>
</html>
