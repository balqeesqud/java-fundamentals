package inheritance.lib.src.main.java.inheritance;

import java.util.List;

public class Shop extends Place {
    private String description;
    private int numberOfDollarSigns;

    public Shop(String name, String description, int numberOfDollarSigns) {
        super(name);
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;

    }


    private void updateDollarSigns() {
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

    public String getDescription() {
        return description;
    }

    public int getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }
}

