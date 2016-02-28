/*Write a program which will take two sides and will find the output of the hypotonuse */
import java.util.Scanner;
public class Hypo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first side: ");
        double side1=scanner.nextInt();
        System.out.println("Enter second side: ");
        double side2=scanner.nextInt();
        double hypotonuse=calculate(side1,side2);
        System.out.printf("The length of hypotonuse is %f",hypotonuse);
    }
    public static double calculate(double a,double b)
    {
        return(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));

    }
}