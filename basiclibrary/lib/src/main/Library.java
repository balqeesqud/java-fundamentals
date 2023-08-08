package basiclibrary.lib.src.main;

import java.util.HashSet;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public int[] roll(int n) {

        int[] rollResults = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            rollResults[i] = (int) (Math.random() * 6) + 1; // Math.random will provide a double value between (0-1)
        }

        return rollResults;
    }

    public boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public double calculateAverage(int[] arr) {

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        return (double) sum / arr.length;
    }

    public int[] calculateLowestAverage(int[][] arrays) {

        double[] averages = new double[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            int sum = 0;
            for (int value : arrays[i]) {
                sum += value;
            }
            averages[i] = (double) sum / arrays[i].length;
        }

        int indexOfLowestAverage = 0;
        double lowestAverage = averages[0];
        for (int i = 1; i < averages.length; i++) {
            if (averages[i] < lowestAverage) {
                lowestAverage = averages[i];
                indexOfLowestAverage = i;
            }
        }

        return arrays[indexOfLowestAverage];
    }


 }



