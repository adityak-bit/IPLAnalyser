package com.cg;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IPLBowlerTest {

	public static final String BOWLER_STATS_FILE_PATH = "C:/Users/91824/eclipse-workspace/IPLAnalyser/BowlerStats.csv";
	
	@Test
	public void givenBowlerStatsCSV_ShouldReturnList() {
		CSVFileLoader csvFileLoader = new CSVFileLoader();
		List<BowlerStatsCSV> bowlerList = csvFileLoader.loadCSVFile(BOWLER_STATS_FILE_PATH,BowlerStatsCSV.class);
		Assert.assertEquals(101, bowlerList.size());
	}
}
