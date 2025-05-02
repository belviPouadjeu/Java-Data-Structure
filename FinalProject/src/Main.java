import java.util.List;

public class Main {
    private static final String SERIALIZED_PATH = "src/resources/data/library.ser";
    private static final String BOOKS_FILE_PATH = "src/resources/data/books.txt";

    public static void main(String[] args) {
        try {
            // Initialize
            Library library = new Library();
            LibrarySerializer serializer = new LibrarySerializer();

            // Load data
            loadInitialData(library, serializer);

            // Launch menu
            LibraryMenu menu = new LibraryMenu(library);
            menu.displayMenu();

        } catch (Exception e) {
            System.err.println("A critical error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Application terminated");
        }
    }

    private static void loadInitialData(Library library, LibrarySerializer serializer) {
        System.out.println("Attempting to load library data...");

        // Try loading from serialized file
        List<Book> books = serializer.loadLibrary(SERIALIZED_PATH);

        if (books != null) {
            library.setBooks(books);
            System.out.println("Successfully loaded " + books.size() +
                    " books from serialized file");
        } else {
            // Fallback: load from text file
            System.out.println("No serialized data found, loading from text file...");
            library.loadBooks(BOOKS_FILE_PATH);

            // Immediate save for next session
            if (!library.getBooks().isEmpty()) {
                serializer.saveLibrary(library.getBooks(), SERIALIZED_PATH);
                System.out.println("Created new serialized library file");
            }
        }
    }
}