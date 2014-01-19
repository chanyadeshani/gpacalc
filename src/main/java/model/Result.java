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
    private final String studentID;
    private final String  grade;

    public Result(String code, String studentID, String grade) {
        this.code = code;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getGrade() {
        return grade;
    }

   
    
    
}
