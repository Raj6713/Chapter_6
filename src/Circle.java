/*Write a program which will take input of the radius of the circle and than will output the area*/
import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        double radius=scanner.nextDouble();
        double area=calculate_area(radius);
        System.out.printf("The area of the circle is %.3f square unit",area);
    }
    public static double calculate_area(double p)
    {
        return(Math.PI*p*p);
    }
}