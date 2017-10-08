class soalDelapan {
  public static void main(String[] args) {
    int a;
    int b;
    int n = 10;
    for (a = 1;a < n;a++ ) {
      for (b = 1;b < n;b++ ) {
        if (b >= a && b <= n - a) {
          if (a % 2 == 0) {
            System.out.print("  ");
          } else {
          System.out.print(a + " ");
          }
        } else if (b <= a && b <= n - a) {
          if (b % 2 == 0) {
            System.out.print("  ");
          } else {
          System.out.print(b + " ");
          }
        } else if (b >= a || b >= a - n + n) {
          if (b % 2 == 0) {
            System.out.print("  ");
          } else {
            System.out.print(n - b + " ");
            }
        } else if (b <= a || b <= a - n + n) {
          if (a % 2 == 0) {
            System.out.print("  ");
          } else {
            System.out.print(n - a + " ");
          }
        }else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
