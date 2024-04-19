package software;

public class LisensiOffice extends Software {
    //contructor
    public LisensiOffice (String nama, int versi, String type) {
        super (nama, versi, type);
    }

    //implementasi
    @Override
    public void tampilInfo() {
        System.out.println("Nama Lisensi: " + nama);
        System.out.println("versi Lisensi: "+ versi);
        System.out.println("Type Lisensi: " + type);
    }
}
