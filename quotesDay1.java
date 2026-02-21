public class quotesDay1 {
    public static void main(String[] args) {
        String name="Anvitha";
        int age=10;
        double height=9.0 ;
        boolean ownsLaptop=true;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("height: "+height+"cm");
        System.out.println("Owns Laptop: "+ownsLaptop);
        //q:2
        int d=45;
        int e=7;
        System.out.println("d+e: "+(d+e));
        System.out.println("d-e: "+(d-e));
        System.out.println("d*e: "+(d*e));
        System.out.println("d/e: "+(d/e));
        System.out.println("d%e: "+(d%e));
        System.out.println(d+" is even: "+(d%e==0));
        //q:3
        double temperature=36.6;
        int roundedTemperature=(int)temperature;
        System.out.println("Rounded Temperature: "+roundedTemperature+"°C");//it is converted the double value into integer form 
        System.out.println("Original Temperature: "+temperature+"°C");//orginal temperature which is in double form
        //q:4
        double sellingPrice=450;
        double costPrice=380;
        double profit=sellingPrice-costPrice;
        System.out.println("Profit: "+profit);
        double profitPercentage=(profit/costPrice)*100;
        System.out.println("Profit Percentage: "+profitPercentage+"%");
        //q:5
        int marks1=72, marks2=85, marks3=90, marks4=60, marks5=78;
        double totalMarks=marks1+marks2+marks3+marks4+marks5;
        System.out.println("Total marks:"+totalMarks);
       double percentage = (totalMarks / 500.0) * 100;
        System.out.println("percentage:"+percentage+"%");
        System.out.println("Passed or not: " + (percentage >= 40 ? "Passed" : "Failed"));
        System.out.println("Distinction: " + (percentage >= 75 ? "Distinction" : "Not Distinction"));
        //q:6
        long distanceInMeters = 149600000000L;

        long distanceInKilometers = distanceInMeters / 1000;

        System.out.println("Distance in kilometers: " + distanceInKilometers);

        // The letter 'L' is needed because the number is too large for int.
        // By default, integer numbers are treated as int in Java.
        //q:7
        int n=28;
        System.out.println(n +" is a even or od number:"+(n%2));
        //q:8
        int a= 5;
        int b= 2;
        double result = (double)a / b;
        System.out.println("Result: " + result);
        //q:9
        int x= 100;
        int y= 200;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x:"+x);
        System.out.println("y:"+y);

    }
}