/*Write a program which will take input of the time a car is supposed to be parked and than will output the value pf charges */
import java.util.Scanner;
public class Parking_chargers
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the hours : ");
        int hours=scanner.nextInt();
        double charges=calculate_charge(hours);
        System.out.printf("Charges are given by $ %.2f",charges);
    }
    public static double calculate_charge(int hours)
    {
        double charge;
        charge=0;
        if(hours<=3)
            charge=2;
        else
        {
            charge=(hours-3)*0.50+2;
        }
        if(charge>10.00)
            charge=10.00;
        return charge;
    }
}