public class Car extends Vehicle {
  private String engine;
  private String name;

  public Car() {
    super(0, 4); // default tire count for a car
  }

  public Car(float weight, String engine, String name) {
    super(weight, 4);
    this.engine = engine;
    this.name = name; // FIX: previously the name argument was dropped
  }

  @Override
  public void printInfo() {
    super.printInfo(); // prints Weight + Tire Count from Vehicle
    System.out.println("Name: " + this.name);
    System.out.println("Engine: " + this.engine);
  }

}
