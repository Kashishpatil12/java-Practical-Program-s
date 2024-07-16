import java.awt.*;
import java.applet.*;

public class SecApplet extends Applet
{
    public void paint(Graphics k)
    {
        k.drawOval(50,50,300,300);
        k.setColor(Color.BLACK);
        k.drawOval(40, 40, 200, 200);
       
       
    }

}