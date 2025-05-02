import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibrarySerializer {

    public void saveLibrary(List<Book> books, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // TODO 21: Serialize book list
            oos.writeObject(books);
            System.out.println("Library successfully saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Failed to save library: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Book> loadLibrary(String fileName) {
        File file = new File(fileName);
        if (!file.exists() || file.length() == 0) {
            System.out.println("No existing library file found or file is empty");
            return null;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // TODO 22: Deserialize book list
            Object deserializedObject = ois.readObject();

            if (deserializedObject instanceof List<?>) {
                // Safe conversion to List<Book>
                List<?> list = (List<?>) deserializedObject;
                if (!list.isEmpty() && list.get(0) instanceof Book) {
                    @SuppressWarnings("unchecked")
                    List<Book> books = (List<Book>) deserializedObject;
                    System.out.println("Successfully loaded " + books.size() + " books from " + fileName);
                    return books;
                }
            }
            System.err.println("File does not contain valid Book data");
            return null;

        } catch (EOFException e) {
            System.err.println("The file is empty or corrupted: " + fileName);
            return null;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading library: " + e.getMessage());
            return null;
        }
    }
}