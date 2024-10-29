package abstraksi;

public class main {
    public static void main(String[] args) {
        Mobil mobilHitam = new Mobil("Hitam", "Toyota", 180);
        mobilHitam.tampilkanInfo();

        Mobil mobilMerah = new Mobil("Merah", "Honda", 200);
        mobilMerah.tampilkanInfo();

        System.out.println("Warna : " + mobilHitam.getWarna());
    }
}