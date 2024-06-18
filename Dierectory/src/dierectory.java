import java.util.Scanner;

class DirectoryEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private int uniqueID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }
}

class Directory {
    private DirectoryEntry[] entries;
    private int size;
    private static final int MAX_ENTRIES = 100;

    public Directory() {
        entries = new DirectoryEntry[MAX_ENTRIES];
        size = 0;
    }

    public void createEntry(DirectoryEntry entry) {
        if (size < MAX_ENTRIES) {
            entries[size++] = entry;
            System.out.println("Entry created successfully.");
        } else {
            System.out.println("Directory is full. Cannot add more entries.");
        }
    }

    public void editEntry(int uniqueID, String newName, String newAddress, String newTelephoneNumber, String newMobileNumber, String newHeadOfFamily) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getUniqueID() == uniqueID) {
                entries[i].setName(newName);
                entries[i].setAddress(newAddress);
                entries[i].setTelephoneNumber(newTelephoneNumber);
                entries[i].setMobileNumber(newMobileNumber);
                entries[i].setHeadOfFamily(newHeadOfFamily);
                System.out.println("Entry edited successfully.");
                return;
            }
        }
        System.out.println("Entry not found with the given Unique ID.");
    }

    public void searchEntry(String keyword) {
        System.out.println("Search Results:");
        for (int i = 0; i < size; i++) {
            DirectoryEntry entry = entries[i];
            if (entry.getName().contains(keyword) || entry.getAddress().contains(keyword) ||
                    entry.getTelephoneNumber().contains(keyword) || entry.getMobileNumber().contains(keyword) ||
                    entry.getHeadOfFamily().contains(keyword)) {
                System.out.println("Name: " + entry.getName());
                System.out.println("Address: " + entry.getAddress());
                System.out.println("Telephone Number: " + entry.getTelephoneNumber());
                System.out.println("Mobile Number: " + entry.getMobileNumber());
                System.out.println("Head of Family: " + entry.getHeadOfFamily());
                System.out.println("Unique ID: " + entry.getUniqueID());
                System.out.println();
            }
        }
    }
}

public class dierectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    DirectoryEntry entry = new DirectoryEntry();
                    System.out.print("Enter name: ");
                    entry.setName(scanner.nextLine());
                    System.out.print("Enter address: ");
                    entry.setAddress(scanner.nextLine());
                    System.out.print("Enter telephone number (if available with STD code): ");
                    entry.setTelephoneNumber(scanner.nextLine());
                    System.out.print("Enter mobile number (if available): ");
                    entry.setMobileNumber(scanner.nextLine());
                    System.out.print("Enter head of family: ");
                    entry.setHeadOfFamily(scanner.nextLine());
                    System.out.print("Enter unique ID number: ");
                    entry.setUniqueID(scanner.nextInt());
                    scanner.nextLine();  // Consume newline
                    directory.createEntry(entry);
                    break;
                case 2:
                    System.out.print("Enter unique ID of entry to edit: ");
                    int uniqueID = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new telephone number: ");
                    String newTelephoneNumber = scanner.nextLine();
                    System.out.print("Enter new mobile number: ");
                    String newMobileNumber = scanner.nextLine();
                    System.out.print("Enter new head of family: ");
                    String newHeadOfFamily = scanner.nextLine();
                    directory.editEntry(uniqueID, newName, newAddress, newTelephoneNumber, newMobileNumber, newHeadOfFamily);
                    break;
                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    directory.searchEntry(keyword);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
