package id.ac.polinema.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Composition: Rak dibuat otomatis di dalam Perpustakaan
        Perpustakaan perpus = new Perpustakaan("Perpus Kota", 5);

        // Aggregation: Buku & Anggota dibuat di luar, lalu dimasukkan
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku b2 = new Buku("Bumi", "Tere Liye");
        Anggota a1 = new Anggota("A001", "Raditya");
        perpus.setAnggota(a1);

        perpus.pinjamBuku(b1);
        perpus.pinjamBuku(b2);
        System.out.println(perpus.info());

        // Dependency: printer hanya dipinjam sesaat via parameter
        StrukPrinter printer = new StrukPrinter("Epson L3110");
        perpus.cetakStruk(printer, "Struk pinjam: 2 buku oleh Raditya");
    }
}
