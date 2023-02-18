package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;
import java.lang.*;

public class ReadSymptomDataFromFile implements ISymptomReader { 
         
private static ArrayList<String> symtomName = new ArrayList<String>();
private static ArrayList<Integer> symtomCount = new ArrayList<Integer>();


public  ArrayList<String>  countSymtom() throws FileNotFoundException, IOException{
//	Map<String, Integer> symtomMap = new HashMap<String, Integer>();
  FileInputStream fin = new FileInputStream("symtoms.txt");

		// Illustrating getChannel() method
		System.out.println(fin.getChannel());

		// Illustrating getFD() method
		System.out.println(fin.getFD());

		// Illustrating available method
		System.out.println("Number of remaining bytes:"
						+ fin.available());

		// Illustrating skip() method
		fin.skip(4);

		// Display message for better readability
		System.out.println("FileContents :");

		// Reading characters from FileInputStream
		// and write them
		int ch;

		// Holds true till there is data inside file
		while ((ch = fin.read()) != -1)
			System.out.print((char)ch);

		// Close the file connections
		// using close() method
		fin.close();

     ArrayList<String> list = new ArrayList<String>();

    return list;
	}




   public ArrayList<String> getSymptoms(){

    ArrayList<String> list = new ArrayList<String>();

    return list;
  }

  

  

}