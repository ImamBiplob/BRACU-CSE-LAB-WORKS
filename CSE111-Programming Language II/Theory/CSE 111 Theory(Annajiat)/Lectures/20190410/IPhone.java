class IPhone extends SmartPhone implements BatteryTester {
    IPhone(String model) {
        super(model);
    } 
    public void testBattery() {
        System.out.println(getModel()+" is losing battery.");
    }
}