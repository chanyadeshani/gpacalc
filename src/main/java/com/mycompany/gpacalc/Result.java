/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gpacalc;

/**
 *
 * @author user
 */
public class Result {

    private final Subject subject;
    private final Grades grade;

    public Result(Subject subject, Grades grade) {
        this.subject = subject;
        this.grade = grade;
    }

    Result(String code, String name, String grade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Subject getSubject() {
        return subject;
    }

    public Grades getGrade() {
        return grade;
    }
}
