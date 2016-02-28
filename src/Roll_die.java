/*Write a program which will roll a dice by the user given number and will sho output on the screen.*/
import java.util.Scanner;
import java.security.SecureRandom;
public class Roll_die
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        SecureRandom random1=new SecureRandom();
        System.out.println("Enter how many times you want to roll die: ");
        int roll=scanner.nextInt();
        for(int i=1;i<=roll;i++)
        {
            int face=1+random1.nextInt(6);
            System.out.printf("%d ",face);
            if(i%5==0)
                System.out.println();
        }
    }
}