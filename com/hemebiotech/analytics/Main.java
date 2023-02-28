package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
  
  /**
 * Résumé du rôle du main. 
 * Initialise toutes les méthodes.
 */

  public static void main(String args) throws Exception {
    
    String fileToRead = "symptoms.txt";
    ISymptomWriter writer = new WriteSymptomDataToFile();
    ISymptomReader reader = new ReadSymptomDataFromFile(fileToRead);
    AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);
    List<String> symptoms = analyticsCounter.getSymptoms();
    Map<String, Integer> mapSymptoms = analyticsCounter.countSymptoms(symptoms);
    Map<String, Integer> mapSymptomsSorted = analyticsCounter.sortSymptoms(mapSymptoms);
    analyticsCounter.writeSymptoms(mapSymptomsSorted);

  }
}
