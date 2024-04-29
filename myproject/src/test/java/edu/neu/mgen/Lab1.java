package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Random;

public class Lab1 {
    public static void main(String[] args) {
        /*
         * part 1 - Array

         *  Initiate two integer arrays, x, and y, each containing 5 numbers.
         *  Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
         *  Organize a nice-looking output to the terminal that looks like the following:
         *  Array x = { array x values here separated by coma }
        *
         *  Array y = { array y values here separated by coma }
         *
         *  Array z = x + y = { array z values here separated by coma }
         * 
         * 
         */

        int[] x = new int[5];
        int[] y = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            x[i] = random.nextInt(100); // Generates random integers between 0 and 99
            y[i] = random.nextInt(100);
        }


        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i < z.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");


        /*
         * part 2 - ArrayList
         * Initiate an ArrayList that contain 5 names
         * Switch the first and last letters in each name in the ArrayList. Do not forget that each name begins with a capital letter, but the other letters are lowercase. The names with switched letters should follow the same rule as there are new names.
         */
        ArrayList<String> names = new ArrayList<>();

        //possible starting letters and possible ending letters
        char[] startingLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] endingLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        // Generate random names
        for (int i = 0; i < 5; i++) {
            // Generate a random name with a random starting and ending letter
            char firstChar = startingLetters[random.nextInt(startingLetters.length)];
            
            char lastChar = endingLetters[random.nextInt(endingLetters.length)];
            String randomName = firstChar + "" + lastChar; 
            for (int j = 3 ; j < random.nextInt(10) + 3 ;j++){
                randomName = randomName + "" + endingLetters[random.nextInt(endingLetters.length)];
            }
            names.add(randomName);
        }

        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) {
            // char firstChar = Character.toUpperCase(name.charAt(0));
            char firstChar = Character.toLowerCase(name.charAt(0));
            // char lastChar = Character.toLowerCase(name.charAt(name.length() - 1));
            char lastChar = Character.toUpperCase(name.charAt(name.length() - 1));

            String switchedName = lastChar + name.substring(1, name.length() - 1) + firstChar;
            switchedNames.add(switchedName);
        }

        // Print the original and switched names
        System.out.print("Names = { ");
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println("}");

        System.out.print("Names (switched) = { ");
        for (String switchedName : switchedNames) {
            System.out.print(switchedName + ", ");
        }
        System.out.println("}");

    }
    

}
