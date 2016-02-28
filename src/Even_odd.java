/*Write a program which will find whatever a number is even or odd.*/
import java.util.Scanner;
public class Even_odd
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=scanner.nextInt();
        boolean result=Iseven_odd(number);
        if(result==true)
            System.out.printf("%d is Even",number);
        else if(result==false)
            System.out.printf("%d is odd ",number);
    }
    public static boolean Iseven_odd(int a)
    {
        if(a%2==0)
            return true;
        else
            return false;
    }
}