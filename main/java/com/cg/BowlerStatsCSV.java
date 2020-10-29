package com.cg;

import com.opencsv.bean.CsvBindByName;

public class BowlerStatsCSV {

	@CsvBindByName(column = "POS", required = true)
	int pos;
	@CsvBindByName(column = "PLAYER", required = true)
	String player;
	@CsvBindByName(column = "Mat", required = true)
	int match;
	@CsvBindByName(column = "Inns", required = true)
	int innings;
	@CsvBindByName(column = "Ov", required = true)
	double overs;
	@CsvBindByName(column = "Runs", required = true)
	int runs;
	@CsvBindByName(column = "Wkts", required = true)
	int wickets;
	@CsvBindByName(column = "BBI", required = true)
	int BBI;
	@CsvBindByName(column = "Avg", required = true)
	double avg;
	@CsvBindByName(column = "Econ", required = true)
	double economy;
	@CsvBindByName(column = "SR", required = true)
	double strikeRate;
	@CsvBindByName(column = "4w", required = true)
	int fourWickets;
	@CsvBindByName(column = "5w", required = true)
	int fiveWickets;
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
