/*Write a program which will show the usage of method overloading.*/
public class Overloading
{
    public static void main(String[] args)
    {

        System.out.printf("The square of 10 is %d\n",square(10));
        System.out.printf("The square of 10.5 is %f\n",square(10.5));
        
    }

    public static int square(int value)
    {
        int val=value*value;
        return val;
    }
    public static double square(double value)
    {
     double val=value*value;
        return val;
    }

}