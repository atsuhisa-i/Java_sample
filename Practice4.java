import java.io.*;

class Practice4
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("文字列を入力して下さい。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();


    System.out.println("aの挿入位置を整数で入力して下さい");

    String str2 = br.readLine();
    int num = Integer.parseInt(str2);

    String strin = "a";
    StringBuffer sb = new StringBuffer(str);
    sb.insert(num, strin);

    System.out.println(sb + "になりました。");
  }
}