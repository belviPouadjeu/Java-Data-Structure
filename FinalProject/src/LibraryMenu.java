import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LibraryMenu {
    private Library library;
    private UserInteractionLogger logger;
    private LibrarySerializer serializer;

    public LibraryMenu(Library library) {
        this.library = library;
        this.logger = new UserInteractionLogger();
        this.serializer = new LibrarySerializer();

        // Log startup
        logger.log("LibraryMenu initialized");

        // Load books
        List<Book> books = serializer.loadLibrary("src/resources/data/library.ser");
        if (books != null) {
            library.setBooks(books);
            logger.log("Library loaded from serialized file");
        } else {
            library.loadBooks("src/resources/data/books.txt");
            logger.log("Library loaded from text file");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        logger.log("Menu displayed");

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. View all books");
            System.out.println("2. Sort books by title");
            System.out.println("3. Sort books by author");
            System.out.println("4. Sort books by year");
            System.out.println("5. Search for a book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        library.viewAllBooks();
                        logger.log("User viewed all books");
                        break;

                    case 2:
                        SortUtil.bubbleSort(library.getBooks(), Comparator.comparing(Book::getTitle));
                        logger.log("User sorted books by title");
                        library.viewAllBooks();
                        break;

                    case 3:
                        SortUtil.insertionSort(library.getBooks(), Comparator.comparing(Book::getAuthor));
                        logger.log("User sorted books by author");
                        library.viewAllBooks();
                        break;

                    case 4:
                        SortUtil.quickSort(library.getBooks(),
                                Comparator.comparingInt(Book::getPublicationYear),
                                0,
                                library.getBooks().size() - 1);
                        logger.log("User sorted books by publication year");
                        library.viewAllBooks();
                        break;

                    case 5:
                        System.out.print("Enter search term: ");
                        String term = scanner.nextLine();
                        Book found = library.searchBookByKeyword(term);
                        if (found != null) {
                            System.out.println("Found: " + found);
                            logger.log("User searched for '" + term + "' - found");
                        } else {
                            System.out.println("No book found");
                            logger.log("User searched for '" + term + "' - not found");
                        }
                        break;

                    case 6:
                        serializer.saveLibrary(library.getBooks(), "src/resources/data/library.ser");
                        logger.log("User exited program - library saved");
                        System.out.println("Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                        logger.log("User entered invalid menu option: " + choice);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
                logger.log("User entered non-numeric menu option");
            }
        }
    }
}