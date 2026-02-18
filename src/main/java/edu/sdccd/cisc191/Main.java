package edu.sdccd.cisc191;

import java.util.Random;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        // Create at least 6 students and demonstrate:
        // - original order
        // - sorted-by-GPA order
        // - topNByGpa with N=3
        // - findByIdLinear with existing and non-existing id

        String[] names = {
            "Amelia", "Bambi", "Cornelious", "Dave", "Eric", 
            "Frank", "Georgia", "Hailey", "India", "Jake", 
            "Karl", "Liam", "Matteo", "Noshua", "Octet",
            "Patricia", "Quilt", "Rhianna", "Shein", "Tamatoa",
            "Vincent", "Wush", "Yeon", "Zoshua"
        }; 

        // creating 6 students for the roster
        Random rand = new Random(); 

        Student[] roster = new Student[6];
        for (int i = 0; i < (roster.length); i++) {
            int nameIndex = rand.nextInt(names.length);
            String randomName = names[nameIndex];
            
            double randomGPA = Math.round(rand.nextDouble() * 4.0 * 10.0) / 10.0;
    
            int randomID = rand.nextInt(90000) + 10000;

            roster[i] = new Student(randomName, randomGPA, randomID);
            }
        
        // original roster order
        System.out.println("Original Roster Order: ");
        for (int i = 0; i < roster.length; i++) {
            System.out.println(" - " + roster[i]);
        }

        // sorted-by-GPA order
        System.out.println("\nSorted By GPA: ");

        Student[] sortByGpaArray = StudentArrayToolkit.copySortedByGpaDesc(roster);

        for (int i = 0; i < sortByGpaArray.length; i++) {
            System.out.println(" - " + sortByGpaArray[i]);
        }

        // returning the top n=3 students in roster
        int n = 3;

        System.out.println("\nTop " + n + " Students on Roster: ");

        Student[] topNStudents = StudentArrayToolkit.topNByGpa(roster, n);

        for (int i = 0; i < topNStudents.length; i++) {
            System.out.println(" - " + topNStudents[i]);
        }

        // finding ids that exist and don't
        int randomIndex = rand.nextInt(6);
        System.out.println("\nSearching for ID: " + roster[randomIndex].getId());
        System.out.println(StudentArrayToolkit.findByIdLinear(roster, roster[randomIndex].getId()));

        int randomNonExistentID = rand.nextInt(90000) + 10000;
        System.out.println("\nSearching for ID: " + randomNonExistentID);
        System.out.println(StudentArrayToolkit.findByIdLinear(roster, randomNonExistentID));
    }
}