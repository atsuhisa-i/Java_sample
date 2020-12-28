class Sample7
{
  public static void main(String args[])
  {
    // 下記は1+2にカッコを付けないと文字列として連結される。
    System.out.println("1+2は" + 1+2 + "です。");
    // 下記は+よりも*の方が優先順位が高いため、先に3*4が計算される。
    System.out.println("3+4は" + 3*4 + "です。");
  }
}