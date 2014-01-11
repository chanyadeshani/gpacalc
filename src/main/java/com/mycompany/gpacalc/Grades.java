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
public enum Grades {

    A(4),
    B(3),
    C(2),
    D(1),
    F(0);
    
    private final int value;

    private Grades(int value) {
        this.value = value;
    }

    public int getValue() {
        
        return value;
    }

    
}
