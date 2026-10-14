public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println("Total sudut (1 sudut diketahui, 60) = " + sg.totalSudut(60));
        System.out.println("Total sudut (2 sudut diketahui, 60 + 50) = " + sg.totalSudut(60, 50));
        System.out.println("Keliling segitiga (3 sisi: 3, 4, 5) = " + sg.keliling(3, 4, 5));
        System.out.println("Sisi miring segitiga siku-siku (3, 4) = " + sg.keliling(3, 4));
    }
}
