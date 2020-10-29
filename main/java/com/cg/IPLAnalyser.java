package com.cg;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.CSVFileLoader;
import com.cg.BatsmanStatsCSV;
import com.cg.IPLException;

public class IPLAnalyser {

	BattingDataSorter battingDataSorter = new BattingDataSorter();

	public <E> List<E> loadCsvFile(String csvFilePath, Class<E> csvClass) throws IPLException {
		return new CSVFileLoader().loadCSVFile(csvFilePath, csvClass);
	}

	public List<BatsmanStatsCSV> sortBattingData(List<BatsmanStatsCSV> battingList, Comparator<BatsmanStatsCSV> comparator){
		return  battingList.stream().sorted(comparator).collect(Collectors.toList());
	}
}
