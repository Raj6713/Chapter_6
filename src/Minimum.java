/*Write a program which will take three numbers from the user and than will output the minimum number among them*/
import java.util.Scanner;
public class Minimum
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1=scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2=scanner.nextDouble();
        System.out.println("Enter third number: ");
        double num3=scanner.nextDouble();
        double min=minima(num1,num2,num3);
        System.out.println("Minimum value is given by: "+min);
    }
    public static double minima(double a,double b,double c)
    {
        double min_value=a;
        if(b<min_value)
            min_value=b;
        if(c<min_value)
            min_value=c;
        return min_value;

    }
}