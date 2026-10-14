public class TestManusia {
    public static void main(String[] args) {
        // dynamic method dispatch: referensi superclass, objek subclass
        Manusia a = new Dosen();
        Manusia b = new Mahasiswa();

        System.out.println("--- Dosen (referensi Manusia) ---");
        a.bernafas();
        a.makan();

        System.out.println("--- Mahasiswa (referensi Manusia) ---");
        b.bernafas();
        b.makan();

        System.out.println("--- Method khusus subclass ---");
        Dosen d = new Dosen();
        d.lembur();
        Mahasiswa m = new Mahasiswa();
        m.tidur();
    }
}
