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
        if (a == null) {
            throw new IllegalArgumentException("Caught in sum() method in IntArrayToolkit.java");
        }
        int addedArray = 0;
        for (int i = 0; i < a.length; i++ ) {
            addedArray += a[i];
        }
        return addedArray;
    }

    /**
     * Returns the maximum value in the array.
     * @throws IllegalArgumentException if a is null or empty
     */
    public static int max(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Caught in max() method in IntArrayToolkit.java");
        }
        int max = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Returns the index of the first occurrence of target, or -1 if not found.
     * @throws IllegalArgumentException if a is null
     */
    public static int indexOf(int[] a, int target) {
        if (a == null) {
            throw new IllegalArgumentException("Caught in indexOf() method in IntArrayToolkit.java");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns a NEW array containing the same values as a, sorted ascending.
     * Must not modify the original array.
     * @throws IllegalArgumentException if a is null
     */
    public static int[] copySortedAscending(int[] a) {
        // implement (hint: defensive copy + Arrays.sort)
        if (a == null) {
            throw new IllegalArgumentException("Caught in copySortedAscending() method in IntArrayToolkit.java");
        }

        int[] arrayCopy = Arrays.copyOf(a, a.length);

        Arrays.sort(arrayCopy);
        return arrayCopy;
    }
}