<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!--样式表文件-->  
<link rel="stylesheet" type="text/css" href="<%=path%>/css/userLogin/userRegister.css"/>   
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/common/menu.css"/>   
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-easyui-1.5.4.4/themes/default/easyui.css"/>  
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-easyui-1.5.4.4/themes/icon.css"/>   
<title>verifySuccess</title>
</head>
	<body> 
		<div id="frameFirst">
			<div>
				<h1 class="company">红黑联盟有限公司后台注册页面</h1>
			</div>
		<div id="login">
				<p>注册账号：<input type="text" id="name" class="textbox"></p>
			    <p>注册密码：<input type="password" id="password" class="textbox"></p>
		</div>
		<div id="btn">
				
				<a href="#" class="easyui-linkbutton" id="a1">注册</a>
				
				<a href="login.jsp" class="easyui-linkbutton" style="width:70px">返回登陆</a>
		
		</div>
		</div>
<script src="<%=path%>/resources/js/jquery.js"></script>
<script src="<%=path%>/resources/jquery-easyui-1.5.4.4/jquery.min.js" type="text/javascript" charset="utf-8"></script>  
<script src="<%=path%>/resources/jquery-easyui-1.5.4.4/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
<!-- 引入本地界面定义 -->
<script src="<%=path%>/js/userLogin/userRegister.js" type="text/javascript" charset="utf-8"></script>    
 </body>
</html>