class logicSatuSoalDua {
  public static void main(String[] args) {
    int i;
    int j;
      for (i = 0;i < 10 ; i++ ) {
        for (j = 0;j < 10 ;j++ ) {
          if (i == 9-j+1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        } System.out.print("\n");
      }

  }

}
