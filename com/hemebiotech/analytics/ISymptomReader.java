package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Résumé du rôle de l'interface'. Anything that will read symptom data from a
 * source The important part is, the return value from the operation, which is a
 * list of strings, that may contain many duplications The implementation does
 * not need to order the list
 * @param getSymptoms sert a lire le fichier d'origine
 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible
 */
public interface ISymptomReader {

  List<String> getSymptoms();
}
