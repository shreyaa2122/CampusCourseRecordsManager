package edu.ccrm.util;

import java.util.Arrays;

public class StringArrayUtil {

    /**
     * Sorts a string array in alphabetical order.
     * @param array The array of strings to be sorted.
     */
    public static void sortArray(String[] array) {
        if (array != null) {
            Arrays.sort(array);
        }
    }

    /**
     * Searches for a string within a sorted array using binary search.
     * Note: The array must be sorted for this method to work correctly.
     * @param sortedArray The sorted array of strings.
     * @param key The string to search for.
     * @return The index of the search key, or a negative value if not found.
     */
    public static int searchArray(String[] sortedArray, String key) {
        if (sortedArray != null) {
            return Arrays.binarySearch(sortedArray, key);
        }
        return -1;
    }

    /**
     * Joins elements of a string array into a single string with a delimiter.
     * @param array The array of strings to join.
     * @param delimiter The string to use as a delimiter.
     * @return A single string with all elements joined.
     */
    public static String joinArray(String[] array, String delimiter) {
        if (array == null || array.length == 0) {
            return "";
        }
        return String.join(delimiter, array);
    }
}

