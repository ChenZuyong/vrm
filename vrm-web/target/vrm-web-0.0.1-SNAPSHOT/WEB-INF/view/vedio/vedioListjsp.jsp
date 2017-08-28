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
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<script src="js/jquery-1.12.4.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
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
						<a href="#">视频管理</a>
					</li>
					<li>
						<a href="#">主讲人管理</a>
					</li>
					<li>
						<a href="#">课程管理</a>
					</li>
					<li>
						<a href="#">统计分析</a>
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
		<!--巨木结束-->

		<!--表单开始-->

		<form class="form-inline">
			<button type="submit" class="btn btn-primary" style="margin-right: 20px;">添加课程</button>
			<button type="button" class="btn btn-primary">批量删除</button>

			<div class="pull-right">
				<input type="text" placeholder="视频标题" class="form-control" />
				<select class="form-control">
					<option>请选择主讲人</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
				<select class="form-control">
					<option>请选择课程</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
				<button type="submit" class="btn btn-primary" style="margin-left: 20px;">查询</button>

			</div>
		</form>

		<!--表单结束-->

		<!--表格开始-->

		<table class="table table-hover" >
			<thead>
				<tr>
					<th>
						<div class="checkbox">
							<label>
               <input type="checkbox" value="">
                                               序号
			  </label>
						</div>
					</th>
					<th>名称</th>
					<th>介绍</th>
					<th>讲师</th>
					<th>课程</th>
					<th>时长</th>
					<th>播放次数</th>
					<th>编辑</th>
					<th>删除</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">
						<div class="checkbox">
							<label>
               <input type="checkbox" value="">
                  1
			   </label>
						</div>
					</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>刘欢</td>
					<td>演唱会</td>
					<td>800</td>
					<td>52</td>
					<td><span class="glyphicon glyphicon-edit"></span></td>
					<td><span class="glyphicon glyphicon-trash"></span></td>
				</tr>
				<tr>
					<th scope="row">
						<div class="checkbox">
							<label>
               <input type="checkbox" value="">
                        2
			        </label>
						</div>
					</th>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>邓紫棋</td>
					<td>演唱会</td>
					<td>800</td>
					<td>560</td>
					<td><span class="glyphicon glyphicon-edit"></span></td>
					<td><span class="glyphicon glyphicon-trash"></span></td>
				</tr>
				<tr>
					<th scope="row">
						<div class="checkbox">
							<label>
               <input type="checkbox" value="">
                      3
			        </label>
						</div>
					</th>
					<td>Larry</td>
					<td>@twitter</td>
					<td>周杰</td>
					<td>演唱会</td>
					<td>800</td>
					<td>52</td>
					<td><span class="glyphicon glyphicon-edit"></span></td>
					<td><span class="glyphicon glyphicon-trash"></span></td>
				</tr>
			</tbody>
		</table>
	</div>
	</body>

</html>