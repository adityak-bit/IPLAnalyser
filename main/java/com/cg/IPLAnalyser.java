package com.cg;

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
}
