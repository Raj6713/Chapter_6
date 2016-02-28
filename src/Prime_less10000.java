/*Write a program which will find the numbers which are prime and less than 10000*/
import java.util.Scanner;
public class Prime_less10000
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Primes in between 2 to 10000");
        for(int i=2;i<=10000;i++)
        {
            boolean res=Isprime(i);
            if(res==true)
                System.out.printf("%d is prime",i);
        }
    }
    public static boolean Isprime(int i)
    {
        int k=0;
        for(int j=2;j<i;i++)
        {
            if(i%j==0)
                k++;
        }
        if(k==0)
            return true;
        else
            return false;
    }
}