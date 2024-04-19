public class Dashboard {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int choice;

        do {
            System.out.println("===Management Aset dan Maintenance===");
            System.out.println("1. Hardware");
            System.out.println("2. Software");
            System.out.println("3. Maintenance");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showHardwareMenu();
                    break;
                
                case 2:
                    showSoftwareMenu();
                    break;

                case 3:
                    showMaintenanceMenu();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                System.out.println("Pilihan salah ! mohon pilih opsi yang benar");
            }
        } while (choice !=4);

        scanner.close();
    }

    private static void showHardwareMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===Menu Hardware===");
            System.out.println("1. PC");
            System.out.println("2. Monitor");
            System.out.println("3. Peripheral");
            System.out.println("4. Wifi");
            System.out.println("5. Switch Hub");
            System.out.println("6. Kembali ke Menu");
            System.out.print("Masukkan pilihan anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //Action untuk PC
                    break;

                case 2:
                    // Action untuk Monitor
                    break;

                case 3:
                    // Action untuk Peripheral
                    break;

                case 4:
                    // Action untuk Wifi
                    break;

                case 5:
                    // Action untuk Switch Hub
                    break;

                case 6:
                    System.out.println("Kembali ke Main menu...");
                    return;

                default:
                System.out.println("Pilihan salah, mohon pilih opsi yang benar");
            }
        } while (true);

        
    }

    private static void showSoftwareMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===Menu Software===");
            System.out.println("1. Lisensi windows");
            System.out.println("2. Lisensi Office");
            System.out.println("3. Program Pendukunt");
            System.out.println("4. Kembali ke Main Menu");
            System.out.print("Masukkan pilihan anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Action untuk Lisensi Windows
                    break;

                case 2:
                    // Action untuk Lisensi Office
                    break;

                case 3:
                    // Action untuk Program pendukung
                    break;

                case 4:
                    System.out.println("Kembali ke Main Menu...");
                    return;

                default:
                    System.out.println("pilihan salah ! silahkan masukkan opsi yang benar");
            }

        } while (true);

        
    }

    private static void showMaintenanceMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===Menu Maintenance===");
            System.out.println("1. Jadwal Maintenance");
            System.out.println("2. Realisasi Maintenance");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Action untuk Jadwal Maintenance
                    break;

                case 2:
                    // Action untuk Realisasi Maintenance
                    break;

                case 3:
                    System.out.println("Kembali ke Main Menu...");
                    return;

                default:
                    System.out.println("pilihan salah, silahkan pilih opsi yang benar");
            }

        } while (true);

        
    }

}
