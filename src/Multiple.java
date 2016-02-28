/*Write a program which will take two numbers and will show the output such that the second is multiple of the first
* number or not.*/
import java.util.Scanner;
public class Multiple
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2=scanner.nextInt();
        boolean result=Isresult(num1,num2);
        System.out.println("Result is "+result);
    }
    public static boolean Isresult(int a,int b)
    {
        if(b%a==0)
            return true;
        else
            return false;
    }
}