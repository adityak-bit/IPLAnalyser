package com.cg;

import com.opencsv.bean.CsvBindByName;

public class BowlerStatsCSV {

	@CsvBindByName(column = "POS", required = true)
	private int pos;
	@CsvBindByName(column = "PLAYER", required = true)
	private String player;
	@CsvBindByName(column = "Mat", required = true)
	private int match;
	@CsvBindByName(column = "Inns", required = true)
	private int innings;
	@CsvBindByName(column = "Ov", required = true)
	private double overs;
	@CsvBindByName(column = "Runs", required = true)
	private int runs;
	@CsvBindByName(column = "Wkts", required = true)
	private int wickets;
	@CsvBindByName(column = "BBI", required = true)
	private int BBI;
	@CsvBindByName(column = "Avg", required = true)
	private double avg;
	@CsvBindByName(column = "Econ", required = true)
	private double economy;
	@CsvBindByName(column = "SR", required = true)
	private double strikeRate;
	@CsvBindByName(column = "4w", required = true)
	private int fourWickets;
	@CsvBindByName(column = "5w", required = true)
	private int fiveWickets;
	public int getPos() {
		return pos;
	}
	public String getPlayer() {
		return player;
	}
	public int getMatch() {
		return match;
	}
	public int getInnings() {
		return innings;
	}
	public double getOvers() {
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
	public double getAvg() {
		return avg;
	}
	public double getEconomy() {
		return economy;
	}
	public double getStrikeRate() {
		return strikeRate;
	}
	public int getFourWickets() {
		return fourWickets;
	}
	public int getFiveWickets() {
		return fiveWickets;
	}
	
}
