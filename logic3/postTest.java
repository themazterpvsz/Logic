class postTest {
  public static int fib(int n){
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 2) + fib(n - 1);
    }
  }
  public static void main(String[] args) {
    int n = 10;
    int a;
    int b;

    for (a = 1;a < n ;a++ ) {
      for (b = 1;b < n*2-2 ;b++ ) {
        if (a == b) {
          System.out.print(fib(a));
        } else if (b == n - a) {
          System.out.print(fib(b));
        } else if (b == n + (a - 2)) {
          System.out.print(fib(n - a));
        } else if (a == n - (b - 8)) {
          System.out.print(fib(a));
        }else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
