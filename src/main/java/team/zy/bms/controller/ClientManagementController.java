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

import team.zy.bms.bean.ClientInfo;
import team.zy.bms.constants.DataConstants;
import team.zy.bms.exception.BussinessException;
import team.zy.bms.service.ClientManagementService;
import team.zy.bms.tools.PageHandleUtil;


@Controller
@RequestMapping("clientManagement")
public class ClientManagementController {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientManagementController.class);
	
	@Autowired
	private ClientManagementService clientManagementService;
	
	//添加bsp成员
	@ResponseBody
	@RequestMapping(value="/addClient",method=RequestMethod.POST)
	public JSONObject addClient(ClientInfo clientInfo) throws BussinessException { 
		
		List<ClientInfo> listClient = null;
		
		JSONObject json = new JSONObject();
				
		logger.info("start add...");	
		
		try {
			
			listClient  = clientManagementService.selectUserByUserName(clientInfo,PageHandleUtil.createPageBounds());
			
		} catch (Exception e) {
			
			logger.error("查询出现异常-->"+e);
			
			throw new BussinessException(DataConstants.db_failure_code,DataConstants.db_failure_msg);
			
		}
		
		//账号已经注册过
		if(listClient.size()>0){
			
			json.put(DataConstants.responseCode,DataConstants.ex_failure_code);
			
			json.put(DataConstants.responseMsg,DataConstants.ex_failure_msg);
			
			logger.info("add failure...");
						
			return json;
			
		}
		
				
		try {
			
			clientManagementService.insertInfoById(clientInfo);
			
		} catch (Exception e) {
			
			logger.error("插入数据异常-->"+e);
			
			throw new BussinessException(DataConstants.db_failure_code,DataConstants.db_failure_msg);
			
		}

		json.put(DataConstants.responseCode,DataConstants.success_code);
		
		json.put(DataConstants.responseMsg,DataConstants.success_msg);
		
		logger.info("register success...");
		
		return json;
		
	}
	
	//查询bsp成员
	@ResponseBody
	@RequestMapping(value="/queryClient",method=RequestMethod.POST)
	public List<ClientInfo> queryClient(ClientInfo clientInfo) throws BussinessException { 
		
		List<ClientInfo> listClient = null;
										
		logger.info("start query...");	
		
		try {
		
			listClient = clientManagementService.selectUserByUserName(clientInfo,PageHandleUtil.createPageBounds());
		
		} catch (Exception e) {
			
			logger.error("查询出现异常-->"+e);
						
			throw new BussinessException(DataConstants.db_failure_code,DataConstants.db_failure_msg);
	}
			
		return listClient;
		
	}
	
		//修改bsp成员
		@ResponseBody
		@RequestMapping(value="/updateClient",method=RequestMethod.POST)
		public JSONObject updateClient(ClientInfo clientInfo) throws BussinessException { 
						
			JSONObject json = new JSONObject();
					
			logger.info("start update...");		
					
			try {
				
				clientManagementService.updateInfoById(clientInfo);
				
			} catch (Exception e) {
				
				logger.error("插入数据异常-->"+e);
				
				throw new BussinessException(DataConstants.db_failure_code,DataConstants.db_failure_msg);
				
			}

			json.put(DataConstants.responseCode,DataConstants.success_code);
			
			json.put(DataConstants.responseMsg,DataConstants.success_msg);
			
			logger.info("update success...");
			
			return json;
			
		}
	
	
}