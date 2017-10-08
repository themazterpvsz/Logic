class soalDua {
  public static void main(String[] args) {
    int a;
    int b;
    int c = 19;

    for (a = 2;a < c ;a+=2 ) {
      for (b = 2;b < c ;b+=2 ) {
        if (b == 18-a+2) {
          System.out.print(b-2 + "\t");
        } else {
          System.out.print(" ");
        }
      } System.out.print("\n");
    }
  }
}
