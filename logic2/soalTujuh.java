class soalTujuh {
  public static void main(String[] args) {
    int a;
    int b;

    for (a = 1;a < 19 ; a+=2 ) {
      for (b = 1;b < 19 ; b+=2 ) {
        if (a == b) {
          System.out.print(a);
        } else if (b == 16-a+2) {
          System.out.print(b-1);
        } else if (a <= b && a <= 17-b+1) {
          System.out.print("A");
        } else if (a >= b && b >= 17-a+1) {
          System.out.print("B");
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
