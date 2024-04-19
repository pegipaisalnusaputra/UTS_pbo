package hardware;

public class Pc extends Hardware {
    private int kapasitas;

    //constructor
    public Pc (String nama, String merk, int tahun, int kapasitas) {
        super (nama, merk, tahun);
        this.kapasitas = kapasitas;
    }

    //implementasi abstract method
    @Override
    public void tampilInfo(){
        System.out.println("Nama PC: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun rilis: " + tahun);
        System.out.println("Kapasitas HDD: " + kapasitas + " GB");
    }
}
