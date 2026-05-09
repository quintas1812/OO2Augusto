package com.unrn.oo2.tp_refactoring.ejercicio2;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RecaudacionTest {

    @Test
    public void testWhereGivenCompany() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("company_name", "Facebook");
        LectorCSV lector = new LectorCSV("C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto\\tpRefactoring\\test\\ejercicio2\\cvc.txt");
        Recaudacion r1 = new Recaudacion(lector);
        assertEquals(r1.where(options).size(), 1);
    }
        @Test
    public void testWhereNotExists() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("company_name", "noexiste");
          options.put("company_name", "Facebook");//existe el valor facebook en la columna company_name
          options.put("noexiste", "Facebook");
        LectorCSV lector =new LectorCSV("C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto\\tpRefactoring\\test\\ejercicio2\\cvc.txt");
        Recaudacion r1 = new Recaudacion(lector);
        assertEquals(r1.where(options).size(), 1);
 }

//
//    @Test
//    public void testWhereGivenCity() throws IOException {
//        Map<String, String> options = new HashMap<String, String>();
//        options.put("city", "Tempe");
//        assertEquals(Recaudacion.where(options).size(), 3);
//    }
//
//    @Test
//    public void testWhereGivenState() throws IOException {
//        Map<String, String> options = new HashMap<String, String>();
//        options.put("state", "CA");
//        assertEquals(Recaudacion.where(options).size(), 873);
//    }
//
//    @Test
//    public void testWhereGivenRound() throws IOException {
//        Map<String, String> options = new HashMap<String, String>();
//        options.put("round", "a");
//        assertEquals(Recaudacion.where(options).size(), 582);
//    }
//
//    @Test
//    public void testMultipleOptions() throws IOException {
//        Map<String, String> options = new HashMap<String, String>();
//        options.put("round", "a");
//        options.put("company_name", "Facebook");
//        assertEquals(Recaudacion.where(options).size(), 1);
//    }
//

//
//    @Test
//    public void testWhereCorrectKeys() throws IOException {
//        Map<String, String> options = new HashMap<String, String>();
//        options.put("company_name", "Facebook");
//        Map<String, String> row = Recaudacion.where(options).get(0);
//
//        assertEquals(row.get("permalink"), "facebook");
//        assertEquals(row.get("company_name"), "Facebook");
//        assertEquals(row.get("number_employees"), "450");
//        assertEquals(row.get("category"), "web");
//        assertEquals(row.get("city"), "Palo Alto");
//        assertEquals(row.get("state"), "CA");
//        assertEquals(row.get("funded_date"), "1-Sep-04");
//        assertEquals(row.get("raised_amount"), "500000");
//        assertEquals(row.get("round"), "angel");
//
//    }
}
