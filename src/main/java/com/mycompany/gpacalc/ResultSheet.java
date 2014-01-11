/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gpacalc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ResultSheet {

    private final String name;
    private final List<Result> resultList;
    private float gpa;

    public ResultSheet() {
        this.name = null;
        this.resultList = null;
    }

    public ResultSheet(String name, List<Result> resultList) {
        this.name = name;
        this.resultList = resultList;
    }

    public String getName() {
        return name;
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }
    // calculating Gpa

    public void calGpa() {
        float total = 0;
        int i = 0;
        for (Result result : resultList) {
            total = total + (result.getSubject().getCredit()) * (result.getGrade().getValue());
            i = i + result.getSubject().getCredit();
        }
        total = total / i;
        setGpa(total);
        System.out.println(total);
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(name).append("\n");
        for (Result result : resultList) {
            sb.append(result.getSubject().getCode()).append(" " ).append(result.getGrade().name()).append("\n");   
        }
        sb.append("GPA = ").append(getGpa());
        return sb.toString();
    }

}
