/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance.lib.src.main.java.inheritance;



public class Library {
   public static void main(String[] args) {

      Restaurant restaurant = new Restaurant("Tasty Treats", 4, 3);
      System.out.println(restaurant);
      Restaurant restaurantOne = new Restaurant();


      Restaurant restaurant3 = new Restaurant("Tasty Treats", 4, 3);
      Review review3 = new Review("Delicious food and excellent service!", "John Doe", 5, restaurant);
      System.out.println(review3);


      // Create a Restaurant
      Restaurant restaurant4 = new Restaurant("Tasty Treats", 4, 3);

      // Create a Review associated with the Restaurant
      Review review4 = new Review("Delicious food and excellent service!", "John Doe", 5, restaurant);

      // Test the association between Restaurant and Review
      System.out.println("\nRestaurant Reviews:");
      for (Review r : restaurant.getReviews()) {
         System.out.println(r);
      }

   }
}
