package inheritance.lib.src.main.java.inheritance;

public class Review {

    protected String body;
    protected String author;
    protected int numberOfStars;

    public Review() {
        System.out.println("Review No Param Constructor");
    }
   private Restaurant restaurant;

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }
    public Review(String body, String author, int numberOfStars,  Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
        restaurant.addReview(this);
    }
    public int getNumberOfStars() {
        return numberOfStars;
    }


    @Override
    public String toString() {
        return "Review{body='" + body + "', author='" + author + "', numberOfStars=" + numberOfStars + "}";
    }
}
