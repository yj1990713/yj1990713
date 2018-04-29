$(function(){
	//登录界面
	$('#login').dialog({
			title:'登陆后台',
			width:300,
			height:180,
			modal:true,
			iconCls:'icon-large-chart',
			buttons:'#btn'
	});
	//登陆账号验证
	$('#name').validatebox({
		required:true,
		missingMessage:'请输入登陆账号',		
	});
	//登陆账号验证
	$('#password').validatebox({
			required:true,
			missingMessage:'请输入登陆密码',
			validType:'length[1,5]',
			invalidMessage:'有效长度1-5'
		});
	//点击登陆
	$('#a1').click(function(){
		if(!$('#name').validatebox('isValid')){
			$('#name').focus();
		}else if(!$('#password').validatebox('isValid')){
			$('#password').focus();
		}else{
			var basePath = "http://localhost:8080/SpringMVC-Maven";
			var user={name:$("#name").val(),password:$("#password").val()};
			 $.ajax({
	             type: "post",
	             url: basePath+"/userLogin/verify",
	             data:user,
	             success: function(data,response,status){
	            	 	            	 	
	            	if(data.length!=0){
	            		
	            		window.location.href = basePath+"/pages/userLogin/verifySuccess.jsp?name="+$('#name').val();
	            		
	            	} else{
	            		
	            		$.messager.alert('登录失败','账号或密码错误','warning',function(){
	            			
	            			$('#password').select();
	            			
	            		});
	            		
	            	}
	            	 
	                      },
	             error : function() {
	            	 
	            	 $.messager.alert('登录失败','系统异常','warning',function(){
	            			
	            			$('#password').select();
	            			
	            		});
	                }
	         });
			
			
		}
	});
});