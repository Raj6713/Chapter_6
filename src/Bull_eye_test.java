/*Write a program which will test whatever a java program will print the bull eye or not.*/
import javax.swing.JFrame;
public class Bull_eye_test
{
    public static void main(String[] args)
    {
        Bull_eye new_eye=new Bull_eye();
        JFrame application=new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(new_eye);
        application.setSize(600,600);
        application.setVisible(true);
    }
}