import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();       // reads a full line of text
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();            // reads an integer
        
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();     // reads a decimal
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);     // reads first character of input
        
        System.out.println("Hello " + name + "! Age: " + age + ", CGPA: " + cgpa + ", Character: " + ch);
        int marks = 72;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");   // this prints — 72 >= 70 is true
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F — Failed");
        }
        int age1= 20;
        boolean hasID = true;

        if (age1>= 18) {
            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("Age OK but bring your ID.");
        }
        } else {
            System.out.println("Entry not allowed. Too young.");
        }
        int age2= 10;

        switch (age2/ 10) {

        case 0:  // 0–9
            if (age2<= 5)
                System.out.println("Ticket: Free");
            else
                System.out.println("Ticket: ₹100");
                break;

         case 1:  // 10–19
            if (age2<= 12)
                System.out.println("Ticket: ₹100");
            else
                System.out.println("Ticket: ₹200");
                break;

        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("Ticket: ₹200");
            break;

        default:  // 60+
            System.out.println("Ticket: ₹120 (Senior Citizen Discount)");
        }
        sc.close();// good practice to close scanner when done
    }
}