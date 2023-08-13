package basiclibrary.lib.src.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public int[] roll(int n) {

        int[] rollResults = new int[n];
        //Random random = new Random();

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

    public static String analyzeWeatherData(int[][] weeklyMonthTemperaturesSeattle) {
        int minTemp = weeklyMonthTemperaturesSeattle[0][0];
        int maxTemp = weeklyMonthTemperaturesSeattle[0][0];

        for (int[] weekTemp : weeklyMonthTemperaturesSeattle) {
            for (int temp : weekTemp) {
                if (temp < minTemp) {
                    minTemp = temp;
                }
                if (temp > maxTemp) {
                    maxTemp = temp;
                }
            }
        }
        String result = "High: " + maxTemp + "\n" +
                "Low: " + minTemp + "\n";

        HashSet<Integer> uniqueTemperatures = new HashSet<>();

        for (int[] weekTemperatures : weeklyMonthTemperaturesSeattle) {
            for (int temperature : weekTemperatures) {
                uniqueTemperatures.add(temperature);
            }
        }

        for (int temp = minTemp; temp <= maxTemp; temp++) {
            if (!uniqueTemperatures.contains(temp)) {
                result += "Never saw temperature: " + temp + "\n";
            }
        }

        return result;
    }
    public static String tally(List<String> votes) {
        Map<String, Integer> voteCounts = new HashMap<>();

        for (String vote : votes) {
            voteCounts.put(vote, voteCounts.getOrDefault(vote, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }


 }



