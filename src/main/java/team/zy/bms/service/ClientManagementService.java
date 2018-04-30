package team.zy.bms.service;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

import team.zy.bms.bean.ClientInfo;

public interface ClientManagementService {
		
		public List<ClientInfo> selectUserByUserName(ClientInfo clientInfo,PageBounds page)throws Exception;
		
		public void insertInfoById(ClientInfo clientInfo)throws Exception;
		
		public void updateInfoById(ClientInfo clientInfo)throws Exception;

		
}
