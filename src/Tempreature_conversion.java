/*Write a program which will write a program which will do the tempreature conversion and will show it on the screen*/
import java.util.Scanner;
public class Tempreature_conversion
{

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter choice:\n1>Farenhit to celsius\n2>Celsius to farenhit\n");
        int choice=scanner.nextInt();
        switch(choice)
        {
            case 1:
                f_to_c();
                break;
            case 2:
                c_to_f();
                break;
            default:
                System.out.println("Wrong choice: ");
                break;
        }

    }
    public static void f_to_c()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter tempreature in farenhit: ");
        double farenhit=scanner.nextDouble();
        double celsius=(5.0/9.0)*(farenhit-32.0);
        System.out.println("Farenhit equivalent: "+celsius);
    }
    public static void c_to_f()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter tempreature in celsius: ");
        double celsius=scanner.nextDouble();
        double farenhit=(9.0/5/0)*celsius+32;
        System.out.println("Farenhit equivalent: "+farenhit);

    }



}