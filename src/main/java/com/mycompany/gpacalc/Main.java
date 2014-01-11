package com.mycompany.gpacalc;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        ResultReader resultReader = new ResultReader();
        ResultSheet resultSheet = resultReader.readResuts();
        resultSheet.calGpa();
        System.out.println(resultSheet.toString());
        
    }
}
