package com.cg;

import java.util.Comparator;

public class AllRounderDataSorter {

	public static Comparator<AllRounderStatsCSV> BEST_BATTING_AND_BOWLING_AVG = Comparator
			                                                  .comparing(player -> 
			                                                  player.getAverageRuns() + player.getAverageWickets());
}
