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
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>

<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
<script type="text/javascript">
	function add() {
		$.post("add",$("form").serialize(),function(data){
			if(data){
				alert("添加成功");
				location="list";
			}
			else{
				alert("添加失败");
			}
		})
	}
</script>
</head>
<body>
	<form>
		会议号:<input type="text" name="code"><br/>
		会议名:<input type="text" name="name"><br/>
		开始时间:<input type="date" name="starttime"><br/>
		结束时间:<input type="date" name="endtime"><br/>
		选定时间:<input type="date" name="creare_time"><br/>
		会议类型:<select name="tid">
					<option value="1">例会</option>
					<option value="2">日常会议</option>
					<option value="3">交流大会</option>
				</select>
		<input type="button" value="添加" onclick="add()">
	</form>
</body>
</html>