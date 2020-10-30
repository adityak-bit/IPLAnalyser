package com.cg;

import java.util.Comparator;

public class BowlingDataSorter {

	public static Comparator<BowlerStatsCSV> TOP_BOWLING_AVG = Comparator.comparing(BowlerStatsCSV::getAverage);

}