import java.io.*;

class Practice2
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("テストの点数を入力して下さい。(0で終了)");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    int num = 0;
    int sum = 0;

    do{
      String str = br.readLine();
      num = Integer.parseInt(str);
      sum += num;
    }while(num != 0);
    
    System.out.println("テストの合計点は" + sum + "点です。");
  }
}