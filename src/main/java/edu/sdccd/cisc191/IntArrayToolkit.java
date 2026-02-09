package edu.sdccd.cisc191;

import java.util.Arrays;

/**
 * Module 1 - Part A
 * Utility methods for working with int[].
 *
 * IMPORTANT:
 * - Do not print inside these methods.
 * - Do not modify input arrays unless the method explicitly says so.
 */
public class IntArrayToolkit {

    /**
     * Returns the sum of all values in the array.
     * @throws IllegalArgumentException if a is null
     */
    public static int sum(int[] a) {
        try {
            int sum;
            for (int i = 0; i < (a.length + 1); i++ ) {
                sum += a[i];
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Caught in sum() method in IntArrayToolkit.java");
        }
        
    }

    /**
     * Returns the maximum value in the array.
     * @throws IllegalArgumentException if a is null or empty
     */
    public static int max(int[] a) {
        try {
            int max = a[0];
            for (int i = 0; i < (a.length + 1); i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
        catch (IllegalArgumentException e) {
            System.out.println("Caught in max() method in IntArrayToolkit.java");
        }
    }

    /**
     * Returns the index of the first occurrence of target, or -1 if not found.
     * @throws IllegalArgumentException if a is null
     */
    public static int indexOf(int[] a, int target) {
        try {
            for (int i = 0; i < (a.length + 1); i++) {
                if (a[i] == target) {
                    return i;
                }
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Caught in indexOf() method in IntArrayToolkit.java");
        }
    }

    /**
     * Returns a NEW array containing the same values as a, sorted ascending.
     * Must not modify the original array.
     * @throws IllegalArgumentException if a is null
     */
    public static int[] copySortedAscending(int[] a) {
        // TODO: implement (hint: defensive copy + Arrays.sort)
        try {
            ,,,
        }
    }
}
