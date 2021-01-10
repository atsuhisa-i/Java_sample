import java.io.*;

class Practice1
{
  public static void main(String[] args)
  {
    try{
      PrintWriter pw = new PrintWriter
        (new BufferedWriter(new FileWriter("test1.txt")));
      
      pw.println("A long time ago,");
      pw.println("There was a little girl");
      System.out.println("ファイルに書き込みました。");

      pw.close();
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }
}