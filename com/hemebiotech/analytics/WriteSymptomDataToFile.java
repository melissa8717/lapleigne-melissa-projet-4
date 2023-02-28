package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Résumé du rôle de la classe. Simple implementation writing in a file.
 *
 * @param ISymptomReader implémente l'interface
 * @return
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

  /**
   * Résumé du rôle de la méthode. Write the result in the result.out file.
   *
   * @param symptoms the map containing the sorted symptoms and their count
   * @return
   */
  public void writeSymptoms(Map<String, Integer> symptoms) {
    try (FileWriter writer = new FileWriter(new File("result.out"))) {
      for (String symptom : symptoms.keySet()) {
        writer.write(symptom + " : " + symptoms.get(symptom) + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
