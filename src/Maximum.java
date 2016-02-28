/*Write a program which will find the maximum value of five given integers using only predefined class*/
import java.util.Scanner;
public class Maximum
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Five Integers: ");
        System.out.println("Enter first:");
        int first=scanner.nextInt();
        System.out.println("Enter second: ");
        int second=scanner.nextInt();
        System.out.println("Enter third: ");
        int third=scanner.nextInt();
        System.out.println("Enter Fourth: ");
        int fourth=scanner.nextInt();
        System.out.println("Enter fifth: ");
        int fifth=scanner.nextInt();
        int result=maxo(first,second,third,fourth,fifth);
        System.out.println("Maximum value is : "+result);
    }
    public static int maxo(int a,int b,int c,int d,int e)
    {
      int maximumvalue=a;
        if(b>maximumvalue)
            maximumvalue=b;
        if(c>maximumvalue)
            maximumvalue=c;
        if(d>maximumvalue)
            maximumvalue=d;
        if(e>maximumvalue)
            e=maximumvalue;
        return maximumvalue;
    }
}