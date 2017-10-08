class soalSepuluh {
  public static long fib(long n) {
    if (n <= 2 ) {
      return n;
    } else {
      return fib(n-2) + fib(n-1);
    }
  }

  public static void main(String[] args) {
    long n = 100;
    long i;
    long j;

    for (i = 1;i < n ;i++ ) {
      for (j = 1;j < n ;j++ ) {
        System.out.print(fib(i) + "\t");
      } System.out.print("\n");
    }
  }
}
