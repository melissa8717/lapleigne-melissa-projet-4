package com.hemebiotech.analytics;


import java.util.*;
import java.io.*;
import java.text.Collator;


public class WriteSymptomDataToFile {
    public TreeMap<String, Integer> writeSymptoms(TreeMap<String, Integer> trieMap) throws IOException{
             // Recevoir le fichier 
             ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();
             HashMap map = read.GetSymptoms();

             File file = new File("result.out");
             BufferedWriter bf = new BufferedWriter( new FileWriter(file));
             trieMap=new TreeMap<String,Integer>(); 
             Collator coll = Collator.getInstance();
             trieMap.putAll(map);
             try{
                 for (Map.Entry<String, Integer> entry : trieMap.entrySet()) {

                   bf.write("number of"+" "+ entry.getKey() + ":"+ entry.getValue());
                   bf.newLine();
            }
            //vide le bufferwriter     
            bf.flush();
                }
                catch(Exception e){
                    System.out.println(e);
                }
        finally {
  
            try {
  
                bf.close();
            }
            catch (Exception e) {
            }
        }
            return trieMap ;
     }
}
