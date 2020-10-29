package com.cg;

import java.util.Comparator;
import com.cg.BatsmanStatsCSV;

public class BattingDataSorter {

	public final static Comparator<BatsmanStatsCSV> TOP_BATTING_AVG = Comparator.comparing(BatsmanStatsCSV::getAverage);
	public final static Comparator<BatsmanStatsCSV> TOP_STRIKE_RATE = Comparator.comparing(BatsmanStatsCSV::getStrikeRate);
}
