package id.ac.polinema.relasiclass.tugas;

public class Rak {
    private String kode;
    private Buku[] daftarBuku;
    private int terisi;

    public Rak(String kode, int kapasitas) {
        this.kode = kode;
        this.daftarBuku = new Buku[kapasitas];
        this.terisi = 0;
    }

    // Aggregation: Buku dibuat di luar, dimasukkan lewat method ini
    public void tambahBuku(Buku buku) {
        if (terisi < daftarBuku.length) {
            daftarBuku[terisi++] = buku;
        } else {
            System.out.println("Rak " + kode + " penuh!");
        }
    }

    public String info() {
        String info = "Rak " + kode + " (" + terisi + "/" + daftarBuku.length + "):\n";
        for (int i = 0; i < terisi; i++) {
            info += "  - " + daftarBuku[i].info() + "\n";
        }
        return info;
    }
}
