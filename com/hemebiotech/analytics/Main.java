package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
  
  /**
 * Résumé du rôle du main. 
 * Initialise toutes les méthodes.
 */

  public static void main(String args) throws Exception {

    String fileToRead = null;
    ISymptomReader reader = new ReadSymptomDataFromFile(fileToRead);
    ISymptomWriter writer = new WriteSymptomDataToFile();
    AnalyticsCounter analytics = new AnalyticsCounter(reader, writer);

    List<String> listSymptom = reader.getSymptoms();
    writeSymptom = writer.writeSymptoms();
    Map<String, Integer> countSymptom = analytics.countSymptoms(List < String > symptoms());
    Map<String, Integer> sortSymtom = analytics.sortSymptoms(Map < String, Integer > symptoms());

  }
}
