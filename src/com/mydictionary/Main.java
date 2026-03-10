/**
 *  Java program to demonstrate Dictionary class.
 */

package com.mydictionary;

import java.util.Calendar;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Creating Dictionary entity.
        Dictionary myDictionary = new Hashtable<>();

        // Adding elements to myDictionary.
        myDictionary.put("Weather", "Wetter");
        myDictionary.put("Sun", "Sonner");
        myDictionary.put("Sky", "Himmel");
        myDictionary.put("Temperature", "Temperatur");
        myDictionary.put("Wind", "Wind");
        myDictionary.put("Tornado", "Tornado");
        myDictionary.put("Earthquake", "Erdbeben");
        myDictionary.put("Flooding", "Überschwemmung");

        // Print elements of myDictionary to console.
        for (Enumeration en = myDictionary.keys(); en.hasMoreElements(); ) {

            // Getting key from myDictionary.
            String key = en.nextElement().toString();

            // Printing keys with values.
            System.out.println(key + " = " + myDictionary.get(key));

        }

        // Remove some elements from dictionary.
        myDictionary.remove("myDictionary");
        myDictionary.remove("Earthquake");

        // Print elements of myDictionary to console.
        for (Enumeration en = myDictionary.keys(); en.hasMoreElements(); ) {

            // Getting key from myDictionary.
            String key = en.nextElement().toString();

            // Printing keys with values.
            System.out.println(key + " = " + myDictionary.get(key));

        }
    }
}