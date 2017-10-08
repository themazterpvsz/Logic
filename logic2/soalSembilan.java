class soalSembilan {

  public static void main(String[] args) {
    int count = 1;

    while (count < 10) {
      fib(10);
      count++;
    }
}
    public static void fib(long lim) {
      long a = 0;
      long b = 1;
      System.out.print(b);

      for (long i = 2;i < lim ;i++ ) {
        long c = a + b;
        System.out.print(" "+c);
        a = b;
        b = c;
      }
      System.out.println();
    }
  }
