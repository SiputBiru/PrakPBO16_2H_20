public class Mouse {
  private float weight;
  private int buttonCount;
  private String color;
  private float x, y; // position x, y

  public Mouse() {
  }

  public Mouse(float w, int b, String c) {
    this.weight = w;
    this.buttonCount = b;
    this.color = c;
  }

  public void setPos(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getPosX() {
    return this.x;
  }

  public float getPosY() {
    return this.y;
  }

  public void printInfo() {
    System.out.println("Weight: " + this.weight);
    System.out.println("Button Count: " + this.buttonCount);
    System.out.println("Color: " + this.color);
    System.out.println("Position: " + this.getPosX() + " " + this.getPosY());
  }
}
