import java.io.*;

class Practice1
{
  public static void main(String[] args)
  {
    if(args.length !=1){
      System.out.println("ファイル名を正しく指定して下さい。");
      System.exit(1);
    }
    try{

      PrintWriter pw = new PrintWriter
      (new BufferedWriter(new FileWriter(args[0])));
      
      pw.println("A long time ago,");
      pw.println("There was a little girl.");
      pw.close();
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }
}