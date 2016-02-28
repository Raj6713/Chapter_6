/*write a application which will take two inputs from the user and than will output the hypotonuse*/
import java.util.Scanner;
public class Hypotonuse
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2=scanner.nextInt();
        double num3=hypotonuse(num1,num2);
        System.out.printf("The hypotonuse is %.2f",num3);
    }
    public static double hypotonuse(int a,int b)
    {
        double val=(Math.pow(a,2)+Math.pow(b,2));
        val=Math.sqrt(val);
        return val;
    }
}