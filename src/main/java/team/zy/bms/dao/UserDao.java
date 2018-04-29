package team.zy.bms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import team.zy.bms.bean.AdminInfo;

@Repository
public interface UserDao {
		
	public List<AdminInfo> selectUserByNameAndPassword(@Param("adminInfo")AdminInfo adminInfo) throws Exception;
	
	public void insertadminInfoById(@Param("adminInfo")AdminInfo adminInfo) throws Exception;

}
