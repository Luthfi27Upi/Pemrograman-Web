import java.util.Scanner;

public class HandPhone {
    // Atribut
    private String noSeri;
    private String model;
    private String versiOs;
    private boolean on = false;
    private int volume = 0;
    private int previousVolume = 0;

    // Konstruktor default
    public HandPhone() {
        Scanner scanner = new Scanner(System.in);
        
        // Input untuk noSeri, model, dan versi OS
        System.out.print("Masukkan No. Seri: ");
        this.noSeri = scanner.nextLine();
        
        System.out.print("Masukkan Model: ");
        this.model = scanner.nextLine();
        
        System.out.print("Masukkan Versi OS: ");
        this.versiOs = scanner.nextLine();
    }

    // Method untuk menyalakan handphone
    public void power() {
        on = !on;
        if (!on) {
            volume = 0; // Matikan handphone, set volume ke 0
            System.out.println("Handphone dimatikan.");
        } else {
            System.out.println("Handphone dihidupkan.");
        }
    }
    
public void tambahVolume() {
    if (on) {
        if (volume < 100) {
            volume += 13;
            if (volume > 100) {
                volume = 100; 
            }
            System.out.println("Volume bertambah. Volume saat ini: " + volume);
        } else {
            System.out.println("Volume sudah mencapai maksimum (100). Tidak bisa ditambah lagi.");
        }
    } else {
        volume+=13;
        System.out.println("Handphone dalam keadaan off, Volume bertambah.");
    }
}


public void kurangVolume() {
    if (on && volume > 0) {
        volume -= 9; 
        if (volume < 0) {
            volume = 0; 
        }
        System.out.println("Volume berkurang. Volume saat ini: " + volume);
    } else if (!on) {
        volume-=9;
        System.out.println("Handphone dalam keadaan off., Volume berkurang.");
    } else {
        System.out.println("Volume sudah pada nilai minimum (0).");
    }
}

public void mute() {
    if (on) {
        if (volume == 0 && previousVolume > 0) {
            volume = previousVolume;
            System.out.println("Handphone unmute. Volume kembali ke: " + volume);
        } else {
            previousVolume = volume;
            volume = 0;
            System.out.println("Handphone dimute. Volume: " + volume);
        }
    } else {
        System.out.println("Handphone dalam keadaan off. Hidupkan terlebih dahulu.");
    }
}


    // Method untuk menampilkan informasi handphone
    public void info() {
        System.out.println("No. Seri: " + noSeri);
        System.out.println("Model: " + model);
        System.out.println("Versi OS: " + versiOs);
        System.out.println("Status: " + (on ? "Nyala" : "Mati"));
        System.out.println("Volume: " + volume);
    }
}
