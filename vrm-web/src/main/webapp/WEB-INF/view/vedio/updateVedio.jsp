<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<!--导航条-->
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
	<!--巨木-->
	<div class="container">
		<div class="jumbotron" style="padding-top: 2px; padding-bottom: 20px;">
			<h2>编辑视频信息-视频管理</h2>
		</div>
	</div>

	<div class="container" >
		<form class="form-horizontal" action="<c:url value="/admin/editVideo.action?id=${video.id }" />" method="post">
			<div class="form-group">
				<label for="vedioTitle" class="col-sm-2 control-label">视频标题</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="videoTitle"
						value="${video.videoTitle }" >
				</div>
			</div>
			<div class="form-group">
				<label for="teacher" class="col-sm-2 control-label">主讲人</label>
				<div class="col-sm-6">
					<select class="form-control">
						<option value="">请选择讲师</option>
				    <c:forEach var="speakers" items="${ speaker}" >
						<option value="${ speakers.id}" >${ speakers.speakerName }</option>
					</c:forEach>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label for="course" class="col-sm-2 control-label">所属课程</label>
				<div class="col-sm-6">
					<select class="form-control">
						<option value="">请选择课程</option>
					 <c:forEach var="courses" items="${ course}" >
						<option value="${ courses.id}" >${courses.courseName }</option>
					</c:forEach>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label for="videoLength" class="col-sm-2 control-label">视频时长</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="videoLength" 
						value="${video.videoLength }" >
				</div>
			</div>

			<div class="form-group">
				<label for="videoImageUrl" class="col-sm-2 control-label">封面图片</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="videoImageUrl "
						value="${video.videoImageUrl }" >
				</div>
			</div>

			<div class="form-group">
				<label for="videoUrl" class="col-sm-2 control-label">视频播放地址</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="videoUrl"
					  value="${video.videoUrl }">
				</div>
			</div>

			<div class="form-group">
				<label for="videoDescr" class="col-sm-2 control-label">视频简介</label>
				<div class="col-sm-6">
					<textarea class="form-control" name="videoDescr" rows="3" >value="${video.videoDescr }"</textarea>
				</div>
			</div>
			<!--按钮-->
			<div class="container">
				<button type="submit" class="btn btn-primary  col-md-offset-2"
					style="margin-top: 20px; margin-right: 20px">保存</button>
				<a class="btn btn-default " href="javascript:history.go(-1)" role="button"
					style="margin-top: 20px;">返回列表</a>
			</div>

		</form>
	</div>

</body>

</html>