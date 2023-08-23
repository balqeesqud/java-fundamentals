package inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String name;
    private List<String> movies;
    private List<Review> reviews;

    private double numberOfStars;


    private String movie;

    public String getName() {
        return name;
    }

    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
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

    public List<String> getMovies() {
        return movies;
    }

    @Override
    public String toString() {

        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", stars= " + numberOfStars  + '\'' +
                '}';
    }
}

