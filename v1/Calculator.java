import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {//main function
        Scanner sc = new Scanner(System.in);
        double num1, num2, add, sub, mul, div, sqrt;//variables for numbers

        System.out.print("Enter your first number: ");//prompt1
        num1 = sc.nextDouble();//stores num1

        System.out.print("Enter your second number: ");//prompt2
        num2 = sc.nextDouble();//stores num2
       
        add = num1 + num2;
        System.out.println("The sum is: " + add);
        sub = num1 - num2;
        System.out.println("The answer is: " + sub);
        mul = num1 * num2;
        System.out.println("The product is: " + mul);
        div = num1 / num2;
        System.out.println("The answer is: " + div);
        sqrt = num1;
        System.out.println("The square root of " + num1 + " is: "+ sqrt);

        System.out.print("Thank You, Goodbye!"); 
        
        }
}