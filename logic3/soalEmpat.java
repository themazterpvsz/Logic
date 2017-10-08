class soalEmpat {
      public static void main(String[] args) {
      int i = 0;
      int j = 0;
      int lim = 40;

      String prima = "";

      for (i = 1;i <= lim ;i++ ) {
        int counter = 0;
          for (j = i;j >=1 ;j-- ) {
            if (i % j == 0) {
              counter = counter + 1;
            }
          }
          if (counter == 2) {
            prima = prima + i + "\n";
          }
      }
      System.out.println("Bilangan prima dari 1 ke " + lim + " adalah :");
      System.out.println(prima);
    }
}
