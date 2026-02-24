public class quotesDay4{
    //q:1
    static int multiply(int a,int b){
        return a*b;
    }
    //q:2
    static void printStars(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    //q:3
    static double celsiusToFahrenheit(double c){
        double F=((c * 9/5)+32);
        return F;
    }
    //q:4
    static boolean isPalindrome(int n){
        int original=n;
        int reverse=0;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n/=10;
        }
        return original==reverse;
    }
    //q:5
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    //q:6
    static void printPattern(int n1){
        for(int i=1;i<=n1;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
        //q:7
    static int power(int base,int exp){
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
         return result;
        }
    static double power(double base,int exp){
        double result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
         return result;
        }
    //q:8
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    //q:9
   
static int digitCount(int n) {
    if (n == 0) return 1;  // edge case
    int count = 0;
    while (n > 0) {
        n /= 10;
        count++;
    }
    return count;
}
    public static void main(String[] args){
        //q:1
        System.out.println(multiply(3,6));
        System.out.println(multiply(8,9));
        System.out.println(multiply(3,10));
        //q:2
        printStars(8);
        printStars(10);
        printStars(4);
        //q:3
        System.out.println(celsiusToFahrenheit(0));
        System.out.println(celsiusToFahrenheit(100));
        //q:4
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(1221));
        //q:5
        System.out.println(gcd(48,18));
        System.out.println(gcd(56,98));
        System.out.println(gcd(101,10));
        //q:6
        printPattern(3);
        printPattern(5);
        printPattern(7);
        //q:7
        System.out.println(power(2,10));
        System.out.println(power(2.5,3));
        //q:8
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(12));
        //q:9
        System.out.println(digitCount(12345));
        System.out.println(digitCount(987654321));
        System.out.println(digitCount(1000));
        

    }
}