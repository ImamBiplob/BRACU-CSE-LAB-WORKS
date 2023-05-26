public class MudarabaAccountHolder{
  public static void main(String[] args){
    Mudaraba a, b;
    b = new Mudaraba();
    a = new Mudaraba();
    a.accountNo = 305;
    a.balance = 936.5;
    System.out.println(a.accountNo);
    System.out.println(a.balance);
    b.balance = a.balance - 300;
    System.out.println(b.balance);
    b.accountNo = a.accountNo++;
    System.out.println(a.accountNo);
    b = a;
    System.out.println(b.accountNo);
    System.out.println(b.balance);
    b.accountNo++;
    b.balance++;
    System.out.println(a.accountNo);
    System.out.println(a.balance);
    a.accountNo = ++b.accountNo;
    System.out.println(b.accountNo);
    System.out.println(b.balance);
      }
}
