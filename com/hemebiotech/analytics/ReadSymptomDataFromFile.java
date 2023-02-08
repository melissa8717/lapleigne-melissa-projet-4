package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private static HashMap<String, Integer> symtomMap = new HashMap<String, Integer>();
    private final BufferedReader filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile() throws FileNotFoundException {
		filepath = new BufferedReader(new FileReader("symtoms.txt"));
                ///System.out.println("filepath :"+filepath);
	}

	public HashMap<String, Integer> GetSymptoms() {
              
                    try(filepath){
			for (String ligne = filepath.readLine(); ligne != null; ligne = filepath.readLine()) {
                            //enlever ligne vide
				for (String symtom : ligne.split(",")) {
                                    if ( symtomMap.containsKey( symtom  ) ) {
					symtomMap.put( symtom  , symtomMap.get(symtom ) + 1 );
					}
                                    else {
                                            symtomMap.put( symtom  , 1 );
					 }
				}
			}
		} catch (IOException e) { 
                    System.out.println(e);
                            
                  }
             
		return symtomMap;
	}

}
