<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<%-- <nav class="navbar navbar-inverse" style="margin-bottom: 0px;">
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
		<div class="jumbotron" style="padding-top: 2px; padding-bottom: 20px;">
			<h2>视频列表-视频管理</h2>
		</div>
		<!--巨木结束-->
 --%>
		<!--表单开始-->
        
         
         <jsp:include page="/WEB-INF/view/admin/header.jsp">
             <jsp:param value="video" name="formJsp"/>
         </jsp:include>
          
		<form class="form-inline" action="<c:url value="/admin/showVideoList.action" />" method="post">
			<a  class="btn btn-primary" style="margin-right: 20px;" href="<c:url value="/admin/addVideo.action" />" >添加视频</a>
			<button class="btn btn-primary" type="button" onclick="$('#deleteForm')[0].submit()">批量删除<span class="badge" id="countSpan">0</span></button>
           
			<div class="pull-right">
				<input type="text" placeholder="请输入关键字" class="form-control" name = "KeyWord"  />
				
				  <select class="form-control" name = "SearchSpeakerField">
				    
				    	<option value="">请选择讲师</option>
				    <c:forEach var="speakers" items="${ speaker}" >
						<option ${SearchSpeakerField==speakers.id ? "selected":"" } value="${ speakers.id}">${ speakers.speakerName }</option>
					</c:forEach>

				</select>
				<select class="form-control" name = "SearchCourseField">
					 <option value="">请选择课程</option>
					 <c:forEach var="courses" items="${ course}" >
						<option ${SearchCourseField==speakers.id ? "selected":"" } value="${ courses.id}" >${courses.courseName }</option>
					</c:forEach>
				</select>
				<input type="submit" value="查询" />
				
				<!-- <a  class="btn btn-primary" style="margin-right: 20px;" href="" >查询</a> -->

			</div>
		</form>

		<!--表单结束-->

		<!--表格开始-->

	<form action="<c:url value="/admin/multiDelete.action" />" id="deleteForm" >
		<table class="table table-hover" >
			<thead>
				<tr>
					<th>
						<div class="checkbox">
							<label>
               <input type="checkbox"  id = "chooseAll" onclick="selectAll(this)">
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
			    <c:if test="${not empty page.rows }">
			    <c:forEach var="view" items="${page.rows}" varStatus="status">
				<tr>
					<th scope="row">
						<div class="checkbox" >
							<label>
               <input type="checkbox" name = "choose" value = "${view.id }" id="countCheck" onclick="checkDelete(this)">
                  ${status.count }
			   </label>
						</div>
					</th>
					<td>${view.videoTitle}</td>
					<td>${view.videoDescr}</td>
					<td>${view.speakerName}</td>
					<td>${view.courseName}</td>
					<td>${view.videoLength}</td>
					<td>${view.insertTime}</td>
					<td><a class="glyphicon glyphicon-edit" href="<c:url value="/admin/editVideo.action?id=${view.id }" />" ></a></td>
					<td><a class="glyphicon glyphicon-trash" href="<c:url value="/admin/deleteVideo.action?id=${view.id }" />" ></a></td>
					
				</tr>
				</c:forEach>
		        </c:if>
			</tbody>
		</table>
		   </form>
		
	
		<zy:page url="${pageContext.request.contextPath }/admin/showVideoList.action"></zy:page>

	</body>
   <script type="text/javascript">
         var deleteNum = 0;
		function selectAll(ele){
			$("input[name= 'choose']").prop("checked",ele.checked);
			/* var flag = document.getElementById("chooseAll").checked;
			var selectFlag =  document.getElementsByName("choose");
			
			for(var i = 0;i<selectFlag.length; i++){
				
				selectFlag[i].checked = flag;
			} */
			if(ele.checked){
				deleteNum = $("input[name= 'choose']").length;
			}else{
				deleteNum =0;
			}
			$("#countSpan").text(deleteNum);
			if(deleteNum == $("input[name= 'choose']").length){
				$("#chooseAll").prop("checked",true)
			}else{
				$("#chooseAll").prop("checked",false)
			}
		}
		function checkDelete(ele) {
			if(ele.checked){
				deleteNum++;
			}else{
				deleteNum--;
			}
			$("#countSpan").text(deleteNum);
		}
		 
		/*function multiDelete() {
		var checkNum = $("input[name = 'choose']:checked").length;	
		if(checkNum===0){
			alert("请至少选择一项")
			return false;
		}
		
		var checkedList = new Array();
         $("input[name='choose']:checked").each(function(){
             checkedList.push($(this).val());
              href="<c:url value="/admin/multiDelete.action?id=${speakers.id }" />" 
         });
         
        
          $.ajax({
             type:"POST",
             url:"${pageContext.request.contextPath}/admin/multiDelete.action",
             data:{"delitems":checkedList.toString()},
             datatype:"html",
             success:function(data){
                 $("[name='checkbox2']:checkbox").attr("checked",false);
                 art.dialog.tips('删除成功!');
                 setTimeout("location.reload()",1000);//页面刷新
             },
             error:function(data){
                 art.dialog.tips('删除失败!');
             }
         });
         
	} */
</script>

</html>