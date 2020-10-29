package com.cg;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IPLBatsmanTest {

	public static final String BATSMAN_STATS_FILE_PATH = "C:/Users/91824/eclipse-workspace/IPLAnalyser/BatsmanStats.csv";
	
	private IPLAnalyser iplAnalyser;
	List<BatsmanStatsCSV> battingList = new ArrayList<BatsmanStatsCSV>();
	List<BatsmanStatsCSV> sortedList;

	@Before
	public void initialize() throws IPLException {
		iplAnalyser = new IPLAnalyser();
		battingList = iplAnalyser.loadCsvFile(BATSMAN_STATS_FILE_PATH, BatsmanStatsCSV.class);
		sortedList = new ArrayList<BatsmanStatsCSV>();
	}
	
	@Test
	public void givenBatsmanStatsCSV_ShouldReturnList() throws IPLException {
		Assert.assertEquals(101, battingList.size());
	}
	
	@Test
	public void givenBattingData_shouldReturnTopBattingAvg() {
		sortedList = iplAnalyser.sortBattingData(battingList, BattingDataSorter.TOP_BATTING_AVG);
		Assert.assertEquals("MS Dhoni", sortedList.get(100).getPlayer());
	}
	
	@Test
	public void givenBattingData_shouldReturnTopStrikingRate() {
		sortedList = iplAnalyser.sortBattingData(battingList, BattingDataSorter.TOP_STRIKING_RATE);
		Assert.assertEquals("Ishant Sharma", sortedList.get(100).getPlayer());
	}
}
