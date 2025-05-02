import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void loadBooks(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Ignorer les lignes vides ou commentaires (qui commencent par ;)
                if (line.trim().isEmpty() || line.startsWith(";")) {
                    continue;
                }

                // TODO 1: Parse the line
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    // TODO 2: Create a Book
                    String title = parts[0].trim();
                    String author = parts[1].trim();
                    int year = Integer.parseInt(parts[2].trim());

                    Book book = new Book(title, author, year);

                    // TODO 3: Add to list
                    books.add(book);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Format error in publication year: " + e.getMessage());
        }
    }

    public void viewAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBookByKeyword(String keyword) {
        // TODO 9: Convert to lowercase
        if (keyword == null || keyword.trim().isEmpty()) {
            return null;
        }
        String searchTerm = keyword.toLowerCase().trim();

        // TODO 10: For-each loop through all books
        for (Book book : books) {
            // TODO 11: Check conditions
            if (book.getTitle().toLowerCase().contains(searchTerm) ||
                    book.getAuthor().toLowerCase().contains(searchTerm) ||
                    String.valueOf(book.getPublicationYear()).equals(searchTerm)) {
                return book; // Return first matching book
            }
        }

        return null; // No book found
    }

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}