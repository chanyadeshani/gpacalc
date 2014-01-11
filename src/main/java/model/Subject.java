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
    private final String code; 
    private final String name;
    private final int noOfCredit;

    public Subject(String code, String name, int noOfCredit) {
        this.code = code;
        this.name = name;
        this.noOfCredit = noOfCredit;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getNoOfCredit() {
        return noOfCredit;
    }
    
    
}
