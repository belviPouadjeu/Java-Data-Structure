
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInteractionLogger {

    private static final String LOG_FILE = "src/resources/data/user_interactions.log";
    private static final DateTimeFormatter TIMESTAMP_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    // Method to log search interactions
    public void logSearch(String searchTerm) {
        log("Search for: " + searchTerm);
    }

    // Method to log sorting interactions
    public void logSort(String sortCriteria) {
        log("Sorted by: " + sortCriteria);
    }

    // Method to log viewing all books
    public void logViewAllBooks() {
        log("Viewed all books");
    }

    // Generic method to log messages with a timestamp
    public void log(String message) {
        // TODO 17: Ouvrir le fichier en mode append
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {

            // TODO 18: Construire le message de log avec timestamp
            String timestamp = LocalDateTime.now().format(TIMESTAMP_FORMAT);
            String logEntry = String.format("[%s] %s\n", timestamp, message);

            writer.write(logEntry);

        } catch (IOException e) {
            // TODO 19: Gestion des erreurs
            System.err.println("Failed to write to log file: " + e.getMessage());
            // On pourrait aussi logger dans la console en cas d'échec
            System.out.println("[FALLBACK LOG] " + LocalDateTime.now() + " - " + message);
        }
    }

}
