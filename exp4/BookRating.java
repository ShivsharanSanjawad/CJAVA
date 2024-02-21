import java.util.Scanner;

class Book {
    String title;
    double[] ratings;

    public Book(String title, int n) {
        this.title = title;
        this.ratings = new double[n];
    }

    public double avgRate() {
        double sum = 0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.length;
    }
}

public class BookRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books:");
        int numBooks = sc.nextInt();
        System.out.println("Enter the number of readers:");
        int numReaders = sc.nextInt();

        Book[][] bookRatings = new Book[numBooks][1]; // Using a 2D array for book ratings

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter the book name:");
            String name = sc.next();
            bookRatings[i][0] = new Book(name, numReaders); // Initializing the Book object for each book
            System.out.println("Enter ratings for Book " + (i + 1) + ":");
            for (int j = 0; j < numReaders; j++) {
                System.out.print("Reader no. " + (j + 1) + ": ");
                double rating = sc.nextDouble();
                if (rating < 0 || rating > 5) {
                    System.out.println("Enter a valid rating (between 0 and 5).");
                    j--; // Prompt the user to re-enter the rating for the current reader
                } else {
                    bookRatings[i][0].ratings[j] = rating; // Storing the rating in the Book object
                }
            }
        }

        // Calculate average rating for each book
        double[] averageRatings = new double[numBooks];
        for (int i = 0; i < numBooks; i++) {
            averageRatings[i] = bookRatings[i][0].avgRate();
        }

        // Find the most popular book
        double max = averageRatings[0];
        int popular = 0;
        for (int i = 1; i < numBooks; i++) {
            if (averageRatings[i] > max) {
                max = averageRatings[i];
                popular = i;
            }
        }

        // Printing the results
        System.out.println("\nAverage ratings:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Book " + (i + 1) + ": " + averageRatings[i]);
        }

        System.out.println("\nThe most popular book is: " + bookRatings[popular][0].title);
    }
}