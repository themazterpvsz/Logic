class soalDua {

  public static void main(String[] args) {
    int a = 5;
    int i;
    int j;

    for (i = 1;i <= a ;i++ ) {
      int b = 1;
      for (j = 1;j <= a  * 2;j++ ) {
        if (j >= i  && j <= a * 2 - i) {
          System.out.print(b++);
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }

  }
}
