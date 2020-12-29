import java.io.*;

class Practice2
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("2つの整数を入力して下さい。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    String str1 = br.readLine();
    String str2 = br.readLine();

    int res1 = Integer.parseInt(str1);
    int res2 = Integer.parseInt(str2);

    if(res1 == res2)
    {
      System.out.println("2つの数は同じ値です。");
    }else if(res1 < res2)
    {
      System.out.println(res1 + "より" + res2 + "の方が大きい値です。");
    }else{
      System.out.println(res1 + "の方が" + res2 + "より大きい値です。");
    }
  }
}