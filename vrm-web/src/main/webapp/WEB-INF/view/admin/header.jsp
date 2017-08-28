<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	</head>
	<!--导航条-->
	<nav class="navbar navbar-inverse" style="margin-bottom: 0px;">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-9" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
				<a class="navbar-brand" href="${pageContext.request.contextPath }/admin/showVideoList.action">视频管理系统</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
				<ul class="nav navbar-nav">
					<li class="active">
					<c:if test='${param.formJsp == "video" }'>class = "active"</c:if><a href="${pageContext.request.contextPath }/speaker/teacherList.action">视频管理</a>
					</li>
					<li>
					<c:if test='${param.formJsp == "speaker" }'>class = "active"</c:if><a href="${pageContext.request.contextPath }/speaker/teacherList.action">主讲人管理</a>
					</li>
					<li>
					<c:if test='${param.formJsp == "course" }'>class = "active"</c:if><a href="${pageContext.request.contextPath }/course/courseList.action">课程管理</a>
					</li>
					<li>
					<c:if test='${param.formJsp == "datas" }'>class = "active"</c:if><a href="${pageContext.request.contextPath }/admin/showDatas.action">统计分析</a>
					</li>
					<li>
						<li>
                         <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>-->
                         <span class="glyphicon glyphicon-log-in">退出</span>
        
					</li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<!--巨木-->
	<div class="container">
		<!--巨木开始-->
		<div class="jumbotron" style="padding-top: 2px; padding-bottom: 20px;">
			<h2>视频列表-视频管理</h2>
		</div>
	</div>
	</body>
</html>
