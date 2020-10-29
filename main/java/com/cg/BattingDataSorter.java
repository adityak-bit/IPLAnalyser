package com.cg;

import java.util.Comparator;
import com.cg.BatsmanStatsCSV;

public class BattingDataSorter {

	public static Comparator<BatsmanStatsCSV> TOP_BATTING_AVG = Comparator.comparing(BatsmanStatsCSV::getAverage);
	public static Comparator<BatsmanStatsCSV> TOP_STRIKE_RATE = Comparator.comparing(BatsmanStatsCSV::getStrikeRate);
	public static Comparator<BatsmanStatsCSV> MAX_SIXES_AND_FOURS = Comparator
			                                                  .comparing
			                                                  (batsman -> batsman.getSixes() + batsman.getFours());
	public static Comparator<BatsmanStatsCSV> BEST_SR_WITH_MAX_SIXES_AND_FOURS = MAX_SIXES_AND_FOURS
			                                                  .thenComparing(BatsmanStatsCSV::getStrikeRate);
}
