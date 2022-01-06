import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        printStaticSum();
        // create a object of scanner class 
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number ");
        int num2 = scanner.nextInt();
        int num3 = num1+num2;
        // num1 + num2 = num3
        System.out.println(num1+" + "+num2+" = "+num3);
        
    }

    public static void printStaticSum()
    {
        int a = 20;
        int b = 30;
        int c = a+b;
        System.out.println("sum of "+a+" and "+b+" is "+c);
    }
}
