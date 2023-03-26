/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author olesiyakorgueva
 */
public class HW4 {

    public static void main(String[] args) {
        System.out.println("Вариант 4; РИБО-04-21; Коргуева Олеся");
        
        List<Passport> passport = new ArrayList<>();
        passport.add(new Passport("Ivanov", "Ivan",
                "Ivanovich", "director", 678434, true));
        passport.add(new Passport("Popova", "Olga",
                "Evgenevna", "secretary", 130194, false));
        passport.add(new Passport("Raspotnuk","Nikolay",
                "Olegovich", "musician", 245029, false));
        passport.add(new Passport("Kirich","Anna",
                "Aleksandrovna", "plumber",  904953, true));
        passport.add(new Passport("Korguev","Zaxar",
                "Urevich", "owner", 489529, false));
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your last name:");
        String lastName = myObj.nextLine();
        System.out.println("Enter your first name:");
        String firstName = myObj.nextLine();
        System.out.println("Enter your fatherland: ");
        String fatherland = myObj.nextLine();
        System.out.println("Enter your position: ");
        String position = myObj.nextLine();
        System.out.println("Enter your passport number: ");
        int number = Integer.parseInt(myObj.nextLine());
        System.out.println("Enter your admission: "); 
        boolean admission = Boolean.parseBoolean(myObj.nextLine());
        System.out.println(passport);
        
        Iterator<Passport> iter = passport.iterator();
        while (iter.hasNext()) {
            Passport p =iter.next();
            if(p.getNumber() == number) {
                iter.remove();
            }
        }
        passport.add(new Passport(lastName, firstName, fatherland, position, number, admission));
        
        for (Passport p: passport) {
            System.out.println(p);
        }
        Collections.sort(passport);
        System.out.println("\nSorting of last names: ");
        for (Passport p: passport) {
            System.out.println(p);
        }
        Collections.sort(passport, new ComparatorNumber());
        System.out.println("\nSorting of numbers: ");
        for (Passport p: passport) {
            System.out.println(p);
    }
    }
}


