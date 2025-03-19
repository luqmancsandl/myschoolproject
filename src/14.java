
import java.util.*;

public class MySchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name and grade level
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your grade level (1-12): ");
        int gradeLevel = scanner.nextInt();

        // Output a personalized message
        System.out.println("Welcome to the My School Project, " + name + "! You are in " + gradeLevel + "th grade.");
    }
}