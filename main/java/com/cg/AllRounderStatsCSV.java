package com.cg;

public class AllRounderStatsCSV {

	private String player;
	private int runs;
	private int wickets;
	private double averageRuns;
	private String averageWickets;

	public AllRounderStatsCSV(String player, int runs, int wickets, double averageRuns, String averageWickets) {
		this.player = player;
		this.runs = runs;
		this.wickets = wickets;
		this.averageRuns = averageRuns;
		this.averageWickets = averageWickets;
	}

	public String getPlayer() {
		return player;
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

	public double getAverageRuns() {
		return averageRuns;
	}

	public String getAverageWickets() {
		return averageWickets;
	}
}
