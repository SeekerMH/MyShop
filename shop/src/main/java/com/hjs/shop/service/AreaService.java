package com.hjs.shop.service;

import java.util.List;

import com.hjs.shop.entity.Area;

public interface AreaService {
	/**
	 * 
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	List<Area> getAreaList();

//	/**
//	 * 
//	 * @param area
//	 * @return
//	 */
//	AreaExecution addArea(Area area);
//
//	/**
//	 * 
//	 * @param area
//	 * @return
//	 */
//	AreaExecution modifyArea(Area area);
//
//	/**
//	 * 
//	 * @param areaId
//	 * @return
//	 */
//	AreaExecution removeArea(long areaId);
//
//	/**
//	 * 
//	 * @param areaIdList
//	 * @return
//	 */
//	AreaExecution removeAreaList(List<Long> areaIdList);
}
