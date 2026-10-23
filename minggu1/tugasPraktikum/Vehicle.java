abstract public class Vehicle {
  private float weight;
  private int tireCount;
  private float x, y;

  // Constructor to initialize the shared state in a valid way
  public Vehicle(float weight, int tireCount) {
    this.weight = weight;
    this.tireCount = tireCount;
  }

  // Encapsulation: getters/setters instead of exposing fields
  public float getWeight() {
    return this.weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public int getTireCount() {
    return this.tireCount;
  }

  public float getPosX() {
    return this.x;
  }

  public float getPosY() {
    return this.y;
  }

  public void setPos(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public void printInfo() {
    System.out.println("Weight: " + this.weight);
    System.out.println("Tire Count: " + this.tireCount);
  }

}
