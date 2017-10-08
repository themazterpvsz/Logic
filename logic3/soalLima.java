class soalLima {
  public static int fpb(int a, int b){
    return (b == 0) ? (a):(fpb(b, a % b));
  }
  public static void main(String[] args) {
    int a = 18;
    int b = 30;

    System.out.println("fpb dari " + a + " dan " + b + " adalah: ");
    System.out.println(fpb(a,b));
  }
}
