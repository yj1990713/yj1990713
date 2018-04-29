<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<%	String name = request.getParameter("name");  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!--2个样式表文件-->  
<link rel="stylesheet" type="text/css" href="<%=path%>/css/userLogin/user.css"/>   
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/common/menu.css"/>   
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-easyui-1.5.4.4/themes/default/easyui.css"/>  
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-easyui-1.5.4.4/themes/icon.css"/>   
<script src="<%=path%>/resources/js/jquery.js"></script>
<script src="<%=path%>/resources/jquery-easyui-1.5.4.4/jquery.min.js" type="text/javascript" charset="utf-8"></script>  
<script src="<%=path%>/resources/jquery-easyui-1.5.4.4/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>  
<script src="<%=path%>/js/nav/tree.js" type="text/javascript" charset="utf-8"></script>  
<title>verifySuccess</title>
</head>
	<body class="easyui-layout">  
  			<div data-options="region:'north',title:'North Title',noheader:true,split:true" style="height:60px;background: #666">
  				<div class="logo">红黑联盟后台管理中心</div>
  				<div class="logout">您好，【<%=name%>】| <a href="login.jsp">退出</a></div>
  			</div>
		    <div data-options="region:'south',title:'South Title',noheader:true,split:true" style="height:35px;line-height: 30px;text-align: center"></div>
		   					 @2015-2018 	
		    <div data-options="region:'west',title:'导航',split:true,iconCls:'icon-large-chart'" style="width:180px;padding: 10px">
		    	<ul id="nav">
		    		<li ></li>
		    	
		    	</ul>
		    </div>
		    <div data-options="region:'center'" style="overflow: hidden">
		    	<div id="tabs">
		    		<div title="起始页" iconCls="icon-large-clipart" style="padding:0 10px;display: block;">
		    			欢迎来到红黑联盟管理系统
		    		</div>
		    	</div>
		    </div>
    </body>  
</html>