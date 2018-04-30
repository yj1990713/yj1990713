package team.zy.bms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

import team.zy.bms.bean.ClientInfo;

@Repository
public interface ClientManagementDao {
		
	public List<ClientInfo> selectUserByUserName(@Param("clientInfo")ClientInfo clientInfo,PageBounds page) throws Exception;
	
	public void insertInfoById(@Param("clientInfo")ClientInfo clientInfo) throws Exception;
	
	public void updateInfoById(@Param("clientInfo")ClientInfo clientInfo) throws Exception;


}
