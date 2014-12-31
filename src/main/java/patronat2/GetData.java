package patronat2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class GetData implements Comparable{
	
	private String s1 = "";
	private double sumOfValues = 0;
		
	/*
	 * do tablicy CurrencyTable wczytam wartosci z pliku dane.txt
	 */
	ArrayList<Double> CurrencyTable = new ArrayList<Double>();
	
	/*
	 * do tablicy sorted kopiuje wartosci z tablicy CurrencyTable i wykonuje na nich sortowanie
	 */
	ArrayList<Double> sortedCurrencyTable = new ArrayList<Double>();
	
	public int getSizeofCurrencyTable() {
		return CurrencyTable.size();
	}
	
	public double getValueFromCurrencyTable(int i) {
		return CurrencyTable.get(i);
	}
	
	public double getValueFromSortedTable(int i) {
		return sortedCurrencyTable.get(i);
	}
	
	public void sortCurrencyTable() {
		sortedCurrencyTable = CurrencyTable;
		Collections.sort(sortedCurrencyTable);
	}
	
	public double calculateArithmeticMean() {
		return sumOfValues / CurrencyTable.size();
	}
	
	public double calculateSum() {
		return sumOfValues;
	}
	
	public void getThat() throws IOException {
		Scanner s = null;
		String OneLineValue = "";
		double suma=0;
		
		try {
			s = new Scanner( new BufferedReader(new FileReader("dane.txt")));
			while (s.hasNext()) {
				OneLineValue = s.next();
				CurrencyTable.add(Double.parseDouble(OneLineValue));
			}
		} finally {
			if (s != null) {
				s.close();
				for (int i=0; i<CurrencyTable.size(); i++)
				{
					suma = suma + CurrencyTable.get(i);
					sumOfValues += CurrencyTable.get(i);
				}
			}
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
