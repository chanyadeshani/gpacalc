/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author user
 */
public class Subject {
    private final String subjectCode; 
    private final String subjectName;
    private final int noOfCredit;

    public Subject(String subjectCode, String subjectName, int noOfCredit) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.noOfCredit = noOfCredit;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getNoOfCredit() {
        return noOfCredit;
    }

    
    
    
}
