package com.cg;

import com.opencsv.bean.CsvBindByName;

public class BatsmanStatsCSV {

	@CsvBindByName(column = "POS", required = true)
	private int position;
	@CsvBindByName(column = "PLAYER", required = true)
	private String player;
	@CsvBindByName(column = "Mat", required = true)
	private int matches;
	@CsvBindByName(column = "Inns", required = true)
	private int innings;
	@CsvBindByName(column = "NO", required = true)
	private int notOuts;
	@CsvBindByName(column = "Runs", required = true)
	private int runs;
	@CsvBindByName(column = "HS", required = true)
	private String highestScore;
	@CsvBindByName(column = "Avg", required = true)
	private String average;
	@CsvBindByName(column = "BF", required = true)
	private int ballsFaced;
	@CsvBindByName(column = "SR", required = true)
	private String strikeRate;
	@CsvBindByName(column = "100", required = true)
	private int hundreds;
	@CsvBindByName(column = "50", required = true)
	private int fiftys;
	@CsvBindByName(column = "4s", required = true)
	private int fours;
	@CsvBindByName(column = "6s", required = true)
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
	public String getAverage() {
		return average;
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
