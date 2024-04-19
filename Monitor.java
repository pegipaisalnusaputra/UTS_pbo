package hardware;

public class Monitor extends Hardware {
    private String resolusi;
    private int ukuranLayar;

    //constructor
    public Monitor (String nama, String merk, int tahun, String resolusi, int ukuranLayar) {
        super (nama, merk, tahun);
        this.resolusi = resolusi;
        this. ukuranLayar = ukuranLayar;
    }

    //implementasi
    @Override
    public void tampilInfo() {
        System.out.println("Nama Monitor: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun rilis: " + tahun);
        System.out.println("Resolusi: " + resolusi);
        System.out.println("Ukuran layar: " + ukuranLayar + " Inchi");
    }
}
