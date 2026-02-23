public class Day4 {

    // METHOD DEFINED OUTSIDE main, but inside class
    static int add(int a, int b) {
        int sum=0;
        return a + b;
    }
    void display() {
        System.out.println("Hello");
    }
    static void doubleIt(int n) {
    n = n * 2;  // changes LOCAL copy only
    System.out.println("Inside method: " + n);
}


    public static void main(String[] args) {
        
        // METHOD CALLED INSIDE main
        int result = add(5, 3);           // result = 8
        System.out.println(result);

        System.out.println(add(10, 20));  // directly print — 30
        System.out.println(add(7, 7));    // 14
        
        Day4 d = new Day4(); // Create an instance of the class
       
        d.display(); // Call display() on the instance d
         int x = 5;
        doubleIt(x);
        System.out.println("After method: " + x);  
    }
}