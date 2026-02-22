import java.util.Scanner;
public class quotesDay2 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        //q:1
        System.out.println("The number is: " );
        int num=sc.nextInt();
        
        if (num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        //q:2
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Larger number is: " + num1);
        } 
        else if (num2 > num1) {
            System.out.println("Larger number is: " + num2);
        } 
        else {
            System.out.println("Both are equal.");
        }
        //q:3
        System.out.print("Enter month number: ");
        int month = sc.nextInt();
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month.");
        }
        //q:4
        System.out.print("Enter your person's age: ");
        int personAge=sc.nextInt();
        if (personAge < 13) {
             System.out.println("Child");
        } else if (personAge <= 17) {
             System.out.println("Teenager");
        } else if (personAge <= 25) {
            System.out.println("Young Adult");
        } else if (personAge <= 60) {
            System.out.println("Adult");
        } else {
             System.out.println("Senior Citizen");
        }
        //q:5
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        }
        else if (units <= 300) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        }
        else {
            bill = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 4.00);
        }

        System.out.println("Total Bill: ₹" + bill);
        //q:6
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        //q:7
        System.out.print("Enter three numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("Largest number is: "+max);
        //q:8
        System.out.print("Enter username: ");
        String name = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        String correctUsername = "anvitha";
        String correctPassword = "java123";

        if (name.equals(correctUsername) && password.equals(correctPassword)) {
             System.out.println("Login successful");
        }
        
        else if (!name.equals(correctUsername)) {
            System.out.println("Wrong username");
        }
        else {
             System.out.println("Wrong password");
        }    
        //q:9
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String[] result = {"Odd", "Even"};
        System.out.println(result[number % 2]);

    }
}