<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title> HelloWorld</title>
		<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

		<style>
			.container{
				width: 280px;
				height: 280px;
				
				margin-top: 15%;
			}
			#username{
				margin-top: 25px;
			}
		</style>
	</head>

	<body>
		<div class="container">
			<img src="${pageContext.request.contextPath }/img/logo.png" style="width: 260px ;height: 80px;"/>
			<form action="${pageContext.request.contextPath }/admin/login.action" method="post" id="checkForm">
				<div class="form-group">
					<input type="text" class="form-control" id="adminname" placeholder="请输入管理名" name="loginName" value="admin">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" id="password" placeholder="请输入密码" name="loginPwd" value="admin">
				</div>
				 <p style="color: red; font-size: 15px;">${errorMessage }</p>
				<button type="submit" class="btn btn-success btn-block">提交</button>
			</form>
		</div>

	</body>

</html>