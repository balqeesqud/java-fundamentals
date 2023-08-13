package basics;

import basiclibrary.lib.src.main.Library;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static basiclibrary.lib.src.main.Library.*;
import static linter.App.findMissingSemicolons;

public class Main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int monkeyCount = 0;
    System.out.println("I own " + monkeyCount + " " + pluralize("monkey", monkeyCount) + ".");


    flipNHeads(2);

    int[][] weeklyMonthTemperaturesSeattle = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };

    String analysisResult = analyzeWeatherData(weeklyMonthTemperaturesSeattle);
    System.out.println(analysisResult);


    List<String> votes = new ArrayList<>();
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Shrub");
    votes.add("Hedge");
    votes.add("Shrub");
    votes.add("Bush");
    votes.add("Hedge");
    votes.add("Bush");


    String winner = tally(votes);
    System.out.println(winner + " received the most votes!");


    File filePath= new File("linter/resources/gates.js");
    String errorMessage = findMissingSemicolons (filePath);
    System.out.println(errorMessage);

      //clock (); // is written down

      //=============================================================================

      Library library = new Library();

      //=============================================================================

      int[] rolls = library.roll(4);
      System.out.print("Dice rolls: ");
      for (int value : rolls) {
          System.out.print(value + " ");
      }

      //=============================================================================

      int[] numbersWithDuplicates = {88, 57, 75, 34, 22, 22};
      boolean hasDuplicates = library.containsDuplicates(numbersWithDuplicates);

      if (hasDuplicates) {
          System.out.println(" ");
          System.out.println(Arrays.toString(numbersWithDuplicates) + " This array contains duplicate values.");
      } else {
          System.out.println("The array does not contain duplicate values.");
      }


      //=============================================================================

      int[] numbers = {25, 88, 74, 2, 10};
      double average = library.calculateAverage(numbers);
      System.out.println("The average is: " + average);


      //==============================================================================

      int [] [] weeklyMonthTemperatures = {
              {66, 64, 58, 65, 71, 57, 60},
              {57, 65, 65, 70, 72, 65, 51},
              {55, 54, 60, 53, 59, 57, 61},
              {65, 56, 55, 52, 55, 62, 57}
      };

      int[] lowestAverageArray = library.calculateLowestAverage(weeklyMonthTemperatures);
      System.out.println("Array with the lowest average: ");
      for (int value : lowestAverageArray) {
          System.out.print(value + " ");
      }
      System.out.println(" ");
      clock();
  }

  public static String pluralize(String word, int number) { // I removed void in order to use return & set it String to
                                                            // get a String value
    if (number == 0 || number >1 ) {
      return word + 's';

    } else {
      return word;

    }

  }

  public static void flipNHeads(int n) {
    Random random = new Random();
    int flips = 0;
    int consecutiveHeads = 0;

    while (consecutiveHeads < n) {
      double flip = random.nextDouble();

      if (flip < 0.5) {
        System.out.println("Tails");
        consecutiveHeads = 0;
      } else {
        System.out.println("Heads");
        consecutiveHeads++;
      }

      flips++;
    }

    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  }

  public static void clock() {
    int previousSecond = 0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    while (true) {
      LocalDateTime now = LocalDateTime.now();
      int second = now.getSecond();

      if (second != previousSecond) {
        System.out.println(formatter.format(now));
        previousSecond = second;
      }
    }
  }
}
