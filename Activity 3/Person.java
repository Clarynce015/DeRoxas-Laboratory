// package Activity 3;
import java.util.Scanner;

public class Person{
    private String name;
    private int id;
 
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
   
 
        public class SchoolTest {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Here is the school information:");
            System.out.println("School Name: Aral tayu High School");
            System.out.println("Here is the School Management System:");
            System.out.println("Select an option to view details:");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Staff");
            System.out.print("Please choose from (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 1) {
                System.out.println("\nStudents Details:");
                Student student = new Student("Dane Belenia", 202367890, "8th Grade");
                student.display();
            } else if (choice == 2) {
                System.out.println("\nTeacher Details:");
                Teacher teacher = new Teacher("Kuya Brown", 202398765, "Physics");
                teacher.display();
            } else if (choice == 3) {
                System.out.println("\nStaff Details:");
                Staff staff = new Staff("Alice Go", 202354321, "Sciences Department");
                staff.display();
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }

            scanner.close();
        }
    }
}
