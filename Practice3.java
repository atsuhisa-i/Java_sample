import java.awt.*;
import java.awt.event.*;

public class Practice3 extends Frame
{
  int x = 50;
  int y = 50;

  public static void main(String[] args)
  {
    Practice3 pr = new Practice3();
  }
  public Practice3()
  {
    super("サンプル");

    addWindowListener(new SampleWindowListener());

    setSize(250, 200);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.RED);
    g.fillRect(x, y, 100, 100);
  }

  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
}