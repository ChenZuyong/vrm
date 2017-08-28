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
	</head>

	<body>

		<nav class="navbar navbar-inverse" style="margin-bottom: 0;">
			<div class="container" >
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
							<a href="#">视频管理</a>
						</li>
						<li>
							<a href="#">主讲人管理</a>
						</li>
						<li>
							<a href="#">课程管理</a>
						</li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

		<!--巨木-->

		<div class="container" >
			<div class="jumbotron" style="padding-top: 2px;padding-bottom: 20px;">
			<h2>编辑主讲人-主讲人管理</h2>
			</div>
		</div>

		<div class="container">
			<form class="form-horizontal">
				<div class="form-group">
					<label for="teacherName" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="teacherName">
					</div>
				</div>
				<div class="form-group">
					<label for="criteria" class="col-sm-2 control-label">职业</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="criteria">
					</div>
				</div>

				<div class="form-group">
					<label for="firguePicture" class="col-sm-2 control-label">头像图片</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="firguePicture">
					</div>
				</div>

				<div class="form-group">
					<label for="introduce" class="col-sm-2 control-label">简介</label>
					<div class="col-sm-6">
						<textarea class="form-control" name="introduce" rows="3"></textarea>
					</div>
				</div>
				<div class="container">
				<button type="submit" class="btn btn-primary col-md-offset-2" style="margin-top: 20px;margin-right: 20px">保存</button>
				<a class="btn btn-default " href="#" role="button" style="margin-top: 20px;;">返回列表</a>
			    </div>
			</form>
			
		</div>
	</body>

</html>