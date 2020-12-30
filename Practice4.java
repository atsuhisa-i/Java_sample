import java.io.*;

class Practice4
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("成績を入力して下さい。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();

    int res = Integer.parseInt(str);

    if(res == 1)
    {
      System.out.println("もっと頑張りましょう。");
    }
    else if(res == 2)
    {
      System.out.println("もう少し頑張りましょう。");
    }
    else if(res == 3)
    {
      System.out.println("さらに上を目指しましょう。");
    }
    else if(res == 4)
    {
      System.out.println("大変よくできました。");
    }
    else if(res == 5)
    {
      System.out.println("大変優秀です。");
    }
    else
    {
      System.out.println("1~5を入力して下さい。");
    }
  }
}