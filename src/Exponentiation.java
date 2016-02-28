/*Write a program which will take input of two numbers base and power and than will show the output of it.*/
import java.util.Scanner;
public class Exponentiation
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Base: ");
        double base=scanner.nextDouble();
        System.out.println("Enter power: ");
        double power=scanner.nextDouble();
        double value=calculate(base,power);
        System.out.printf("%f^%f is %f",base,power,value);
    }
    public static double calculate(double a,double b)
    {
        double val;
        val=Math.pow(a,b);
        return val;
    }
}