public class TestKaryawan {
  public static void main(String[] args) {
    Karyawan k1 = new Karyawan();
    k1.id = 1;
    k1.nama = "Raditya";
    k1.jenis_kelamin = "Laki-laki";
    k1.jabatan = "Staff IT";
    k1.gaji = 7500000;
    k1.tampilDataDiri();
    k1.tampilGaji();
  }
}
