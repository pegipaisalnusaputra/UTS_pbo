package hardware;

public abstract class Hardware {
    protected String nama;
    protected String merk;
    protected int tahun;

    //constructor
    public Hardware (String nama, String merk, int tahun) {
        this.nama = nama;
        this.merk = merk;
        this.tahun = tahun;
    }

    //abstract method untuk implementasi oleh child class
    public abstract void tampilInfo();
}