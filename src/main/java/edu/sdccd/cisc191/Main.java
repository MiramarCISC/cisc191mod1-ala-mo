package edu.sdccd.cisc191;

import java.util.Random;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        // TODO: Create at least 6 students and demonstrate:
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

        //for (int i = 0; i < 6; i++) {
            Random rand = new Random(); 

            int nameIndex = rand.nextInt(names.length);
            String randomName = names[index];

            double randomGPA = rand.nextDouble() * 4.0;

            int randomID = rand.nextInt(90000) + 10000;

            Student firstStudent = new Student(randomName, randomGPA, randomID);
        //}
        
        System.out.println("Module 1 Demo (implement me!)");
        System.out.println("Test, first student: " + firstStudent);
    }
}
