/*Write a program which will take a number and than will round it upto the nearest digit and will show it on the screen.*/
import java.util.Scanner;
public class Rounder
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number=scanner.nextInt();
        int value=rounder(number);
        System.out.printf("Nearest integer is %d",value);
    }
    public static int rounder(double num)
    {
        double val;
        val=num+0.5;
        val=Math.floor(val);
       int kal=(int)val;
        return kal;

    }
}