import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ContactBookTest {
    private ContactBook contactBook;

    @BeforeEach
    void setUp() {
        contactBook = new ContactBook(); // Fresh instance for each test
    }

    @Test
    void testAddContact() {
        Contact testContact = new Contact("Test", "1234567890");
        contactBook.addContact(testContact);
        assertEquals(1, contactBook.getNumberOfContacts());
    }

    @Test
    void testAddDuplicateContact() {
        Contact contact1 = new Contact("Alice", "1234567890");
        Contact contact2 = new Contact("Bob", "1234567890");
        contactBook.addContact(contact1);
        assertThrows(IllegalArgumentException.class, () -> contactBook.addContact(contact2));
    }

    @Test
    void testAddContactWhenFull() {
        // Fill the contact book
        for (int i = 0; i < contactBook.getSizeLimit(); i++) {
            contactBook.addContact(new Contact("Name" + i, "Phone" + i));
        }
        assertThrows(IllegalStateException.class, () ->
                contactBook.addContact(new Contact("Extra", "123")));
    }

    @Test
    void testSearchContactByPhone() {
        Contact testContact = new Contact("John", "5551234567");
        contactBook.addContact(testContact);

        Contact found = contactBook.searchContactByPhone("5551234567");
        assertNotNull(found);
        assertEquals("John", found.getName());
        assertEquals("5551234567", found.getPhoneNumber());
    }

    @Test
    void testSearchNonExistentContact() {
        assertNull(contactBook.searchContactByPhone("0000000000"));
    }

    @Test
    void testDeleteContact() {
        Contact testContact = new Contact("Jane", "5559876543");
        contactBook.addContact(testContact);

        assertTrue(contactBook.deleteContactByPhone("5559876543"));
        assertEquals(0, contactBook.getNumberOfContacts());
        assertNull(contactBook.searchContactByPhone("5559876543"));
    }

    @Test
    void testDeleteNonExistentContact() {
        assertFalse(contactBook.deleteContactByPhone("0000000000"));
    }

    @ParameterizedTest
    @CsvSource({
            "Alex, 1239292",
            "Taylor, 23939258",
            "Alice, 33939252",
            "Clark, 43939251",
            "Toni, 53939257"
    })
    void testAddMultipleContacts(String name, String phone) {
        Contact contact = new Contact(name, phone);
        assertDoesNotThrow(() -> contactBook.addContact(contact));
        assertEquals(name, contactBook.searchContactByPhone(phone).getName());
    }
}