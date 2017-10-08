class soalSatu {
  public static void main(String[] args) {
    int a = 1;
    int b = 1;
    int c = 18;

    for (a = 1;a < c ;a+=2 ) {
      for (b = 1;b < c ;b+=2 ) {
        if (a == b) {
          System.out.print(a);
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
