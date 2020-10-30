package com.cg;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IPLBowlerTest {

	public static final String BOWLER_STATS_FILE_PATH = "C:/Users/91824/eclipse-workspace/IPLAnalyser/BowlerStats.csv";
	
	private IPLAnalyser iplAnalyser;
	List<BowlerStatsCSV> bowlingList = new ArrayList<BowlerStatsCSV>();
	List<BowlerStatsCSV> sortedList;

	@Before
	public void initialize() throws IPLException {
		iplAnalyser = new IPLAnalyser();
		bowlingList = iplAnalyser.loadCsvFile(BOWLER_STATS_FILE_PATH, BowlerStatsCSV.class);
		sortedList = new ArrayList<BowlerStatsCSV>();
	}
	@Test
	public void givenBowlerStatsCSV_ShouldReturnList() throws IPLException {
		Assert.assertEquals(101, bowlingList.size());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopBowlingAvg() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_BOWLING_AVG);
		Assert.assertEquals("Anukul Roy", sortedList.get(15).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopStrikeRate() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_BOWLING_STRIKE_RATE);
		Assert.assertEquals("Ish Sodhi", sortedList.get(15).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopEconomyRate() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_ECONOMY_RATE);
		Assert.assertEquals("Mayank Markande", sortedList.get(100).getPlayer());
	}
	
	@Test
	public void givenBowlingData_shouldReturnTopStrikeRateWith5And4Wickets() {
		sortedList = iplAnalyser.sortBowlingData(bowlingList, BowlingDataSorter.TOP_SR_WITH_5W_AND_4W);
		Assert.assertEquals("Krishnappa Gowtham", sortedList.get(98).getPlayer());
	}
}
