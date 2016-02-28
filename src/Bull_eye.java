/*Write a program which will create a bull eye and than will show it on the screen.*/
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class Bull_eye extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillOval(10,10,200,200);

        g.setColor(Color.cyan);
        g.fillOval(20,10,100,100);

        g.setColor(Color.green);
        g.fillOval(10,10,50,50);

        g.setColor(Color.darkGray);
        g.fillOval(10,10,25,25);

        g.setColor(Color.BLACK);
        g.fillOval(10,10,1,1);

        g.setColor(Color.GREEN);
        g.fillOval(20,20,2,2);

    }

}