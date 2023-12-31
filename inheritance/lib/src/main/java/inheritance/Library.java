/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance.lib.src.main.java.inheritance;



public class Library {
   public static void main(String[] args) {

      // Create a Restaurant
      Restaurant restaurant = new Restaurant("Tasty Treats", 4, 3);
      System.out.println(restaurant);

      // Create a Review associated with the Restaurant
      Review review1 = new Review("Delicious food and excellent service!", "John Doe", 5, restaurant);
      Review review2 = new Review("Delicious food and excellent service!", "John Doe", 5, restaurant);

      // Test the association between Restaurant and Review
      System.out.println("\nRestaurant Reviews:");
      for (Review r : restaurant.getReviews()) {
         System.out.println(r);
      }

      Shop shop = new Shop("Fashion Haven", "Trendy clothes for all ages", 2);
      System.out.println(shop);
      Review review3 = new Review("Great collection and friendly staff!", "Adam", 4, shop);
      Review review4 = new Review("Amaaaazinggg!", "Eliana", 5, shop);


      System.out.println("\nShop Reviews:");
      for (Review r : shop.getReviews()) {
         System.out.println(r);
      }

      Theater theater = new Theater("Abdali");

      // Add movies
      theater.addMovie("Avengers: Endgame");
      theater.addMovie("The Lion King");
      theater.addMovie("Barbie");
      theater.addMovie("Joker");

      System.out.println(theater);

      // Remove a movie
      theater.removeMovie("The Lion King");
      System.out.println(theater);

      Review review5 = new Review("Great cinema experience!", "Adam", 5, theater);
      Review review6 = new Review("Loved the latest movie!", "Eva", 4, theater);
      Review review7 = new Review("Loved the latest movie!", "Marwa", 3,"Barbie", theater);

      System.out.println("\nTheater Reviews:");
      for (Review r : theater.getReviews()) {
         System.out.println(r);
      }
   }
}
