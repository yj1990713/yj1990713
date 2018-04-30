package team.zy.bms.service;

import java.util.List;

import team.zy.bms.bean.AdminInfo;

public interface UserLoginService {
		
		public List<AdminInfo> selectUserByNameAndPassword(AdminInfo adminInfo)throws Exception;
		
		public void insertInfoById(AdminInfo adminInfo)throws Exception;
		
}
