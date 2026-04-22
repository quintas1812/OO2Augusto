package main.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorFile {
    private String pathfile;
// "src/main/resources/data.csv"
    public LectorFile(String pathfile) {
        this.pathfile = pathfile;
    }
    public List<String[]> read() {
            List<String[]> csvData = new ArrayList<String[]>();
        try {
            CSVReader reader = new CSVReader(new FileReader(this.pathfile));
            String[] row = null;
            while ((row = reader.readNext()) != null) {
                csvData.add(row);
            }
            reader.close();
            csvData.remove(0);

        } catch (Exception e) {
            new RuntimeException(e.getMessage());
        }
        return csvData;
    }

}
