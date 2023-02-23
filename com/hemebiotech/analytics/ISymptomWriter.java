package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything that will write symptom data on a valid data output format.
 */
public interface ISymptomWriter {

  /**
   * Write the result in a data output.
   *
   * @param symptoms the map containing the sorted symptoms and their count
   */
  public void writeSymptoms(Map<String, Integer> symptoms);

}