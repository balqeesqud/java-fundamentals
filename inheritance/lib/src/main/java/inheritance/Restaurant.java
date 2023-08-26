package inheritance.lib.src.main.java.inheritance;

import java.util.List;

public class Restaurant extends Place {
    protected float numberOfStars;
    protected int price;


    public Restaurant(String name, int numberOfStars, int price) {
        super(name);
        this.numberOfStars = numberOfStars;
        this.price = price;

    }

    public List<Review> getReviews() {
        return reviews;
    }

    private void updateStars() {
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
                ", price= " + price + '\'' +
                '}';
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(float numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


