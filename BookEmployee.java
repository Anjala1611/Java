import java.util.*;

class Publisher {
    String publisherName;

    public Publisher(Scanner sc) {
        System.out.println("Enter the publisher:");
        publisherName = sc.nextLine();
    }

    public void display() {
        System.out.println("\nPublisher: " + publisherName);
    }
}

class Book extends Publisher implements Runnable {
    String bookName;
    int price;

    public Book(Scanner sc) {
        super(sc);
        System.out.println("Enter book name:");
        bookName = sc.nextLine();
        System.out.println("Enter price of book:");
        price = sc.nextInt();
        sc.nextLine(); // Consume the newline character
    }

    public void run() {
        super.display();
        System.out.println("\nBook Name: " + bookName + "\nPrice: " + price);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Department {
    String departmentName;
    int deptId;

    public Department(Scanner sc) {
        System.out.println("Enter department:");
        departmentName = sc.nextLine();
        System.out.println("Enter department id:");
        deptId = sc.nextInt();
        sc.nextLine(); // Consume the newline character
    }

    public void display() {
        System.out.println("\nDepartment: " + departmentName + "\nDepartment ID: " + deptId);
    }
}

class Employee extends Department implements Runnable {
    int empId;
    String empName;

    public Employee(Scanner sc) {
        super(sc);
        System.out.println("Enter employee id:");
        empId = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter employee name:");
        empName = sc.nextLine();
    }

    public void run() {
        super.display();
        System.out.println("\nEmployee ID: " + empId + "\nEmployee Name: " + empName);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BookEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books:");
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Book[] books = new Book[N];
        for (int i = 0; i < N; i++) {
            books[i] = new Book(sc);
        }

        Employee e1 = new Employee(sc);
        
        // Create threads for each book
        Thread[] bookThreads = new Thread[N];
        for (int i = 0; i < N; i++) {
            bookThreads[i] = new Thread(books[i]);
            bookThreads[i].start();
        }

        // Create a thread for the employee
        Thread t2 = new Thread(e1);
        t2.start();

        // Wait for all threads to finish
        for (int i = 0; i < N; i++) {
            try {
                bookThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}