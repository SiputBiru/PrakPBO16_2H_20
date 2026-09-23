package id.ac.polinema.relasiclass.tugas;

public class StrukPrinter {
    private String merk;

    public StrukPrinter(String merk) {
        this.merk = merk;
    }

    public void cetak(String teks) {
        System.out.println("[" + merk + "] " + teks);
    }
}
