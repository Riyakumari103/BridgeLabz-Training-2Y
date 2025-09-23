package Level2;
public class MovieTicketDemo {
    static class MovieTicket {
        String movieName;
        String seatNumber;
        double price;

        MovieTicket(String movieName) {
            this.movieName = movieName;
        }

        void bookTicket(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked: Seat " + seatNumber + ", Price $" + price);
        }

        void displayTicket() {
            System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: $" + price);
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers");
        ticket1.bookTicket("A1", 250);
        ticket1.displayTicket();

        MovieTicket ticket2 = new MovieTicket("Inception");
        ticket2.bookTicket("B3", 200);
        ticket2.displayTicket();
    }
}