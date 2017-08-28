<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
    <script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
</head>

<body>
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
						<a href="${pageContext.request.contextPath }/admin/showVideoList.action">视频管理</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/speaker/teacherList.action">主讲人管理</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/course/courseList.action">课程管理</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/admin/showDatas.action">统计分析</a>
					</li>
					<li>
						<li>
                         <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>-->
                         <span class="glyphicon glyphicon-log-in">退出</span>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<!--巨木-->
	<div class="container">
		<!--巨木开始-->
		<div class="jumbotron" style="padding-top: 2px; padding-bottom: 20px; margin-left: 300px">
			<h2>视频列表-视频管理</h2>
		</div>
     </div>

    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="height:800px;width: 1000px;"></div>
    <!-- ECharts单文件引入 -->
    <script type="text/javascript">
        // 路径配置
        require.config({
            paths: {
                echarts: 'http://echarts.baidu.com/build/dist'
            }
        });
        
        // 使用
        require(
            [
                'echarts',
                'echarts/chart/bar' // 使用柱状图就加载bar模块，按需加载
            ],
            function (ec) {
                // 基于准备好的dom，初始化echarts图表
                var myChart = ec.init(document.getElementById('main')); 
                
                var option = {
                		
                
                color:['lightblue'],
                    tooltip: {
                        show: true
                    },
                    legend: {
                        data:['播放次数']
                    },
                    xAxis : [
                        {
                            type : 'category',
                            data : [${x}]
                        }
                    ],
                    yAxis : [
                    	
                        {
                            type : 'value'
                        }
                    ],
                    series : [
                        {
                            name:"播放次数",
                            type:"bar",
                            data:[${y}]
                        }
                    ]
                };
        
                // 为echarts对象加载数据 
                myChart.setOption(option); 
            }
        );
    </script>
</body>
</html>