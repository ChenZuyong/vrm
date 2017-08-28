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
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.12.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
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

	<div class="container" style="">
		<form class="form-horizontal">
			<div class="form-group">
				<label for="vedioTitle" class="col-sm-2 control-label">视频标题</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="vedioTitle"
						placeholder="web前端入门小程序">
				</div>
			</div>
			<div class="form-group">
				<label for="teacher" class="col-sm-2 control-label">主讲人</label>
				<div class="col-sm-6">
					<select class="form-control">
						<option>赵志丹</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label for="course" class="col-sm-2 control-label">所属课程</label>
				<div class="col-sm-6">
					<select class="form-control">
						<option>请选择课程</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label for="courseTime" class="col-sm-2 control-label">视频时长</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="courseTime"
						placeholder="532）">
				</div>
			</div>

			<div class="form-group">
				<label for="picture" class="col-sm-2 control-label">封面图片</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="picture"
						placeholder="01.jpg">
				</div>
			</div>

			<div class="form-group">
				<label for="vedioHttp" class="col-sm-2 control-label">视频播放地址</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="vedioHttp"
						placeholder="http://www.baidu.com">
				</div>
			</div>

			<div class="form-group">
				<label for="vedioIntroduce" class="col-sm-2 control-label">视频简介</label>
				<div class="col-sm-6">
					<textarea class="form-control" name="vedioIntroduce" rows="3"></textarea>
				</div>
			</div>
			<!--按钮-->
			<div class="container">
				<button type="submit" class="btn btn-primary  col-md-offset-2"
					style="margin-top: 20px; margin-right: 20px">保存</button>
				<a class="btn btn-default " href="#" role="button"
					style="margin-top: 20px;">返回列表</a>
			</div>

		</form>
	</div>

</body>

</html>