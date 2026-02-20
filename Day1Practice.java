public class Day1Practice{
    public static void main(String[] args){
        //Task1 :Variables
        String name="Harshi";
        int age=10;
        double cgpa=9.5;
        boolean isConsistent=false;
        char grade='A';
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Is Consistent: "+isConsistent);
        System.out.println("Grade: "+grade);
        //Task2:Arthematic
        int A=10;
        int B=5;
        System.out.println("A+B: "+(A+B));
        System.out.println("A-B: "+(A-B));
        System.out.println("A*B: "+(A*B));
        System.out.println("A/B: "+(A/B));
        System.out.println("A%B: "+(A%B));
        //task 3:even or odd
        
        if(A%2==0){
            System.out.println(A+" is even.");
        }
        else{
            System.out.println(A+" is odd.");
        }
        //Task 4:logical operators
        double price=58.99;
        int roundedPrice=(int)price;
        System.out.println("Rounded Price: "+roundedPrice);
        System.out.println("orginial price: "+price);
        //Tak 5:Logical operators
        int marks=85;
        boolean isPassed=marks>=40;
        boolean isDistinction=marks>=75;
        System.out.println("Passed: "+isPassed);
        System.out.println("Distinction: "+isDistinction);
        System.out.println("Passed and Distinction: "+(isPassed && isDistinction));
    }
}