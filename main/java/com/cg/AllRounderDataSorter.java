package com.cg;

import java.util.Comparator;

public class AllRounderDataSorter {

	public static Comparator<AllRounderStatsCSV> BEST_BATTING_AND_BOWLING_AVG = Comparator
			                                                  .comparing(player -> 
			                                                  player.getAverageRuns() + player.getAverageWickets());
	 public static Comparator<AllRounderStatsCSV> BEST_ALL_ROUNDER = Comparator
			                                                  .comparing(player ->
			                                                  player.getWickets() + player.getRuns());
}
