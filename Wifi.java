package hardware;

public class Wifi extends Hardware {
    private String frekuensi;
    private int radius;

    //contructor
    public Wifi (String nama, String merk, int tahun, String frekuensi, int radius) {
        super (nama, merk, tahun);
        this.frekuensi = frekuensi;
        this.radius = radius;
    }

    //implementasi
    @Override
    public void tampilInfo() {
        System.out.println("Nama Wifi: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun rilis: " + tahun);
        System.out.println("Frekuensi: " + frekuensi + " GHz");
        System.out.println("Jangkauan sinyal: " + radius + "Meter");
    }
}
