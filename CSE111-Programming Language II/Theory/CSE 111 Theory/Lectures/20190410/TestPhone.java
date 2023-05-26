//Driver class
public class TestPhone {
private void test(BatteryTester a){
  a.testBattery();
 }
 
 public static void main(String[] args) {
  IPhone i = new IPhone("IPhoneXR");
  TestPhone t = new TestPhone();
  t.test(i);
 }
}
