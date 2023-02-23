package com.hemebiotech.analytics;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Map;

public class AnalyticsCounter {

    private ISymptomReader reader;
    private ISymptomWriter writer;

    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    //récupère la liste des symptoms avec l'objet reader
    public List<String> getSymptoms() {
        return reader.getSymptoms();
    }

    public void writeSymptoms(Map<String, Integer> symptoms) {
        writer.writeSymptoms(symptoms);
    }

    //initialisation d'une map en utilisant le buffer de writeSymtom
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

    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        return new TreeMap<>(symptoms);
    }
}
