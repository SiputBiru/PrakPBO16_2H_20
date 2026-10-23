public class Motor {
  private int kecepatan = 0;
  private boolean kontakOn = false;

  public void nyalakanMesin() {
    kontakOn = true;
  }

  public void matikanMesin() {
    kontakOn = false;
  }

  public void tambahKecepatan() {
    if (kontakOn == true) {
      if ((this.kecepatan + 5) > 100) {
        System.out.println("Kecepatan Motor berada di titik maksimum! maksimum kecepatan 100");
        this.kecepatan = 100;
      } else {
        kecepatan += 5;
      }
    } else {
      System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");
    }
  }

  public void kurangiKecepatan() {
    if (kontakOn == true) {
      kecepatan -= 5;
    } else {
      System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
    }
  }

  public void printStatus() {
    if (kontakOn == true) {
      System.out.println("kontak On");
    } else {
      System.out.println("Kontak Off");
    }
    System.out.println("kecepatan " + kecepatan + "\n");
  }

}
