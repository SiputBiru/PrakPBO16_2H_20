public class Karyawan {
  int id;
  String nama, jenis_kelamin, jabatan;
  double gaji;

  public void tampilDataDiri() {
    System.out.println("ID            : " + this.id);
    System.out.println("Nama          : " + this.nama);
    System.out.println("Jenis Kelamin : " + this.jenis_kelamin);
    System.out.println("Jabatan       : " + this.jabatan);
  }

  public void tampilGaji() {
    System.out.println("Gaji          : " + this.gaji);
  }
}
