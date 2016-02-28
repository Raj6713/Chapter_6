/*Write a program which will find out the square made of the character user input.*/
import java.util.Scanner;
public class Modifiy_square
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=scanner.nextInt();
        System.out.println("Enter character");
        char fill=scanner.next().charAt(0);
        print_square(size,fill);
    }
    public static void print_square(int a,char px)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.printf("%c",px);
            }
            System.out.println();
        }
    }
}