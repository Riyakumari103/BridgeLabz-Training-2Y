public class LibraryDemo {
    static class Book {
        static String libraryName = "City Library";

        final String isbn;
        String title;
        String author;

        Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        void displayDetails() {
            if (this instanceof Book) {
                System.out.println("Library: " + libraryName + ", Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
            }
        }

        static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Deepti", "ISBN101");
        Book b2 = new Book("Python Essentials", "Ravi", "ISBN102");

        b1.displayDetails();
        b2.displayDetails();

        Book.displayLibraryName();
    }
}

