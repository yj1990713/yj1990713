<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="<%=path%>/resources/js/jquery.js"></script>
<script src="<%=path%>/js/userLogin/userLogin.js"></script>
<title>退出</title>
</head>
	<body> 
  			系统奔溃，描述如下:<% String errorDesc = (String)request.getAttribute("errorDesc"); %>
 </body>
</html>