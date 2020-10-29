package com.cg;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IPLBatsmanTest {

	@Test
	public void givenBatsmanStatsCSV_ShouldReturnList() {
		CSVFileLoader csvFileLoader = new CSVFileLoader();
		List<BatsmanStatsCSV> batsmanList = csvFileLoader.loadCSVFile();
		Assert.assertEquals(101, batsmanList.size());
	}
}
