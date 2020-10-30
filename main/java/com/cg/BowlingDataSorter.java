package com.cg;

import java.util.Comparator;

public class BowlingDataSorter {

	public static Comparator<BowlerStatsCSV> TOP_BOWLING_AVG = Comparator.comparing(BowlerStatsCSV::getAverage);
	public static Comparator<BowlerStatsCSV> TOP_BOWLING_STRIKE_RATE = Comparator.comparing(BowlerStatsCSV::getStrikeRate);
	public static Comparator<BowlerStatsCSV> TOP_ECONOMY_RATE = Comparator.comparing(BowlerStatsCSV::getEconomy);

}