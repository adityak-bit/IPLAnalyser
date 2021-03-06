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
	public static Comparator<BatsmanStatsCSV> AVG_WITH_BEST_SR = TOP_BATTING_AVG
			                                                  .thenComparing(BatsmanStatsCSV::getStrikeRate);
	public static Comparator<BatsmanStatsCSV> MAX_RUN_WITH_BEST_AVG = Comparator
			                                                  .comparing(BatsmanStatsCSV::getRuns)
			                                                  .thenComparing(TOP_BATTING_AVG );
	public static Comparator<BatsmanStatsCSV> MAX_HUNDRED_WITH_BEST_AVG = Comparator
			                                                  .comparing(BatsmanStatsCSV::getHundreds)
			                                                  .thenComparing(TOP_BATTING_AVG);
	public static Comparator<BatsmanStatsCSV> ZER0_HALF_OR_FULL_CENTURY_NUT_BEST_AVG = Comparator
			.comparing(batsman -> 
             ( batsman.getHundreds() == 0 && batsman.getFiftys() == 0)?
             batsman.getAverage(): 0.0);
}
