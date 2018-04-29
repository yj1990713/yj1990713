package team.zy.bms.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import team.zy.bms.bean.AdminInfo;
import team.zy.bms.constants.DataConstants;
import team.zy.bms.exception.BussinessException;
import team.zy.bms.service.UserService;


@Controller
@RequestMapping("userLogin")
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
	private UserService userService;
				
	//登陆注册页面
	@RequestMapping("")
	public String init() {
		
		logger.info("enter login method...");	
				
		return "userLogin/login";
		
	}
	
	//账号密码注册
	@ResponseBody
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public JSONObject register(AdminInfo adminInfo) throws BussinessException { 
		
		List<AdminInfo> listUser = null;
		
		JSONObject json = new JSONObject();
				
		logger.info("start register...");	
		
		try {
			
		listUser  = userService.selectUserByNameAndPassword(adminInfo);
			
		} catch (Exception e) {
			
			logger.error("查询出现异常-->"+e);
			
			throw new BussinessException(DataConstants.db_failure_code,DataConstants.db_failure_msg);
			
		}
		
		//账号已经注册过
		if(listUser.size()>0){
			
			json.put(DataConstants.responseCode,DataConstants.ex_failure_code);
			
			json.put(DataConstants.responseMsg,DataConstants.ex_failure_msg);
			
			logger.info("register failure...");
						
			return json;
			
		}
		
				
		try {
			
			userService.insertadminInfoById(adminInfo);
			
		} catch (Exception e) {
			
			logger.error("插入数据异常-->"+e);
			
			throw new BussinessException(DataConstants.db_failure_code,DataConstants.db_failure_msg);
			
		}

		json.put(DataConstants.responseCode,DataConstants.success_code);
		
		json.put(DataConstants.responseMsg,DataConstants.success_msg);
		
		logger.info("register success...");
		
		return json;
		
	}
	
	//登陆账号密码验证
	@ResponseBody
	@RequestMapping(value="/verify",method=RequestMethod.POST)
	public JSONObject verify(AdminInfo adminInfo) throws BussinessException { 
		
		JSONObject json = new JSONObject();

		List<AdminInfo> listUser = null;
										
		logger.info("start verify...");	
		
		try {
		
	    listUser = userService.selectUserByNameAndPassword(adminInfo);
		
		} catch (Exception e) {
			
			logger.error("查询出现异常-->"+e);
						
			throw new BussinessException(DataConstants.db_failure_code,DataConstants.db_failure_msg);
	}
		if(listUser.size()>0){
			
			json.put(DataConstants.responseCode,DataConstants.success_code);
			
			json.put(DataConstants.responseMsg,DataConstants.success_msg);
			
			logger.info("verify success...");		
			
		}else{
			
			json.put(DataConstants.responseCode,DataConstants.failure_code);
			
			json.put(DataConstants.responseMsg,DataConstants.failure_msg);
			
			logger.info("verify failure...");	
		}
		
		return json;
		
	}

	
}