public class TestTiket {
    public static void main(String[] args) {
        System.out.println("---------- Tiket Kereta ----------");
        TiketKereta t1 = new TiketKereta();
        t1.kodeTiket = "KA-001";
        t1.namaPenumpang = "Andi";
        t1.asal = "Malang";
        t1.tujuan = "Jakarta";
        t1.hargaDasar = 350000;
        t1.nomorGerbong = 3;
        t1.nomorKursi = "12A";
        t1.tampilKereta();

        System.out.println("========== Tiket Pesawat Domestik =========");
        TiketDomestik t2 = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar",
                900000, "Garuda Indonesia", 25, 75000);
        t2.tampilDomestik();

        System.out.println("------ Tiket Pesawat Internasional ------");
        TiketInternasional t3 = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura",
                2500000, "Singapore Airlines", 20, "C1234567", 150000);
        t3.tampilInternasional();
    }
}
