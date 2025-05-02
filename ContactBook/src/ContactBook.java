public class ContactBook {
    private static final int MAX_CONTACTS = 10; // Increased from 5 to 10
    private final Contact[] contacts;
    private int numberOfContacts;

    public ContactBook() {
        this.contacts = new Contact[MAX_CONTACTS];
        this.numberOfContacts = 0;
    }

    public int getNumberOfContacts() {
        return numberOfContacts;
    }

    public int getSizeLimit() {
        return MAX_CONTACTS;
    }

    public boolean contactWithSameNumberExists(Contact contact) {
        for (int i = 0; i < numberOfContacts; i++) {
            if (contacts[i].getPhoneNumber().equalsIgnoreCase(contact.getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }

    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }
        if (numberOfContacts >= MAX_CONTACTS) {
            throw new IllegalStateException("Contact book is full");
        }
        if (contactWithSameNumberExists(contact)) {
            throw new IllegalArgumentException("Contact with same phone number already exists");
        }
        contacts[numberOfContacts++] = contact;
    }

    public Contact searchContactByPhone(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty");
        }
        for (int i = 0; i < numberOfContacts; i++) {
            if (contacts[i].getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                return contacts[i];
            }
        }
        return null;
    }

    public boolean deleteContactByPhone(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty");
        }
        for (int i = 0; i < numberOfContacts; i++) {
            if (contacts[i].getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                System.arraycopy(contacts, i + 1, contacts, i, numberOfContacts - i - 1);
                contacts[--numberOfContacts] = null;
                return true;
            }
        }
        return false;
    }
}