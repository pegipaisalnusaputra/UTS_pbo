package software;

public class ProgramPendukung extends Software {
    private String kategori;
    
    //constructor
    public ProgramPendukung(String nama, int versi, String type, String kategori) {
        super (nama, versi, type);
        this.kategori = kategori;
    }

    //implementasi
    @Override
    public void tampilInfo() {
        System.out.println("Nama Software: " + nama);
        System.out.println("Versi: " + versi);
        System.out.println("Type: "+ type);
        System.out.println("Kategori: " + kategori);
    }
}
