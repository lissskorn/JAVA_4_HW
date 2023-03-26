/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw4;

/**
 *
 * @author olesiyakorgueva
 */
public class Passport implements Comparable<Passport> {
    private String lastName;
    private String firstName;
    private String fatherland;
    private String position;
    private int number;
    private boolean admission;
    
    public Passport(String lastName, String firstName, String fatherland, 
            String position, int number, boolean admission) {
        this.lastName = lastName; 
        this.firstName = firstName;
        this.fatherland = fatherland;
        this.position = position;
        this.number = number;
        this.admission = admission;
    }
     public String getLastName() {
        return lastName;
    }
     public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     
     public String getFirstName() {
        return firstName;
    }
     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     public String getFatherland() {
        return fatherland;
    }
     public void setFatherland(String fatherland) {
         this.fatherland = fatherland;
     }
     
     public String getPosition() {
        return position;
    }
     public void setPosition(String position) {
         this.position = position;
     }
     
     public int getNumber() {
        return number;
    }
     public void setNumber(int number) {
         this.number = number;
     }
     public boolean getAdmission() {
        return admission;
    }
     public void setAdmission(boolean admission) {
         this.admission = admission;
     }
     
     public String toString() {
         return lastName + " " + firstName + " " + fatherland + ", " + position +
                 ", " + number + ", " + admission;
     }

    @Override
    public int compareTo(Passport o) {
        return lastName.compareTo(o.getLastName());    
    }  
}
