<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="zy" uri = "http://zhiyou100.com/common/" %>
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
				<a class="navbar-brand" href="#">视频管理系统</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
				<ul class="nav navbar-nav">
					<li class="active">
						<a href="${pageContext.request.contextPath }/admin/showVideoList.action">视频管理</a>
					</li>
					<li>
					<a href="${pageContext.request.contextPath }/speaker/teacherList.action">主讲人管理</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/course/courseList.action">课程管理</a>
					</li>
					<li>
						<a href="#">统计分析</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<!--巨木-->
	<div class="container">
		<!--巨木开始-->
		<div class="jumbotron" style="padding-top: 2px; padding-bottom: 20px;">
			<h2>视频列表-视频管理</h2>
		</div>
		<!--巨木结束-->

		<!--表单开始-->

		<form class="form-inline" action="<c:url value="/speaker/teacherList.action" />" method="post">
			<a  class="btn btn-primary" style="margin-right: 20px;" href="<c:url value="/speaker/addSpeaker.action" />" >添加主讲人</a>

			<div class="pull-right">
				名称<input type="text" placeholder="主讲人名称" class="form-control" name="speakerNameKey" />
				职位<input type="text" placeholder="主讲人职位" class="form-control" name="speakerJobKey"/>
				<button type="submit" class="btn btn-primary" style="margin-left: 20px; ">查询</button>

			</div>
		</form>

		<!--表单结束-->

		<!--表格开始-->

		<table class="table table-hover" >
			<thead>
				<tr>
					<th>序号</th>
					<th>名称</th>
					<th>职位</th>
					<th>简介</th>
					<th>编辑</th>
					<th>删除</th>

				</tr>
			</thead>
			<tbody>
			    <c:forEach var="speakers" items="${page.rows}" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${speakers.speakerName }</td>
					<td>${speakers.speakerJob }</td>
					<td>${speakers.speakerDescr }</td>
					<td><a class="glyphicon glyphicon-edit" href="<c:url value="/speaker/editSpeaker.action?id=${speakers.id }" />" ></a></td>
					<td><a class="glyphicon glyphicon-trash" href="<c:url value="/speaker/deleteTeachers.action?id=${speakers.id }" />" ></a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	<zy:page url="${pageContext.request.contextPath }/admin/showVideoList.action"></zy:page>
	</div>
	</body>

</html>