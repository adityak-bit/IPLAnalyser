package com.cg;

import com.opencsv.bean.CsvBindByName;

public class BowlerStatsCSV {

	@CsvBindByName(column = "POS")
	private int position;
	@CsvBindByName(column = "PLAYER")
	private String player;
	@CsvBindByName(column = "Mat")
	private int matches;
	@CsvBindByName(column = "Inns")
	private int innings;
	@CsvBindByName(column = "Ov")
	private String overs;
	@CsvBindByName(column = "Runs")
	private int runs;
	@CsvBindByName(column = "Wkts")
	private int wickets;
	@CsvBindByName(column = "BBI")
	private int BBI;
	@CsvBindByName(column = "Avg")
	private String average;
	@CsvBindByName(column = "Econ")
	private String economy;
	@CsvBindByName(column = "SR")
	private String strikeRate;
	@CsvBindByName(column = "4w")
	private int fourWickets;
	@CsvBindByName(column = "5w")
	private int fiveWickets;
	public int getPosition() {
		return position;
	}
	public String getPlayer() {
		return player;
	}
	public int getMatch() {
		return matches;
	}
	public int getInnings() {
		return innings;
	}
	public String getOvers() {
		return overs;
	}
	public int getRuns() {
		return runs;
	}
	public int getWickets() {
		return wickets;
	}
	public int getBBI() {
		return BBI;
	}
	public String getAverage() {
		return average;
	}
	public String getEconomy() {
		return economy;
	}
	public String getStrikeRate() {
		return strikeRate;
	}
	public int getFourWickets() {
		return fourWickets;
	}
	public int getFiveWickets() {
		return fiveWickets;
	}
	
}
