package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
  public static void main(String[] args) throws InterruptedException {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    flipNHeads(2);

    clock();

  }

  public static String pluralize(String word, int number) { // I removed void in order to use return & set it String to
                                                            // get a String value
    if (number > 1) {
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
