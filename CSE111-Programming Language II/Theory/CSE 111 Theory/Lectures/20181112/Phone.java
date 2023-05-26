Phone a = new SmartPhone();
a.tellAbout...
abstract class Phone {
    String os;
    String description = "generic phone";
    abstract void tellAboutYourself();
}
abstract class SmartPhone extends Phone { //concrete
    void tellAboutYourself() {
    }
    abstract sendSMS();
}