public class Motorcycle extends Vehicle {
  private String engine;
  private String name;

  public Motorcycle() {
    super(0, 2); // default tire count for a motorcycle
  }

  public Motorcycle(float weight, String engine, String name) {
    super(weight, 2);
    this.engine = engine;
    this.name = name;
  }

  @Override
  public void printInfo() {
    super.printInfo(); // prints Weight + Tire Count from Vehicle
    System.out.println("Name: " + this.name);
    System.out.println("Engine: " + this.engine);
  }

}
