package inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private int numberOfDollarSigns;
    private List<Review> reviews;
    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
        }
    }

    private void updateDollarSigns(){
        int totalSigns = 0;
        for (Review review : reviews) {
            totalSigns += review.getNumberOfStars();
        }
        numberOfDollarSigns = totalSigns / reviews.size();
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                '}';
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public int getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
