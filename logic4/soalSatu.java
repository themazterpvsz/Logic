class soalSatu {

  public static void main(String[] args) {
    int a = 5;
    int i;
    int j;

    for (i = 1;i <= a ;i++ ) {
      int b = 1;
      for (j = 1;j <= a * 2;j++ ) {
        if (i >= j - (a - 1) && j >= a - i + 1) {
          System.out.print(b++ );
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }

  }
}
