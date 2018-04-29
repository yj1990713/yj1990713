package team.zy.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.zy.bms.bean.AdminInfo;
import team.zy.bms.dao.UserDao;
import team.zy.bms.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<AdminInfo> selectUserByNameAndPassword(AdminInfo adminInfo) throws Exception{
		
		return userDao.selectUserByNameAndPassword(adminInfo);
		
	}
	
	@Override
	public void insertadminInfoById(AdminInfo adminInfo) throws Exception {
		
		userDao.insertadminInfoById(adminInfo);
		
	}

}
