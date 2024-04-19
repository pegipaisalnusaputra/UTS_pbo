package hardware;

public class SwitchHub extends Hardware {
    private int port;
    private String type;
    private int speed;

    //constructor
    public SwitchHub(String nama, String merk, int tahun, int port, String type, int speed) {
        super(nama, merk, tahun);
        this.port = port;
        this.type = type;
        this.speed = speed;
    }

    //implementasi
    @Override
    public void tampilInfo() {
        System.out.println("Nama Switch HUB: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Jumlah port: " + port + " Port");
        System.out.println("Type Switch: " + type);
        System.out.println("Kecepatan: " + speed + " Mbps");
    }
}
