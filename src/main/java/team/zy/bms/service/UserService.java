package team.zy.bms.service;

import java.util.List;

import team.zy.bms.bean.AdminInfo;

public interface UserService {
		
		public List<AdminInfo> selectUserByNameAndPassword(AdminInfo adminInfo)throws Exception;
		
		public void insertadminInfoById(AdminInfo adminInfo)throws Exception;
		
}
