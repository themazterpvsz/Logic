class soalTujuh {
  public static long fib(int n){
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 2) + fib(n - 1);
    }
  }
  public static void main(String[] args) {
    int n = 9;
    int a;
    int b;

    for (a = 1;a <= n;a++) {
      for (b = 1;b <= n;b++) {
          if (b >= a && b <= n - a) {
            System.out.print(fib(a) + " ");
          } else if (b <= a && b <= n - a) {
            System.out.print(fib(b)+ " ");
          } else if (b <= a || b <= a - n + n) {
            System.out.print(fib(n - a + 1) + " ");
          } else if (b >= a || b <= a - n + n) {
            System.out.print(fib(n - b + 1) + " ");
          }else {
            System.out.print(" ");
          }
      } System.out.print("\n");
    }
  }
}
