package maintenance;

public class RealisasiMaintenance implements MaintenanceTask {
    private String tanggal;

    //constructor
    public RealisasiMaintenance (String tanggal){
        this.tanggal = tanggal;
    }

    //implementasi
    @Override
    public void scheduleMaintenance(){
        System.out.println("Method ini tidak untuk Realisasi Maintenance");
    }

    @Override
    public void performaMaintenance() {
        System.out.println("Maintenence dilakukan pada: " + tanggal);
    }
}
