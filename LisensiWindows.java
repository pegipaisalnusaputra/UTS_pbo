package software;

public class LisensiWindows extends Software {
    //constructor
    public LisensiWindows(String nama, int versi, String type) {
        super(nama, versi, type);
    }

    //iimplementasi
    @Override
    public void tampilInfo() {
        System.out.println("Nama Lisensi: " + nama);
        System.out.println("Versi Lisensi: " + versi);
        System.out.println("Type Lisensi: "+ type);
    }
}
