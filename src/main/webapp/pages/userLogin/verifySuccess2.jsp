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
<!--2个样式表文件-->  
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/common/menu.css"/>   
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-easyui-1.5.4.4/themes/default/easyui.css"/>  
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-easyui-1.5.4.4/themes/icon.css"/>   
<script src="<%=path%>/resources/js/jquery.js"></script>
<script src="<%=path%>/resources/jquery-easyui-1.5.4.4/jquery.min.js" type="text/javascript" charset="utf-8"></script>  
<script src="<%=path%>/resources/jquery-easyui-1.5.4.4/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>  
<script src="<%=path%>/resources/js/index.js" type="text/javascript" charset="utf-8"></script>  
<title>verifySuccess</title>
</head>
	<body>  
  
        <div class="easyui-layout" data-options="fit:true" style="width: 800px;height: 600px;"> 
            <!--顶部-->  
            <div region="north" style="height: 50px;">  
               <p style="font-size:15px;text-align:center;">欢迎【${map["name"]}】登陆重庆红黑联盟公司管理平台</p>
            </div>  
            <!--左侧菜单start-->  
            <div region="west" title="导航菜单" split="true" style="width: 200px;">  
                <div class="easyui-panel" data-options="fit:true">  
                    <!--手风琴菜单-->  
                    <div class="easyui-accordion" data-options="multiple:true,fit:true"> 
                        <div title="员工管理界面" data-options="iconCls:'icon-ok'" style="overflow:auto;padding:5px;">  
                            <p class="menu-p" style="border:5px";	onclick="addNewTab('name1','')">查询员工</p>  
                            <p onclick="addNewTab('name2','www.jeasyui.net/tutorial/')">新增员工</p>  
                            <p onclick="addNewTab('name3','xxx.xxx.action')">修改员工信息</p>  
                            <p onclick="addNewTab('mane4','xxx.xxxController')">删除员工信息</p>  
                        </div> 
                        <div title="酒店入住信息界面" data-options="iconCls:'icon-ok'" style="overflow:auto;padding:5px;">  
                            <p onclick="addNewTab('name1','www.baidu.com')">百度.1</p>  
                            <p onclick="addNewTab('name2','www.jeasyui.net/tutorial/')">教程2</p>  
                            <p onclick="addNewTab('name3','xxx.xxx.action')">指定地址1</p>  
                            <p onclick="addNewTab('mane4','xxx.xxxController')">指定地址2</p>  
                        </div>  
                        <div title="Java" style="padding:5px;">  
  
                            <p>A programming language is a formal language designed to communicate instructions to a machine, particularly a computer. Programming languages can be used to create programs that control the behavior of a machine and/or to express algorithms precisely.</p>  
                        </div>  
                        <div title="客房信息界面" style="padding:5px;">  
                            <h3 style="color:#0099FF;">Accordion for jQuery</h3>    
            <p>Accordion</p>   
                        </div>  
                        <div title="工资管理界面" style="padding:5px;">  
                            <p>Jae world.</p>  
                        </div>   
                    </div>  
                    <!--手风琴菜单end-->  
                </div>  
            </div>  
            <!--中间主要区域-->  
            <div data-options="region:'center',split:true,fit:true">  
                <div id="mainTabs" class="easyui-tabs" data-options="fit:true">  
                </div>  
            </div>  
            <!--页脚-->  
            <div region="south" style="text-align: center;height: 50px;">  
                <h3>重庆红黑联盟公司</h3>  
            </div>  
  
    </body>  
</html>