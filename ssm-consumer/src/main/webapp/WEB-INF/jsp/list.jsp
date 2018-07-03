<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center">
		<tr>
			<th>编号</th>
			<th>用户名</th>
			<th>状态</th>
			<th>级别</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.userName}</td>
				<td>${user.userState == 1 ? "正常" : "禁用"}</td>
				<td>${user.userLevel== 1 ? "普通用户" : "管理员"}</td>
				<td><a href="#">修改</a><a href="#">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>