import java.io.*;

class Practice3
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("身長と体重を入力して下さい。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("身長");
    String str1 = br.readLine();

    System.out.println("体重");
    String str2 = br.readLine();

    Float num1 = Float.parseFloat(str1);
    Float num2 = Float.parseFloat(str2);

    System.out.println("身長は" + num1 + "cmです。");
    System.out.println("体重は" + num2 + "kgです。");
  }
}