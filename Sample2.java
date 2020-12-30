class Sample2
{
  public static void main(String[] args)
  {
    for(int i=1; i<=5; i++){
      System.out.println(i + "番目の繰り返しです。");
    }
    System.out.println("繰り返しが終わりました。");

    // for文のブロック外でiを使用したい場合はfor文を始める前にiを宣言する。
    int i;
    for(i=1; i<=5; i++){
      System.out.println(i + "番目の繰り返しです。");
    }
    System.out.println((i-1) + "回繰り返しました。");
  }
}