import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Movie {
    private int movieID;
    private String title;
    private String genre;
    private int duration;
    private double rating;

    public Movie(int movieID, String title, String genre, int duration, double rating) {
        this.movieID = movieID;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }
}

class Theatre {
    private int theatreID;
    private String name;
    private String location;
    private double ratings;

    public Theatre(int theatreID, String name, String location, double ratings) {
        this.theatreID = theatreID;
        this.name = name;
        this.location = location;
        this.ratings = ratings;
    }

    public int getTheatreID() {
        return theatreID;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRatings() {
        return ratings;
    }
}

class Showtime {
    private int showtimeID;
    private int movieID;
    private int theatreID;
    private String startTime;
    private String endTime;

    public Showtime(int showtimeID, int movieID, int theatreID, String startTime, String endTime) {
        this.showtimeID = showtimeID;
        this.movieID = movieID;
        this.theatreID = theatreID;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getShowtimeID() {
        return showtimeID;
    }

    public int getMovieID() {
        return movieID;
    }

    public int getTheatreID() {
        return theatreID;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}

class Ticket {
    private int ticketID;
    private int showtimeID;
    private String seats;
    private int userID;
    private double price;

    public Ticket(int ticketID, int showtimeID, String seats, int userID, double price) {
        this.ticketID = ticketID;
        this.showtimeID = showtimeID;
        this.seats = seats;
        this.userID = userID;
        this.price = price;
    }

    public int getTicketID() {
        return ticketID;
    }

    public int getShowtimeID() {
        return showtimeID;
    }

    public String getSeats() {
        return seats;
    }

    public int getUserID() {
        return userID;
    }

    public double getPrice() {
        return price;
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize sample data
        List<Movie> movies = new ArrayList<>();
        List<Theatre> theatres = new ArrayList<>();
        List<Showtime> showtimes = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();

        // Sample data
        movies.add(new Movie(1, "Inception", "Sci-Fi", 148, 8.8));
        movies.add(new Movie(2, "The Shawshank Redemption", "Drama", 142, 9.3));
        theatres.add(new Theatre(1, "Theatre A", "City Center", 4.5));
        theatres.add(new Theatre(2, "Theatre B", "Suburbia Mall", 4.2));
        showtimes.add(new Showtime(1, 1, 1, "15:00", "17:30"));
        showtimes.add(new Showtime(2, 1, 2, "14:30", "17:15"));
        showtimes.add(new Showtime(3, 2, 1, "16:00", "18:30"));

        // User interface (console-based for simplicity)
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Movie Ticket Booking System");
            System.out.println("1. View Movies");
            System.out.println("2. View Theatres");
            System.out.println("3. Book Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewMovies(movies);
                    break;
                case 2:
                    viewTheatres(theatres);
                    break;
                case 3:
                    bookTickets(scanner, showtimes, tickets);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void viewMovies(List<Movie> movies) {
        System.out.println("Available Movies:");
        for (Movie movie : movies) {
            System.out.println("Movie ID: " + movie.getMovieID());
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Duration: " + movie.getDuration() + " minutes");
            System.out.println("Rating: " + movie.getRating());
            System.out.println();
        }
    }

    private static void viewTheatres(List<Theatre> theatres) {
        System.out.println("Available Theatres:");
        for (Theatre theatre : theatres) {
            System.out.println("Theatre ID: " + theatre.getTheatreID());
            System.out.println("Name: " + theatre.getName());
            System.out.println("Location: " + theatre.getLocation());
            System.out.println("Ratings: " + theatre.getRatings());
            System.out.println();
        }
    }

    private static void bookTickets(Scanner scanner, List<Showtime> showtimes, List<Ticket> tickets) {
        System.out.print("Enter your username: ");
        String username = scanner.next();
