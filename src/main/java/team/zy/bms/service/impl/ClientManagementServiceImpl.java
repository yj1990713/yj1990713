package team.zy.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

import team.zy.bms.bean.ClientInfo;
import team.zy.bms.dao.ClientManagementDao;
import team.zy.bms.service.ClientManagementService;

@Service("clientManagementService")
public class ClientManagementServiceImpl implements ClientManagementService {
	
	@Autowired
	private ClientManagementDao clientManagementDao;
	
	@Override
	public List<ClientInfo> selectUserByUserName(ClientInfo clientInfo,PageBounds page) throws Exception{
		
		return clientManagementDao.selectUserByUserName(clientInfo,page);
		
	}
	
	@Override
	public void insertInfoById(ClientInfo clientInfo) throws Exception {
		
		clientManagementDao.insertInfoById(clientInfo);
		
	}
	
	@Override
	public void updateInfoById(ClientInfo clientInfo) throws Exception {
		
		clientManagementDao.updateInfoById(clientInfo);
		
	}
}
