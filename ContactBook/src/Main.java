public class Main {
    public static void main(String[] args) {
        ContactBook book = new ContactBook();
        Contact c1 = new Contact("Alice", "12345");
        book.addContact(c1);
        System.out.println("Added contact: " + c1.getName());

        Contact found = book.searchContactByPhone("12345");
        System.out.println("Found contact: " + (found != null ? found.getName() : "Not found"));
    }
}
