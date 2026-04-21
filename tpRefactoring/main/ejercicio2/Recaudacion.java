package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Recaudacion {
private LectorFile lector;

Recaudacion(LectorFile lector) {
    this.lector = lector;
}
    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {

        List<String[]> csvData = lector.read();

        csvData = buscar(options, "company_name", csvData, 1);

        csvData = buscar(options, "city", csvData, 4);

        csvData = buscar(options, "state", csvData, 5);

        csvData = buscar(options, "round", csvData, 9);

        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (int i = 0; i < csvData.size(); i++) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", csvData.get(i)[0]);
            mapped.put("company_name", csvData.get(i)[1]);
            mapped.put("number_employees", csvData.get(i)[2]);
            mapped.put("category", csvData.get(i)[3]);
            mapped.put("city", csvData.get(i)[4]);
            mapped.put("state", csvData.get(i)[5]);
            mapped.put("funded_date", csvData.get(i)[6]);
            mapped.put("raised_amount", csvData.get(i)[7]);
            mapped.put("raised_currency", csvData.get(i)[8]);
            mapped.put("round", csvData.get(i)[9]);
            output.add(mapped);
        }
        return output;
    }

    private static List<String[]> buscar(Map<String, String> options, String columna, List<String[]> csvData, int x) {
        if (options.containsKey(columna)) {
            List<String[]> results = new ArrayList<String[]>();
            for (String[] csvDatum : csvData) {
                if (csvDatum[x].equals(options.get(columna))) {
                    results.add(csvDatum);
                }
            }
            csvData = results;
        }
        return csvData;
    }
}
