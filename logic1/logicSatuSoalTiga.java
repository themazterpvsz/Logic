class logicSatuSoalTiga{
  public static void main(String[] args) {
    int i;
    int j;

    for (i = 0;i < 11 ;i++ ) {
      for (j = 0;j < 11 ;j++ ) {
        if (j + i == 10 || i == j) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
