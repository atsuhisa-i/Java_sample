import java.awt.*;
import java.awt.event.*;

public class Practice6 extends Frame
{
  boolean bl;

  public static void main(String[] args)
  {
    Practice6 pr = new Practice6();
  }
  public Practice6()
  {
    super("サンプル");

    bl = true;

    addWindowListener(new SampleWindowListener());
    addMouseListener(new SampleMouseAdapter());

    setSize(250, 200);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    if(bl == true){
      g.drawString("こんにちは。", 100, 100);
    }
    else{
      g.drawString("さようなら。", 100, 100);
    }
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
    public void mouseEntered(MouseEvent e)
    {
      bl = true;
      repaint();
    }
    public void mouseExited(MouseEvent e)
    {
      bl = false;
      repaint();
    }
  }
}