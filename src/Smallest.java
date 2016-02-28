/*Write a program which will take three integers from the user and than will find out the smallest of them.*/
import java.util.Scanner;
public class Smallest
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2=scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3=scanner.nextInt();
        int small=smallest(num1,num2,num3);
        System.out.printf("The smallest number is given by: %d",small);
    }
    public static int smallest(int a,int b,int c)
    {
        int small=a;
        if(b<small)
            small=b;
        if(c<small)
            small=c;
        return small;
    }
}