import java.io.*;

class Practice3
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("文字列を入力して下さい");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();

    StringBuffer sb = new StringBuffer(str);
    sb.reverse();

    System.out.println(str + "の文字順を逆にすると" + sb + "になります。");
    
  }
}