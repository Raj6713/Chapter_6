/*Write a program which will find out whatever a number is prime or not.*/
import java.util.Scanner;
public class Prime_number
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scanner.nextInt();
        boolean res=Isprime(number);
        if(res==true)
            System.out.printf("%d is prime. ",number);
        else
            System.out.printf("%d is not prime",number);
    }
    public static boolean Isprime(int k)
    {
        int p=0;
     for(int i=2;i<k;i++)
     {
         if(k%i==0)
             p++;
     }
        if(p==0)
            return true;
        else
            return false;

    }
}