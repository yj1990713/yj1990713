package team.zy.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.zy.bms.bean.AdminInfo;
import team.zy.bms.dao.UserLoginDao;
import team.zy.bms.service.UserLoginService;

@Service("userService")
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	private UserLoginDao userDao;
	
	@Override
	public List<AdminInfo> selectUserByNameAndPassword(AdminInfo adminInfo) throws Exception{
		
		return userDao.selectUserByNameAndPassword(adminInfo);
		
	}
	
	@Override
	public void insertInfoById(AdminInfo adminInfo) throws Exception {
		
		userDao.insertInfoById(adminInfo);
		
	}

}
