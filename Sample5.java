class Sample5
{
  public static void main(String[] args)
  {
    int i = 1;

    while(i <= 5){
      System.out.println(i + "番目の繰り返しです。");
      // 下記を記述しておかないと永久にwhile文の処理が繰り返されてプログラムが終了しない。
      i++;
    }
    System.out.println("繰り返しが終わりました。");
  }
}