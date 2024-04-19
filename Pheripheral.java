package hardware;

public class Pheripheral extends Hardware {
    private String jenis;

    //constructor
    public Pheripheral (String nama, String merk, int tahun, String jenis) {
        super (nama, merk, tahun);
        this.jenis = jenis;
    }

    //implementasi methode abstract
    @Override
    public void tampilInfo() {
        System.out.println("Nama Pheripheral: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun rilis: " + tahun);
        System.out.println("Jenis: " + jenis);
    }
}
