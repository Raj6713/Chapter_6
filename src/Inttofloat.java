import java.util.Scanner;
public class Inttofloat
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int number=scanner.nextInt();
        double num=conversion(number);
        System.out.printf("%f",num);
    }
    public static double conversion(int num)
    {
        return((double)num);
    }
}