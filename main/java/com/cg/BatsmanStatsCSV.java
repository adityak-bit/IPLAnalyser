package com.cg;

import com.opencsv.bean.CsvBindByName;

public class BatsmanStatsCSV {

	@CsvBindByName(column = "POS")
	private int position;
	@CsvBindByName(column = "PLAYER")
	private String player;
	@CsvBindByName(column = "Mat")
	private int matches;
	@CsvBindByName(column = "Inns")
	private int innings;
	@CsvBindByName(column = "NO")
	private int notOuts;
	@CsvBindByName(column = "Runs")
	private int runs;
	@CsvBindByName(column = "HS")
	private String highestScore;
	@CsvBindByName(column = "Avg")
	private String average;
	@CsvBindByName(column = "BF")
	private int ballsFaced;
	@CsvBindByName(column = "SR")
	private String strikeRate;
	@CsvBindByName(column = "100")
	private int hundreds;
	@CsvBindByName(column = "50")
	private int fiftys;
	@CsvBindByName(column = "4s")
	private int fours;
	@CsvBindByName(column = "6s")
	private int sixes;
	public int getPosition() {
		return position;
	}
	public String getPlayer() {
		return player;
	}
	public int getMatches() {
		return matches;
	}
	public int getInnings() {
		return innings;
	}
	public int getNotOuts() {
		return notOuts;
	}
	public int getRuns() {
		return runs;
	}
	public String getHighestScore() {
		return highestScore;
	}
	public double getAverage() {
		if(average.equals("-")) return 0.0;
		return Double.parseDouble(average);
	}
	public int getBallsFaced() {
		return ballsFaced;
	}
	public String getStrikeRate() {
		return strikeRate;
	}
	public int getHundreds() {
		return hundreds;
	}
	public int getFiftys() {
		return fiftys;
	}
	public int getFours() {
		return fours;
	}
	public int getSixes() {
		return sixes;
	}
	
}
