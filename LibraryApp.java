
import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) { super(msg); }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String msg) { super(msg); }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String msg) { super(msg); }
}
class Library {
    private Map<String, Boolean> books = new HashMap<>(); 
    private Map<String, List<String>> userRecords = new HashMap<>(); 
    private final int MAX_BORROW = 5;

    public void addBook(String title) {
        books.put(title, true); 
    }
    public void borrowBook(String user, String bookTitle) 
            throws BookNotAvailableException, UserLimitExceededException {
        userRecords.putIfAbsent(user, new ArrayList<>());
        List<String> borrowed = userRecords.get(user);

        if (borrowed.size() >= MAX_BORROW) {
            throw new UserLimitExceededException(user + " has reached the borrow limit!");
        }

        Boolean available = books.get(bookTitle);
        if (available == null || !available) {
            throw new BookNotAvailableException("Book '" + bookTitle + "' is not available.");
        }

        borrowed.add(bookTitle);
        books.put(bookTitle, false); 
        System.out.println(user + " successfully borrowed '" + bookTitle + "'");
    }
    public void returnBook(String user, String bookTitle) throws InvalidReturnException {
        List<String> borrowed = userRecords.get(user);
        if (borrowed == null || !borrowed.remove(bookTitle)) {
            throw new InvalidReturnException(user + " did not borrow '" + bookTitle + "'");
        }

        books.put(bookTitle, true); 
        System.out.println(user + " successfully returned '" + bookTitle + "'");
    }
}
public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Add sample books
        library.addBook("Java Basics");
        library.addBook("Python Fundamentals");
        library.addBook("Data Structures");

        String user = "Alice";
        try {
            library.borrowBook(user, "Java Basics");  
            library.borrowBook(user, "Java Basics");  
        } catch (BookNotAvailableException | UserLimitExceededException e) {
            System.out.println("Borrow Error: " + e.getMessage());
        }

        try {
            library.returnBook(user, "Python Fundamentals");
        } catch (InvalidReturnException e) {
            System.out.println("Return Error: " + e.getMessage());
        }

        try {
            library.borrowBook(user, "Python Fundamentals");
            library.borrowBook(user, "Data Structures");
            library.addBook("Algorithms");
            library.addBook("Databases");
            library.addBook("Networking");
            library.borrowBook(user, "Algorithms");
            library.borrowBook(user, "Databases");
            library.borrowBook(user, "Networking");
        } catch (BookNotAvailableException | UserLimitExceededException e) {
            System.out.println("Borrow Error: " + e.getMessage());
        }
    }
}
