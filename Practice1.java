import java.io.*;

class Practice1
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];
    System.out.println(test.length + "人のテストの点数を入力して下さい。");

    for(int i=0; i<test.length; i++){
      String str = br.readLine();
      int res = Integer.parseInt(str);
      test[i] = res;
    }

    int max = 0;

    for(int i=0; i<test.length; i++){
      if(max < test[i]){
        max = test[i];
      }
    }
    
    for(int i=0; i<test.length; i++ )
    {
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
    }

    System.out.println("最高点は" + max + "点です。");
  }
}