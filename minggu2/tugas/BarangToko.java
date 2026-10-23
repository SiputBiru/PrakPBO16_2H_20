public class BarangToko {
  String kode;
  String namaBarang;
  int hargaDasar;
  float diskon;

  public int hitungHargaJual() {
    return (int) (hargaDasar - (diskon * hargaDasar));
  }

  public void tampilData() {
    System.out.println("Kode        : " + kode);
    System.out.println("Nama Barang : " + namaBarang);
    System.out.println("Harga Dasar : " + hargaDasar);
    System.out.println("Diskon      : " + diskon);
    System.out.println("Harga Jual  : " + hitungHargaJual());
  }
}
