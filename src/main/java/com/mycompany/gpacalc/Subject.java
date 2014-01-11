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
public class Subject {

    private String code;
    private int credit;
   

    public Subject(String code, int credit) {
        this.code = code;
        this.credit = credit;        
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    }
