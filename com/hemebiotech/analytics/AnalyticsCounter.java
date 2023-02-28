package com.hemebiotech.analytics;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.TreeMap;


/**
 * Résumé du rôle de la classe. Servant à initialiser toutes les méthodes writer
 * et reader et à compter et ranger les symtomes par odre alphabétique
 * @param reader et writer appelent des interfaces
 */
public class AnalyticsCounter {

  private ISymptomReader reader;
  private ISymptomWriter writer;

  /**
   * Résumé du rôle du constructeur. Commentaires détaillés sur le role de la
   * methode
   * @param reader et writer implémente les interfaces
   */
  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;
  }

  /**
   * Résumé du rôle de la méthode. Recupère la liste des symtoms dans le fichier
   * txt
   */
  public List<String> getSymptoms() {
    return reader.getSymptoms();
  }

  /**
   * Résumé du rôle de la méthode. Recupère les symtomes ecrit dans le ficher
   * result.out
   * @param symptoms map de l'interface {@link ISymptomWriter}
   */
  public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms);
  }

  /**
   * Résumé du rôle de la méthode. 
   * Compte les recurrences des symptomes
   * @param symptoms map de la méthode au dessus
   * @return symptoms
   */
  public Map<String, Integer> countSymptoms(List<String> symptoms) {

    Map<String, Integer> symtomMap = new HashMap<>();
    try {
      for (String str : symptoms) {

        if (symtomMap != null && symtomMap.containsKey(str)) {

          symtomMap.put(str, symtomMap.get(str) + 1);

        } else {
          System.out.println("add" + str);
          symtomMap.put(str, 1);
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    return symtomMap;

  }

  /**
   * Résumé du rôle de la méthode. 
   * Tri les symtomes par odre alphabétique
   * @param symptoms map de la méthode writeSymptom
   * @return symptoms 
   */
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    return new TreeMap<>(symptoms);
  }
}
