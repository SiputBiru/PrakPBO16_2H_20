public class Peminjaman {
  int id;
  String namaMember;
  String namaGame;
  int lamaSewa;
  double harga;

  public double hitungHargaBayar() {
    return lamaSewa * harga;
  }

  public void tampilData() {
    System.out.println("ID            : " + id);
    System.out.println("Nama Member   : " + namaMember);
    System.out.println("Nama Game     : " + namaGame);
    System.out.println("Lama Sewa     : " + lamaSewa + " hari");
    System.out.println("Harga /hari   : " + harga);
    System.out.println("Harga Bayar   : " + hitungHargaBayar());
  }
}
