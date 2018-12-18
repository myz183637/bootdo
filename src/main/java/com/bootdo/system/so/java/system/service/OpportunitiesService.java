package com.bootdo.system.so.java.system.service;

import com.bootdo.system.so.java.system.domain.OpportunitiesDO;

import java.util.List;
import java.util.Map;

/**
 * 销售机会
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-18 10:12:24
 */
public interface OpportunitiesService {
	
	OpportunitiesDO get(Integer soId);
	
	List<OpportunitiesDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OpportunitiesDO opportunities);
	
	int update(OpportunitiesDO opportunities);
	
	int remove(Integer soId);
	
	int batchRemove(Integer[] soIds);
}
