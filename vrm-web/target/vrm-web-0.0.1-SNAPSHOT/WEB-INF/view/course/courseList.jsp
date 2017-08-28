<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>HelloWorld</title>
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>


	<!--导航条内容-->
	<nav class="navbar navbar-inverse" style="margin-bottom: 0;">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-9"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">视频管理系统</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-9">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">视频管理</a></li>
					<li><a href="#">主讲人管理</a></li>
					<li><a href="#">课程管理</a></li>
					<li><a href="#">统计分析</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!--巨木和添加课程-->
	<div class="container">
		<div class="jumbotron" style="padding-top: 3px; padding-bottom: 20px;">
			<h2>课程列表-课程管理</h2>
		</div>
		<button type="submit" class="btn btn-primary">添加课程</button>
	</div>





	<!--表格内容-->
	<div class="container">

		<table class="table table-hover">
			<thead>
				<tr>
					<th>序号</th>
					<th>标题</th>
					<th>学科</th>
					<th>简介</th>
					<th>编辑</th>
					<th>删除</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>C#</td>
					<td>计算机</td>
					<td>谭浩强版</td>
					<td><span class="glyphicon glyphicon-edit"></span></td>
					<td><span class="glyphicon glyphicon-trash"></span></td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
					<td><span class="glyphicon glyphicon-edit"></span></td>
					<td><span class="glyphicon glyphicon-trash"></span></td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td>Larry</td>
					<td>the Bird</td>
					<td>@twitter</td>
					<td><span class="glyphicon glyphicon-edit"></span></td>
					<td><span class="glyphicon glyphicon-trash"></span></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>