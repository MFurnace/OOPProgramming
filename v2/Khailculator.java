import java.util.Scanner;

public class Khailculator extends MagicCalculator{

    public static void main(String[] args) {//main function
        Scanner sc = new Scanner(System.in);
        double num1, num2, sqrt, cos, tan,fact;//variables for numbers

        System.out.print("Enter your first number: ");//prompt1
        num1 = sc.nextDouble();//stores num1

        System.out.print("Enter your second number: ");//prompt2
        num2 = sc.nextDouble();//stores num2

        MagicCalculator mc = new MagicCalculator(num1, num2);
        System.out.println(mc.sqrt);
        System.out.println(mc.cos);
        System.out.println(mc.tan);
        System.out.println(mc.factorial);


}
}