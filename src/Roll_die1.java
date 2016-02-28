/*Write a program in java which will roll a die 60000 times and than will count the frequency of the faces.*/
import java.util.Scanner;
import java.security.SecureRandom;
public class Roll_die1
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        SecureRandom random1=new SecureRandom();
        System.out.println("Enter the total number for rolling dice: ");
        int rolls=scanner.nextInt();
        int f1,f2,f3,f4,f5,f6;
        f1=f2=f3=f4=f5=f6=0;
        for(int i=0;i<rolls;i++) {
            int face = 1 + random1.nextInt(6);
            switch (face) {
                case 1:
                    ++f1;
                    break;
                case 2:
                    ++f2;
                    break;
                case 3:
                    ++f3;
                    break;
                case 4:
                    ++f4;
                    break;
                case 5:
                    ++f5;
                    break;
                case 6:
                    ++f6;
                    break;
            }
        }
            System.out.printf("%d\t%d\t%d\n%d\t%d\n%d\t%d\n%d\t%d\n%d\t%d\n%d\t%d\n",
                    1,f1,2,f2,3,f3,4,f4,5,f5,6,f6);
    }
}
