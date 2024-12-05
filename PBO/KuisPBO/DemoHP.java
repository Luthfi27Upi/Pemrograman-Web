import java.util.Scanner;

public class DemoHP {
    public static void main(String[] args) {
        // Membuat objek HandPhone dengan input dari pengguna
        HandPhone hp = new HandPhone();
        
        // Menyalakan Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=============== MENU ===============");
            System.out.println("1. Nyalakan / Matikan Handphone");
            System.out.println("2. Tambah Volume");
            System.out.println("3. Kurang Volume");
            System.out.println("4. Mute");
            System.out.println("5. Tampilkan Info Handphone");
            System.out.println("6. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih aksi: ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    hp.power();
                    break;
                case 2:
                    hp.tambahVolume();
                    break;
                case 3:
                    hp.kurangVolume();
                    break;
                case 4:
                    hp.mute();
                    break;
                case 5:
                    hp.info();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
        
        scanner.close();
    }
}
