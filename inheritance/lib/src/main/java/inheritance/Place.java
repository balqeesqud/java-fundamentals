package inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Place {
    protected String name;
    protected List<Review> reviews;


    public Place(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
        }
    }

    public String getName() {
        return name;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
