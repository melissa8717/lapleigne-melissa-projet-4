package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;
import java.text.Collator;


public class AnalyticsCounter {
  
  private ISymptomReader reader;
  private ISymptomWriter writer;

/** Constructeur **/
 public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
	 this.reader = reader;
   this.writer = writer;	 
  }

  /** Classe qui récupère la liste de symptome avec l'objet reader**/
  public List<String> getSymptoms() {
    return reader.getSymptoms();
	}
	/** NOTE:  le writer sera instancé dans  le main   **/

    public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms);
  }

   public Map<String,Integer> countSymptoms(List<String> symptoms) { 

		Map<String,Integer> symtomMap = new HashMap<>();
		try{
			for(String str : symptoms) {
						
						if (symtomMap != null && symtomMap.containsKey(str)) {

							symtomMap.put(str, symtomMap.get(str) + 1);	
							
						} else {	
							System.out.println("add" + str);
							symtomMap.put(str, 1);
						}

					}
		}catch(Exception e){
												System.out.println(e);
										}

     return symtomMap;    

   }


  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    return new TreeMap<>(symptoms);
  }


	
}