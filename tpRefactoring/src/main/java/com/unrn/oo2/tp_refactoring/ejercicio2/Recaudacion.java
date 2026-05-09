package com.unrn.oo2.tp_refactoring.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    private static final int COL_PERMALINK = 0;
    private static final int COL_COMPANY_NAME = 1;
    private static final int COL_NUMBER_EMPLOYEES = 2;
    private static final int COL_CATEGORY = 3;
    private static final int COL_CITY = 4;
    private static final int COL_STATE = 5;
    private static final int COL_FUNDED_DATE = 6;
    private static final int COL_RAISED_AMOUNT = 7;
    private static final int COL_RAISED_CURRENCY = 8;
    private static final int COL_ROUND = 9;
    public static final String COMPANY_NAME = "company_name";
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String ROUND = "round";
    public static final String NUMBER_EMPLOYEES = "number_employees";
    public static final String CATEGORY = "category";
    public static final String FUNDED_DATE = "funded_date";
    public static final String RAISED_AMOUNT = "raised_amount";
    public static final String RAISED_CURRENCY = "raised_currency";
    public static final String PERMALINK = "permalink";

    private LectorCSV lector;
private List<String[]> csvData;
public Recaudacion(LectorCSV lector) {
     csvData = lector.read();
}
    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        filtrar(options, COMPANY_NAME,1);
        filtrar(options, CITY,4);
        filtrar(options, STATE,5);
        filtrar(options, ROUND,9);
        return getResult();
    }

    private List<Map<String, String>> getResult() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();
        for (String[] row : csvData) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put(PERMALINK, row[COL_PERMALINK]);
            mapped.put(COMPANY_NAME, row[COL_COMPANY_NAME]);
            mapped.put(NUMBER_EMPLOYEES, row[COL_NUMBER_EMPLOYEES]);
            mapped.put(CATEGORY, row[COL_CATEGORY]);
            mapped.put(CITY, row[COL_CITY]);
            mapped.put(STATE, row[COL_STATE]);
            mapped.put(FUNDED_DATE, row[COL_FUNDED_DATE]);
            mapped.put(RAISED_AMOUNT, row[COL_RAISED_AMOUNT]);
            mapped.put(RAISED_CURRENCY, row[COL_RAISED_CURRENCY]);
            mapped.put(ROUND, row[COL_ROUND]);
            output.add(mapped);
        }
        return output;
    }
    private List<String[]> filtrar(Map<String, String> options, String columna, int x) {
        if (options.containsKey(columna)) {
            List<String[]> results = new ArrayList<String[]>();
            for (String[] csvDatum : this.csvData) {
                if (csvDatum[x].equals(options.get(columna))) {
                    results.add(csvDatum);
                }
            }
            csvData = results;
        }
        return csvData;
    }
}
