package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.CSVFileLoader;
import com.cg.BatsmanStatsCSV;
import com.cg.IPLException;

public class IPLAnalyser {

	BattingDataSorter battingDataSorter = new BattingDataSorter();
	BowlingDataSorter bowlingDataSorter = new BowlingDataSorter();

	public <E> List<E> loadCsvFile(String csvFilePath, Class<E> csvClass) throws IPLException {
		return new CSVFileLoader().loadCSVFile(csvFilePath, csvClass);
	}

	public List<BatsmanStatsCSV> sortBattingData(List<BatsmanStatsCSV> battingList, Comparator<BatsmanStatsCSV> comparator){
		return  battingList.stream().sorted(comparator).collect(Collectors.toList());
	}
	
	public List<BowlerStatsCSV> sortBowlingData(List<BowlerStatsCSV> bowlingList, Comparator<BowlerStatsCSV> comparator){
		return  bowlingList.stream().sorted(comparator).collect(Collectors.toList());
	}
	
	public List<AllRounderStatsCSV> sortAllRounderData(List<BatsmanStatsCSV> battingList, List<BowlerStatsCSV> bowlingList, Comparator<AllRounderStatsCSV> comparator){
		List<AllRounderStatsCSV> allRounderList = getAllRounderPlayers( battingList, bowlingList);
		Collections.reverse(allRounderList);
		return (List<AllRounderStatsCSV>) allRounderList.stream().sorted(comparator).collect(Collectors.toList());
	}

	private List<AllRounderStatsCSV> getAllRounderPlayers(List<BatsmanStatsCSV> battingList, List<BowlerStatsCSV> bowlingList) {
		List<AllRounderStatsCSV> allRounderList = new ArrayList<>();
		battingList.stream().forEach(batsman -> {
			BowlerStatsCSV bowlers = bowlingList.stream()
					.filter(bowler -> bowler.getPlayer().equalsIgnoreCase(batsman.getPlayer())).findFirst()
					.orElse(null);
			if (bowlers != null) {
				allRounderList.add(new AllRounderStatsCSV(batsman.getPlayer(), batsman.getRuns(), bowlers.getWickets(),
						batsman.getAverage(), bowlers.getAverage()));
			}
		});
		return allRounderList;
	}
}
