import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class FontCls extends Applet{

    Font f1,f2,f3;

    public void init()
    {
        f1 = new Font("Arial",Font.BOLD,18);
        f2 = new Font("Forte",Font.PLAIN,24);
        f3 = new Font("Elephant",Font.ITALIC,28);
        setBackground(Color.CYAN);
    }

    public void paint(Graphics g)
    {
        
        //Color yellow = new Color(75, 253, 45);
        g.drawString("Telent",200,100);
        
        g.setFont(f1);
      //  g.setColor(Color.yellow);
        g.drawString("Computer",200,120);

        g.setFont(f2);
        g.setColor(Color.yellow);
        g.drawString("Vikey",200,140);

        g.setFont(f3);
        g.setColor(Color.yellow);
        g.drawString("Academy",200,160);



    }
    
}
