import java.util.Scanner;
public class Day3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int num = -1;
while (num < 0) {
    System.out.print("Enter a positive number: ");
    num = sc.nextInt();
    if (num < 0) {
        System.out.println("Invalid! Try again.");
    }
}
System.out.println("You entered: " + num);
//practice:
int n=5;
for(int i=0;i<=n;i++){
    //,spaces
    for(int j=0;j<=n-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=0;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}
//practice 2:
int n1=5;
for(int i=0;i<n1;i++){
    //,spaces
    for(int j=0;j<n1-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=0;j<2*i+1;j++){
        System.out.print("*");
    }
    //spaces
    for(int j=0;j<n1-i;j++){
        System.out.print(" ");
    }
    System.out.println();
}
int rows=4;int col=5;
for(int i=0;i<=rows;i++){
    //matrix
    for(int j=0;j<=col;j++){
        if(i==0||i==n-1||j==0||j==n-1){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
    
    }
    System.out.println();
}

    }
}