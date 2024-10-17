public class Review {
    private String reviewText;
    private int rating;

    public Review(String reviewText, int rating) {
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public void addReview() {
        System.out.println("Review added: " + reviewText + " with rating: " + rating);
    }

    public void viewReviews() {
        System.out.println("Viewing reviews...");
    }
}
