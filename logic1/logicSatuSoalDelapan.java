class logicSatuSoalDelapan{
  public static void main(String[] args) {
    int i;
    int j;
    int a = 10;

    for (i = 0;i <= a ;i++ ) {
      for (j = 0;j <= a ;j++ ) {
        if (j >= i && j >= a-i || i >= j && j <= a-i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
