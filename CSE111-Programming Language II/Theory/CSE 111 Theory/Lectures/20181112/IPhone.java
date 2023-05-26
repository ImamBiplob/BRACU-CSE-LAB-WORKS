class IPhone extends SmartPhone {
    IPhone(){
        os = "iOS";
        description=os+" with feature to automatically become slow after next update with less battery";
    }
    void tellAboutYourself() {
        super.tellAboutYourself();
        System.out.println("I don't need it but want to have it");
    }
    void tellMore(){
        System.out.println("I get shown off more and stolen more");
    }
}
