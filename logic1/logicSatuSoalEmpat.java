class logicSatuSoalEmpat {
  public static void main(String[] args) {
    int i;
    int j;

    for (i = 0;i < 11 ;i++ ) {
      for (j = 0;j < 11  ;j++ ) {
        if (j == 10-i  || i == j || i == 5 || j == 5) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
