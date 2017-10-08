class soalSatu {
  public static long fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 2) + fib(n -1);
    }
  }

  public static void main(String[] args) {
    int n = 25;
    int i;

    for (i = 1;i < n ;i++ ) {
      System.out.print(fib(i) + " ");
    }
  //   int j;
  //   for (i = 1;i < n ;i++ ) {
  //     for (j = 1;j < n ;j++ ) {
  //       if (i == j) {
  //         System.out.print(fib(i));
  //       } else if (j == 9-i+1) {
  //         System.out.print(fib(j));
  //       } else if (i >= j && i >= 9-j+1) {
  //         System.out.print("B");
  //       } else if (j >= i && j <= 9-i+1) {
  //         System.out.print("A");
  //       }else {
  //         System.out.print(" ");
  //       }
  //     } System.out.print("\n");
  //   }
  // }
  }
}
