class Sample10
{
  public static void main(String[] args)
  {
    int[][] test;
    test = new int[2][5];

    // 多次元配列は下記のような書き方も上と同じ結果となる
    // int[][] test = new int[2][5];

    test[0][0] = 80;
    test[0][1] = 60;
    test[0][2] = 22;
    test[0][3] = 50;
    test[0][4] = 75;
    test[1][0] = 90;
    test[1][1] = 55;
    test[1][2] = 68;
    test[1][3] = 72;
    test[1][4] = 58;

    // また、宣言・要素の確保時に下記のように値を代入して初期化することも可能
    // int[][] test = {
    //   {80,60,22,50,75},{90,55,68,72,58}
    // };

    for(int i=0; i<5; i++){
      System.out.println((i+1) + 
        "番目の人の国語の点数は" + test[0][i] + "です。");
      System.out.println((i+1) + 
        "番目の人の算数の点数は" + test[1][i] + "です。");
    }
  }
}