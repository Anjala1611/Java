import java.util.*;

class Names {
    String name;

    public Names(Scanner sc) {
        System.out.println("Enter the name:");
        this.name = sc.nextLine();
    }

    public String getName() {
        return name;
    }
}

public class CollectionExample {
    private static ArrayList<Names> namesList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enter name\n2. Reverse names\n3. Search for a name\n4. Sort names\n5. Display names\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Names newName = new Names(sc);
                    namesList.add(newName);
                    break;

                case 2:
                    Collections.reverse(namesList);
                    System.out.println("Names reversed.");
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Names n : namesList) {
                        if (n.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Name found: " + n.getName());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Name not found.");
                    }
                    break;

                case 4:
                    namesList.sort(Comparator.comparing(Names::getName));
                    System.out.println("Names sorted.");
                    break;

                case 5:
                    System.out.println("Names in the list:");
                    for (Names n : namesList) {
                        System.out.println(n.getName());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}