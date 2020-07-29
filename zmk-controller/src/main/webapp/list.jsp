<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.form.js"></script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<a href="add.jsp">
		<input type="button" value="添加">
	</a>
	<table>
		<tr>
			<td>编号</td>
			<td>会议号</td>
			<td>会议名</td>
			<td>开始时间</td>
			<td>结束时间</td>
			<td>会议类型</td>
			<td>选定时间</td>
		</tr>
	 <c:forEach items="${page.list}" var="m">
	 	<tr>
	 		<td>${m.id}</td>
	 		<td>${m.code}</td>
	 		<td>${m.name}</td>
	 		<td>${m.starttime}</td>
	 		<td>${m.endtime}</td>
	 		<td>${m.tname}</td>
	 		<td>${m.creare_time}</td>
	 	</tr>
	 </c:forEach>
	 
	 	<tr>
	 		<td colspan="10">
	 		有${page.pageNum}/${page.pages}页,有${page.total}
	 			<a href="list?pageNum=1">首页</a>
	 			<a href="list?pageNum=${page.pageNum -1}">上一页</a>
	 			<a href="list?pageNum=${page.pageNum +1}">下一页</a>
	 			<a href="list?pageNum=${page.pages}">末页</a>
	 		</td>
	 	</tr>
	</table>
</body>
</html>