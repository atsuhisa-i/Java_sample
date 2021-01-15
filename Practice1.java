import java.awt.*;
import java.awt.event.*;

public class Practice1 extends Frame 
{
  private Label lb;

  public static void main(String[] args)
  {
    Practice1 pr = new Practice1(); 
  }
  public Practice1()
  {
    super("サンプル");

    lb = new Label("Hello");

    add(lb);

    lb.setForeground(Color.blue);
    lb.setFont(new Font("Serif", Font.ITALIC, 32));

    addWindowListener(new SampleWindowListener());

    setSize(250, 200);
    setVisible(true);
  }

  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
}