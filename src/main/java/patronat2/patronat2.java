package patronat2;

import java.io.*;
import java.util.Currency;
import java.util.*;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class patronat2 {
	
		
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Start metody main.");
		
		GetData gd1 = new GetData();
		gd1.getThat();
		
		System.out.println("Liczba wczytanych elementow do tablicy: " + gd1.getSizeofCurrencyTable());
		
		/*
		 * Wypisanie na stdout wartosci nieposortowane
		 */
		System.out.println("Wartosci nieposortowane: ");
		for (int i=0; i<gd1.getSizeofCurrencyTable(); i++) {
			System.out.println(gd1.getValueFromCurrencyTable(i));
		}
		
		/*
		 * Wypisanie na stdout wartosci posortowane
		 */
		gd1.sortCurrencyTable();
		System.out.println("Wartosci posortowane: ");
		
		for (int i=0; i<gd1.getSizeofCurrencyTable(); i++) {
			System.out.println(gd1.getValueFromSortedTable(i));
		}
		
		/*
		 * Wypisanie na stdout sumy wartosci
		 */
		System.out.println("Suma wynosi: " + gd1.calculateSum());
		
		/*
		 * Wypisanie na stdout sredniej arytmetycznej
		 */
		System.out.println("Srednia arytmetyczna wynosi: " + gd1.calculateArithmeticMean());
		

	}

}
