class soalSepuluh {
  public static int fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 2) + fib(n - 1);
    }
  }

  public static void main(String[] args) {
    String[] chara;
    int n = 24  ;
    int a;
    int b;

    chara = new String[] {"a","a","A","a","B","b","C","c","D","d","E","e","F","f","G","g","H","h","I","i","J","j","K","k","L","l","M","m","N","n","O","o","P"};

    for (a = 1;a < n;a++ ) {
      for (b = 1;b < n;b++ ) {
        if (b <= a && b <= n - a) {
          if (b % 2 ==0) {
            System.out.print(chara[b] + " ");
          } else {
            System.out.print(Math.round(fib((b + 1)/2)) + " ");
          }
        } else if (b >= a && b <= n - a) {
          if (a % 2 == 0) {
            System.out.print(chara[a] + " ");
          } else {
            System.out.print(Math.round(fib((a + 1)/2)) + " ");
          }
        } else if (b <= a || b <= a - n) {
          if ((n - a) % 2 == 0) {
            System.out.print(chara[n-a] + " ");
          } else {
            System.out.print(Math.round(fib((n - a + 1)/2)) + " ");
          }
        } else if (b >= a || b <= a - n) {
          if ((n - b) % 2 == 0) {
            System.out.print(chara[n - b] + " ");
          } else {
            System.out.print(Math.round(fib((n - b + 1)/2)) + " ");
          }
        }else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
