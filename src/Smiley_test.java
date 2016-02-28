/*This class tests the working of the smiley class and will show it on the scren.*/
import javax.swing.JFrame;
public class Smiley_test
{
    public static void main(String[] args)
    {
        Smiley new_smiley=new Smiley();
        JFrame application=new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(new_smiley);
        application.setSize(600,600);
        application.setVisible(true);
    }
}