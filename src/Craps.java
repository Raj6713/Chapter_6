/*Write a program which will simulate the game of craps and will work interactively*/
import java.util.Scanner;
import java.security.SecureRandom;
public class Craps
{
    private static final SecureRandom random1=new SecureRandom();
    private enum Status{LOST,WON,CONTINUE};
    private static final int SNAKE_EYES=2;
    private static final int TREY=3;
    private static final int SEVEN=7;
    private static final int YO_ELEVEN=11;
    private static final int BOX_CARS=12;
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int mypoint=0;
        int sum_of_dice=roll_dice();
        Status myStatus;
        switch(sum_of_dice)
        {
            case SEVEN:case YO_ELEVEN:
            myStatus=Status.WON;
            break;
            case SNAKE_EYES:case TREY:case BOX_CARS:
            myStatus=Status.LOST;
            break;
            default:
                myStatus=Status.CONTINUE;
                System.out.printf("The points are %d\n",mypoint);
                break;
        }
        while(myStatus==Status.CONTINUE)
        {
            sum_of_dice=roll_dice();
            if(sum_of_dice==mypoint)
                myStatus=Status.WON;
            else
                if(sum_of_dice==7)
                    myStatus=Status.LOST;
        }
        if(myStatus==Status.WON)
            System.out.println("Player won");
        else
            System.out.println("Player lost");

    }
    public static int roll_dice()
    {
        int dice1=1+random1.nextInt(6);
        int dice2=1+random1.nextInt(6);
        int sum=dice1+dice2;
        System.out.printf("The player rolled following number: %d\n",sum);
        return sum;
    }
}