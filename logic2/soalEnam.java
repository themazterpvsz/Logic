class soalEnam {
  public static void main(String[] args) {
    int a;
    int b;

    for (a = 18;a > 0 ;a-=2 ) {
      for (b = 2;b < 19 ;b+=2 ) {
        if (b >= a) {
          System.out.print(" " + (a-2) + "     ");
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
