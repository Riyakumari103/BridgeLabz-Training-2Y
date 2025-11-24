
class InvalidRatingException extends Exception {
    public InvalidRatingException(String msg) { super(msg); }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String msg) { super(msg); }
}
class ProductReview {
    public void submitReview(int rating, String comment) 
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5.");
        }

        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException("Review comment cannot be empty.");
        }

        System.out.println("Review submitted successfully! Rating: " + rating 
                           + ", Comment: \"" + comment + "\"");
    }
}

public class ReviewApp {
    public static void main(String[] args) {
        ProductReview review = new ProductReview();
        try {
            review.submitReview(6, "Great product!");
        } catch (InvalidRatingException e) {
            System.out.println("Rating Error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Review Error: " + e.getMessage());
        }
        try {
            review.submitReview(4, "   ");
        } catch (InvalidRatingException e) {
            System.out.println("Rating Error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Review Error: " + e.getMessage());
        }
        try {
            review.submitReview(5, "Excellent product, highly recommend!");
        } catch (InvalidRatingException e) {
            System.out.println("Rating Error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Review Error: " + e.getMessage());
        }
    }
}

