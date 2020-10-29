package com.cg;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IPLBatsmanTest {

	public static final String BATSMAN_STATS_FILE_PATH = "C:/Users/91824/eclipse-workspace/IPLAnalyser/BatsmanStats.csv";
	
	@Test
	public void givenBatsmanStatsCSV_ShouldReturnList() {
		CSVFileLoader csvFileLoader = new CSVFileLoader();
		List<BatsmanStatsCSV> batsmanList = csvFileLoader.loadCSVFile(BATSMAN_STATS_FILE_PATH,BatsmanStatsCSV.class);
		Assert.assertEquals(101, batsmanList.size());
	}
}
