package com.hjs.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjs.shop.dao.AreaDao;
import com.hjs.shop.entity.Area;
import com.hjs.shop.service.AreaService;

@Service  
//该注解是表明该service是交给springIOC托管的，当有程序调用AreaService接口时，IOC会自动将AreaServiceImplement的实现的方法注入到Service接口中
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDao areaDao;
	
	@Override
	public List<Area> getAreaList() {
		return areaDao.queryArea();
	}
	
	
}
