$(function(){
	//注册界面
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
		missingMessage:'注册账号不能为空',		
	});
	//登陆账号验证
	$('#password').validatebox({
			required:true,
			missingMessage:'注册密码不能为空',
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
	             url: basePath+"/userLogin/register",
	             data:user,
	             success: function(data,response,status){
	            	 
	            	var code = data.code;
	            	 	            	 	
	            	if(code=='00000'){

		            	 $.messager.alert('注册成功','恭喜，注册成功','warning',function(){
		            			
		            			
		            		});	
	            	
	            		
	            	} else if(code=='0000'){

		            	 $.messager.alert('注册失败','该账号已存在,请重新输入','warning',function(){
		            			
		            			
		            		});
	            		
	            	}
	            	 
	                      },
	             error : function() {
	            	 
	            	 $.messager.alert('注册失败','系统异常','warning',function(){
	            			
	            		});
	                }
	         });
			
			
		}
	});
});