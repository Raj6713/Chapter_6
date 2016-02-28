/*Write a program which will randomly assign numbers inbetweent the given limit.*/
import java.util.Scanner;
import java.security.SecureRandom;
public class Random_assigner
{
    public static void main(String[] args)
    {
        SecureRandom random1=new SecureRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int lower=scanner.nextInt();
        System.out.println("Enter upper limit: ");
        int upper=scanner.nextInt();
        int number;
        number=lower+random1.nextInt(upper-lower);
        System.out.printf("The random number is %d",number);
    }
}