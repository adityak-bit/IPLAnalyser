package com.cg;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IPLBowlerTest {

	@Test
	public void givenBowlerStatsCSV_ShouldReturnList() {
		CSVFileLoader csvFileLoader = new CSVFileLoader();
		List<BowlerStatsCSV> bowlerList = csvFileLoader.loadCSVFile();
		Assert.assertEquals(101, bowlerList.size());
	}
}
