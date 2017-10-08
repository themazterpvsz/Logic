class soalSembilan {
  public static int fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 2) + fib(n - 1);
    }
  }
  public static void main(String[] args) {
    int n = 22;
    int a;
    int b;

    for (a = 0;a <= n;a++ ) {
      for (b = 0;b <= n;b++ ) {
        if (b >= a && b <= n - a) {
          if (a % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print(Math.round(fib((a + 1)/2)));
          }
        } else if (b <= a && b <= n - a) {
          if (b % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print(Math.round(fib((b + 1)/2)));
          }
        } else if (b >=a || b <= a - n) {
          if ((n - b) % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print(Math.round(fib((n - b + 1)/2)));
          }
        } else if (b <= a || b <= a - n) {
          if ((n - a) % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print(Math.round(fib((n - a + 1)/2)));
          }
        }else {
            System.out.print(" ");
          }
        } System.out.print("\n");
      }
    }
  }
