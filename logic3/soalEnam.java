class soalEnam {
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

    for (a = 1;a <= n ;a++) {
      for (b = 1;b <= n ;b++ ) {
        if (a == b) {
          System.out.print(fib(a));
        }  else if (b  == n - a + 1) {
          System.out.print(fib(a));
        } else if (a >= b && a <= n - b + 1) {
          System.out.print(" D ");
        } else if (a <= b && a >= n - b + 1) {
          System.out.print(" B ");
        } else if (a <= b && b <= n - a + 1) {
          System.out.print(" C ");
        } else if (a >= b && b >= n - a + 1 ) {
          System.out.print(" A ");
        }else{
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
