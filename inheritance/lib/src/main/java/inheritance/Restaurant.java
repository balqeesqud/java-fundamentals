package inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Review> reviews;
    protected String name;
    protected double numberOfStars;
    protected int price;


    public Restaurant() {
        System.out.println(" No Param Constructor");
    }

    public Restaurant(String name, int numberOfStars, int price) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.price = price;
        this.reviews = new ArrayList<>();  //initializes an ArrayList named reviews within the Restaurant class. This ArrayList will be used to store
                                           // instances of the Review class that are associated with the particular restaurant instance.
    }
    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            updateStars();
        }

    }

    public List<Review> getReviews() {
        return reviews;
    }

        private void updateStars(){
            int totalStars = 0;
            for (Review review : reviews) {
                totalStars += review.getNumberOfStars();
            }
            numberOfStars = totalStars / reviews.size();
        }

    private String getPriceCategorySymbol(int price) {
        StringBuilder symbols = new StringBuilder();
        for (int i = 0; i < price; i++) {
            symbols.append("$");
        }
        return symbols.toString();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", stars= " + numberOfStars  + '\'' +
                ", price= " + price  + '\'' +
        '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


