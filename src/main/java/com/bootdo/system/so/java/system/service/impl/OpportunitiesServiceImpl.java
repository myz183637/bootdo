package com.bootdo.system.so.java.system.service.impl;

import com.bootdo.system.so.java.system.dao.OpportunitiesDao;
import com.bootdo.system.so.java.system.domain.OpportunitiesDO;
import com.bootdo.system.so.java.system.service.OpportunitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OpportunitiesServiceImpl implements OpportunitiesService {
	@Autowired
	private OpportunitiesDao opportunitiesDao;
	
	@Override
	public OpportunitiesDO get(Integer soId){
		return opportunitiesDao.get(soId);
	}
	
	@Override
	public List<OpportunitiesDO> list(Map<String, Object> map){
		return opportunitiesDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return opportunitiesDao.count(map);
	}
	
	@Override
	public int save(OpportunitiesDO opportunities){
		return opportunitiesDao.save(opportunities);
	}
	
	@Override
	public int update(OpportunitiesDO opportunities){
		return opportunitiesDao.update(opportunities);
	}
	
	@Override
	public int remove(Integer soId){
		return opportunitiesDao.remove(soId);
	}
	
	@Override
	public int batchRemove(Integer[] soIds){
		return opportunitiesDao.batchRemove(soIds);
	}
}
