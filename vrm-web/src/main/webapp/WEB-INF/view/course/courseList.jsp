<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
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
					<li class="active"><a href="${pageContext.request.contextPath }/admin/showVideoList.action">视频管理</a></li>
					<li><a href="${pageContext.request.contextPath }/speaker/teacherList.action">主讲人管理</a></li>
					<li><a href="${pageContext.request.contextPath }/course/courseList.action">课程管理</a></li>
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
		<a  class="btn btn-primary" style="margin-right: 20px;" href="<c:url value="/course/addCourse.action" />" >添加课程</a>
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
			   <c:forEach var="courses" items="${course}" varStatus="status">
			   ${courses.courseName}
				<tr>
					<td>${status.count}</td>
					<td>${courses.courseName}</td>
					<td>${courses.courseName}</td>
					<td>${courses.courseDescr}</td>
					<td><a class="glyphicon glyphicon-edit" href="<c:url value="/course/editCourse.action?id=${courses.id }" />" ></a></td>
					<td><a class="glyphicon glyphicon-trash" href="<c:url value="/course/deleteCourse.action?id=${courses.id }" />" ></a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>