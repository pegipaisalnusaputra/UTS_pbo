package maintenance;

public class JadwalMaintenance implements MaintenanceTask {
    private String tanggal;

    //constructor
    public JadwalMaintenance (String tanggal) {
        this.tanggal = tanggal;
    }

    //implementasi
    @Override
    public void scheduleMaintenance() {
        System.out.println("Rencana pelaksanaan Maintenanace: " + tanggal);
    }

    @Override
    public void performaMaintenance() {
        System.out.println("Performa maintenance dari rencana: " + tanggal);
    }
}
