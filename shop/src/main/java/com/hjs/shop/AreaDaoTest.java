package com.hjs.shop;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.hjs.shop.dao.AreaDao;
import com.hjs.shop.entity.Area;

public class AreaDaoTest extends BaseTest {
	@Autowired
	private AreaDao areaDao;

	@Test
	public void testQueryArea() {

		List<Area> areaList = areaDao.queryArea();

		assertEquals(4, areaList.size());
	}
}
