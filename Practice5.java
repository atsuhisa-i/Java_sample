import java.awt.*;
import java.awt.event.*;

public class Practice5 extends Frame
{
  Image im;
  int x = 10;
  int y = 10;

  public static void main(String[] args)
  {
    Practice5 pr = new Practice5();
  }
  public Practice5()
  {
    super("サンプル");

    Toolkit tk = getToolkit();
    im = tk.getImage("時計.jpg");

    addWindowListener(new SampleWindowListener());
    addMouseListener(new SampleMouseAdapter());

    setSize(250, 200);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.drawImage(im, x, y, this);
  }

  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
  class SampleMouseAdapter extends MouseAdapter
  {
    public void mousePressed(MouseEvent e)
    {
      x = e.getX();
      y = e.getY();
      repaint();
    }
  }
}