class soalEmpat {
  public static void main(String[] args) {
    int a;
    int b;

    for (a = 1;a < 19 ;a+=2 ) {
      for (b = 1;b < 19 ;b+=2 ) {
        if (b == 9) {
          System.out.print(a + "\t");
        } else if (a == b) {
          System.out.print(a + "\t");
        } else if (b == 16-a+2) {
          System.out.print(b-1 + "\t");
        } else if (a == b || a == 9) {
          System.out.print(b-1 + "\t");
        } else {
          System.out.print("" + "\t");
        }
      } System.out.print("\n");
    }
  }
}
