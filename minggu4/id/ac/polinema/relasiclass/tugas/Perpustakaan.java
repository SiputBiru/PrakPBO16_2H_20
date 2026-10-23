package id.ac.polinema.relasiclass.tugas;

public class Perpustakaan {
    private String nama;
    private Rak rak; // Composition: dibuat sendiri, tanpa setter
    private Anggota anggota; // Aggregation: di-inject dari luar

    public Perpustakaan(String nama, int kapasitasRak) {
        this.nama = nama;
        this.rak = new Rak("R-01", kapasitasRak);
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Rak getRak() {
        return rak;
    }

    public void pinjamBuku(Buku buku) {
        rak.tambahBuku(buku);
        System.out.println(anggota.getNama() + " meminjam " + buku.getJudul());
    }

    // Dependency: StrukPrinter hanya lewat parameter, tidak disimpan
    public void cetakStruk(StrukPrinter printer, String teks) {
        System.out.println(nama + " mencetak struk...");
        printer.cetak(teks);
    }

    public String info() {
        String info = "Perpustakaan: " + nama + "\n";
        info += rak.info();
        if (anggota != null) {
            info += anggota.info() + "\n";
        }
        return info;
    }
}
