public class ObjekDemo {
  public static void main(String[] args) {
    Mouse myMouseGw = new Mouse(49, 5, "Black");
    myMouseGw.setPos(2.0f, 0.0f);
    myMouseGw.printInfo();

    System.out.println();
    Car myCarGW = new Car(1500, "V8", "EDM");
    myCarGW.printInfo();

    System.out.println();
    Motorcycle myMotorGW = new Motorcycle(200, "V4", "Sport");
    myMotorGW.printInfo();

    System.out.println();
    Bottle myBottle = new Bottle(500);
    myBottle.fill(300);
    myBottle.printInfo();
  }
}
