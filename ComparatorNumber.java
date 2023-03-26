/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw4;

import java.util.Comparator;

/**
 *
 * @author olesiyakorgueva
class */
class ComparatorNumber implements Comparator<Passport> {

    @Override
    public int compare(Passport o1, Passport o2) {
        return Integer.compare(o1.getNumber(), o2.getNumber());
    }
    
    
}
