import java.awt.*;
import java.awt.event.*;

public class Practice7 extends Frame implements Runnable
{
  int num;
  int x;

  public static void main(String[] args)
  {
    Practice7 pr = new Practice7();
  }
  public Practice7()
  {
    super("サンプル");

    num = 0;
    x = 0;

    addWindowListener(new SampleWindowListener());

    Thread th;
    th = new Thread(this);
    th.start();

    setSize(250, 200);
    setVisible(true);
  }
  public void run()
  {
    try{
      for(int i=0; i<10; i++){
        num = i;
        x = i * 10;
        repaint();
        Thread.sleep(1000);
      }
    }catch(InterruptedException e){}
  }
  public void paint(Graphics g)
  {
    String str = "横にズレます。";
    g.drawString(str, x+100, 100);
  }
  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
}