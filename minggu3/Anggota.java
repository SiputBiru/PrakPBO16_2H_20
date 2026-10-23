public class Anggota {
  private String nama;
  private String alamat;
  private float simpanan;

  Anggota(String nama, String alamat, float simpanan) {
    this.nama = nama;
    this.alamat = alamat;
    this.simpanan = simpanan;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getNama() {
    return this.nama;
  }

  public String getAlamat() {
    return this.alamat;
  }

  public float getSimpanan() {
    return this.simpanan;
  }

  public void setor(float uang) {
    this.simpanan += uang;
  }

  public void pinjam(float uang) {
    this.simpanan -= uang;
  }
}
