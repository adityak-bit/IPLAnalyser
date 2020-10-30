package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IPLAllRounderTest {

	public static final String BATSMAN_STATS_FILE_PATH = "C:/Users/91824/eclipse-workspace/IPLAnalyser/BatsmanStats.csv";
	public static final String BOWLER_STATS_FILE_PATH = "C:/Users/91824/eclipse-workspace/IPLAnalyser/BowlerStats.csv";
	private IPLAnalyser iplAnalyser;
	List<BatsmanStatsCSV> battingList = new ArrayList<BatsmanStatsCSV>();
	List<BowlerStatsCSV> bowlingList = new ArrayList<BowlerStatsCSV>();
	List<AllRounderStatsCSV> sortedList;

	@Before
	public void initialize() throws IPLException {
		iplAnalyser = new IPLAnalyser();
		battingList = iplAnalyser.loadCsvFile(BATSMAN_STATS_FILE_PATH, BatsmanStatsCSV.class);
		bowlingList = iplAnalyser.loadCsvFile(BOWLER_STATS_FILE_PATH, BowlerStatsCSV.class);
		sortedList = new ArrayList<AllRounderStatsCSV>();
	}

	@Test
	public void givenBattingAndBowlingData_ShouldReturnBestAvg() {
	    sortedList = iplAnalyser.sortAllRounderData(battingList, bowlingList, AllRounderDataSorter.BEST_BATTING_AND_BOWLING_AVG);
	    Collections.reverse(sortedList);
		Assert.assertEquals("Shakib Al Hasan", sortedList.get(0).getPlayer());
	}
	
	@Test
	public void givenBattingAndBowlingData_ShouldReturnBestAllRounder() {
		sortedList = iplAnalyser.sortAllRounderData(battingList, bowlingList, AllRounderDataSorter.BEST_ALL_ROUNDER);
	    Collections.reverse(sortedList);
		Assert.assertEquals("Andre Russell", sortedList.get(0).getPlayer());
	}

}
