package inheritance.lib.src.main.java.inheritance;

public class Review {
    private String body;
    private String author;
    private float numberOfStars;
    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;
    private String movie;


    public Review() {
        System.out.println("Review No Param Constructor");
    }

    public Review(String body, String author, float numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    public Review(String body, String author, float numberOfStars, Restaurant restaurant) {
        this(body, author, numberOfStars);
        this.restaurant = restaurant;
        restaurant.addReview(this); // Add the review to the restaurant
    }

    public Review(String body, String author, float numberOfStars, Shop shop) {
        this(body, author, numberOfStars);
        this.shop = shop;
        shop.addReview(this); // Add the review to the shop
    }

    public Review(String body, String author, int numberOfDollarSigns, Theater theater) {
        this(body, author, numberOfDollarSigns);
        this.theater = theater;
        theater.addReview(this);
    }

    ///////
    public Review(String body, String author, int numberOfStars,String movie, Theater theater) {
        this(body, author, numberOfStars);
        this.theater = theater;
        this.movie=movie;
        theater.addReview(this);
    }

    public float getNumberOfStars() {
        return numberOfStars;
    }

    @Override
    public String toString() {
        String establishmentName = restaurant != null ? restaurant.getName() :
                shop != null ? shop.getName() :
                        theater != null ? theater.getName() : "Unknown Place";

        String movieInfo = theater != null && movie != null ? " (Movie: " + movie + ")" : "";

        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Place=" + establishmentName + movieInfo +
                '}';
    }

    public String getBody() {
        return body;
    }

    public String getMovie() {
        return movie;
    }

    public String getAuthor() {
        return author;
    }
}