package software;

public abstract class Software {
    protected String nama;
    protected int versi;
    protected String type;

    //constructor
    public Software (String nama, int versi, String type) {
        this.nama = nama;
        this.versi = versi;
        this.type = type;
    }
    
    //abstract method untuk di implementasi 
    public abstract void tampilInfo();
}
