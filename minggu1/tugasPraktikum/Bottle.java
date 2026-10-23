public class Bottle {
  private float capacity;        // maximum capacity in mL
  private float currentCapacity; // current capacity in mL

  // FIX: capacity must be set, otherwise it stays 0 and Bottle can never be filled
  public Bottle(float capacity) {
    this.capacity = capacity;
    this.currentCapacity = 0;
  }

  public void fill(float w) { // in mL
    if (w <= 0) {
      System.out.println("Input must be positive!");
      return;
    }
    if (w > capacity) {
      System.out.println("Input water bigger than maximum capacity!");
      return;
    }

    float tmp = this.currentCapacity + w;

    if (tmp > capacity) {
      System.out.println("Out of capacity! Filling up to maximum.");
      this.currentCapacity = capacity; // FIX: cap instead of overflowing
      return;
    }

    this.currentCapacity = tmp;
  }

  public void drain(float w) { // in mL
    if (w <= 0) {
      System.out.println("Input must be positive!");
      return;
    }
    if (w > this.capacity) {
      System.out.println("Input water bigger than maximum capacity!");
      return;
    }
    if (w > this.currentCapacity) {
      System.out.println("Input water bigger than current capacity!");
      return;
    }

    this.currentCapacity -= w;
  }

  // Encapsulation: expose state via getters
  public float getCapacity() {
    return this.capacity;
  }

  public float getCurrentCapacity() {
    return this.currentCapacity;
  }

  public void printInfo() {
    System.out.println("Maximum Capacity: " + this.capacity);
    System.out.println("Current Capacity: " + this.currentCapacity);
  }

}
