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
public class Result {
    private int resultId; 
    private final String code;
    private final String name;
    private final String  grade;

    public Result(String code, String name, String grade) {
        this.code = code;
        this.name = name;
        this.grade = grade;
    }

        
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
    
    
}
