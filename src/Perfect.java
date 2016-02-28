/*write a program which will take input a number than check whatever the number is equal to itself*/
import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();
        boolean res=Isperfect(num);
        if(res==true)
            System.out.printf("%d is perfect",num);
        else
            System.out.printf("%d is not perfect",num);
    }
    public static boolean Isperfect(int p)
    {
        int k;
        int r=p;
        int sum=0;
        while(p>0)
        {
            k=r%10;
            r=r/10;
            sum+=k;
        }
        if(sum==r)
            return true;
        else
            return false;
    }
}
