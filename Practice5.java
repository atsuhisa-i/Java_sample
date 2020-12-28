import java.io.*;

class Practice5
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("正方形の辺の長さを入力して下さい。");

    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();

    int num = Integer.parseInt(str);
    int ans = num*num;

    System.out.println("正方形の面積は" + ans + "です。");
  }
}