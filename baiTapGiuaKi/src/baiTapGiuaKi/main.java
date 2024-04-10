package baiTapGiuaKi;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the type of employee to input:");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 4) {
                break; // Exit the loop if the user chooses to exit
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter information for Experience employee:");
                    employees.add(inputExperience(scanner));
                    break;
                case 2:
                    System.out.println("Enter information for Fresher employee:");
                    employees.add(inputFresher(scanner));
                    break;
                case 3:
                    System.out.println("Enter information for Intern employee:");
                    employees.add(inputIntern(scanner));
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        EmployeeManager.writeEmployeesToFile(employees);

        List<Employee> loadedEmployees = EmployeeManager.readEmployeesFromFile();

        for (Employee emp : loadedEmployees) {
            emp.showInfo();
            System.out.println();
        }
    }

    public static Experience inputExperience(Scanner scanner) {
    	System.out.println("Enter ID:");
        String ID = scanner.nextLine();
        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter Birth Day:");
        String birthDay = scanner.nextLine();
        System.out.println("Enter Phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter Email:");
        String email = scanner.nextLine();
        System.out.println("Enter Experience In Year:");
        int expInYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter Professional Skill:");
        String proSkill = scanner.nextLine();
        
        return new Experience(ID, fullName, birthDay, phone, email, expInYear, proSkill);
    }

    public static Fresher inputFresher(Scanner scanner) {
    	System.out.println("Enter ID:");
        String ID = scanner.nextLine();
        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter Birth Day:");
        String birthDay = scanner.nextLine();
        System.out.println("Enter Phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter Email:");
        String email = scanner.nextLine();
        System.out.println("Enter Graduation Date:");
        String graduationDate = scanner.nextLine();
        System.out.println("Enter Graduation Rank:");
        String graduationRank = scanner.nextLine();
        System.out.println("Enter Education:");
        String education = scanner.nextLine();
        
        return new Fresher(ID, fullName, birthDay, phone, email, graduationDate, graduationRank, education);
    }

    public static Intern inputIntern(Scanner scanner) {
    	System.out.println("Enter ID:");
        String ID = scanner.nextLine();
        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter Birth Day:");
        String birthDay = scanner.nextLine();
        System.out.println("Enter Phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter Email:");
        String email = scanner.nextLine();
        System.out.println("Enter Majors:");
        String majors = scanner.nextLine();
        System.out.println("Enter Semester:");
        String semester = scanner.nextLine();
        System.out.println("Enter University Name:");
        String universityName = scanner.nextLine();
        
        return new Intern(ID, fullName, birthDay, phone, email, majors, semester, universityName);
    }
    }
