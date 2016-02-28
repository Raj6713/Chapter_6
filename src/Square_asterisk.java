/*Write a program which will print the square of asterisk */
import java.util.Scanner;
public class Square_asterisk
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=scanner.nextInt();
        square_printer(size);
    }
    public static void square_printer(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}