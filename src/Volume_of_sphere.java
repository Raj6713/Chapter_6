/*Write a program which will find out the volume of the sphere where the radius will be input by the user.*/
import java.util.Scanner;
public class Volume_of_sphere
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radius of sphere: ");
        double rad=scanner.nextDouble();
        double volume=vol(rad);
        System.out.printf("Volume is %.4f for radius of %.2f",volume,rad);
    }
    public static double vol(double value)
    {
        return((4.0/3.0)*Math.pow(value,3)*Math.PI);
    }
}