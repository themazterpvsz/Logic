class soalTiga {
  public static int fpb(int a, int b) {
    return (b == 0) ? (a):(fpb(b, a % b));
  }
  public static int kpk(int a, int b){
    return (a / fpb(a,b)) * b;
  }

  public static void main(String[] args) {
    int p = 12;
    int q = 25;
    System.out.println("KPK DARI " + p +" DAN " + q +" ADALAH: ");
    System.out.println(kpk(p,q));
  }
}
