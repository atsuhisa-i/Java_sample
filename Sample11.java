class Sample11
{
  public static void main(String[] args)
  {
    int num1 = 5;
    int num2 = 4;

    // 下記の書き方だとint型で出力されるため、結果は1.0となる。
    // double div = num1 / num2;

    // 下記の書き方でdouble型の演算が行われるようになり、結果が1.25となる。
    double div = (double)num1 / (double)num2;

    System.out.println("5/4は" + div + "です。");
  }
}