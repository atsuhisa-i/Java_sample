import java.io.*;

class Practice1
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("整数を入力して下さい。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

     String str = br.readLine();

     int num = Integer.parseInt(str);

     if(num % 2 == 0)
     {
       System.out.println(num + "は偶数です。");
     } else {
       System.out.println(num + "は奇数です。");
     }
  }
}