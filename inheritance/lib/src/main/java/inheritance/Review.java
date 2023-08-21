package inheritance.lib.src.main.java.inheritance;

public class Review {

    protected String body;
    protected String author;
    protected int numberOfStars;
    protected Restaurant restaurant;


    public Review() {
        System.out.println("Review No Param Constructor");
    }


    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }
    public Review(String body, String author, int numberOfStars,  Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
        this.restaurant = restaurant;
        // When a review is created, we add it to the associated restaurant's reviews
        restaurant.addReview(this);
    }
    public int getNumberOfStars() {
        return numberOfStars;
    }


    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", restaurant=" + restaurant.toString() +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Review{body='" + body + "', author='" + author + "', numberOfStars=" + numberOfStars + "}";
//    }
}
