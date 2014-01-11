/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gpacalc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ResultReader {

    int totalGpa = 0;

    public ResultSheet readResuts() {
        ResultSheet resultSheet = new ResultSheet();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\marks.txt"));

            String str;
            String name = reader.readLine();
            List<Result> results = new ArrayList<Result>();
            while ((str = reader.readLine()) != null) {
                String[] tokens = str.split(" ");
                if (tokens.length != 3) {
                    break;
                }
                Subject subject = new Subject(tokens[0], Integer.parseInt(tokens[2]));
                Result result = new Result(subject, getGrade(tokens[1]));

                results.add(result);
            }
            resultSheet = new ResultSheet(name, results);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultSheet;

    }

    private Grades getGrade(String g) {
        if (g.equals("A")) {
            return Grades.A;
        } else if (g.equals("B")) {
            return Grades.B;
        } else if (g.equals("C")) {
            return Grades.C;
        } else if (g.equals("D")) {
            return Grades.D;
        } else {
            return Grades.F;
        }
    }

    public ResultReader() {
    }

}
