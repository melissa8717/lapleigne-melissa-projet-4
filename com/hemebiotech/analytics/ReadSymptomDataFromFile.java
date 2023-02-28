package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Résumé du rôle de la classe. 
 * Lire les symptomes du fichier de base.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

  private String filepath;

  /**
   * Résumé du rôle du constructeur. 
   * get le chemin du fichier
   * @param filepath a full or partial path to file with symptom strings in it, one per line
   */
  public ReadSymptomDataFromFile(String filepath) {
    this.filepath = filepath;
  }

  /**
   * Résumé du rôle de la classe. 
   * Faire une liste des symptomes du fichier
   * @return result
   */
  public List<String> getSymptoms() {
    ArrayList<String> result = new ArrayList<String>();

    if (filepath != null) {
      try {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line = reader.readLine();

        while (line != null) {
          result.add(line);
          line = reader.readLine();
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return result;
  }

}
