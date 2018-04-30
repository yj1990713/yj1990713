package team.zy.bms.tools;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

import team.zy.bms.constants.DataConstants;

public class PageHandleUtil{
		
		public static PageBounds createPageBounds(){
			
			return new PageBounds(DataConstants.startIndex / DataConstants.pageSize + 1, DataConstants.pageSize);
		}

}
