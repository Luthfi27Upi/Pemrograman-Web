public class MainUTS {
    public static void main(String[] args) {
        
        System.out.println("==================================");
        System.out.println("|     UTS Luthfi Triaswangga     |");
        System.out.println("|           2341820208           |");
        System.out.println("==================================");
        // Instansiasi objek Mac
        Mac mac = new Mac("MacBook Pro", 3, 16, "Intel", "Lithium-ion", "Face ID");
        System.out.println("|            Data Mac            ");
        mac.tampilMac();
        
        System.out.println("==================================");
        
        // Instansiasi objek Windows
        Windows windows = new Windows("Dell XPS", 2, 8, "AMD", "Lithium-polymer", "Cortana");
        System.out.println("|           Data Windows         ");
        windows.tampilWindows();
        
        System.out.println("==================================");
        
        // Instansiasi objek PC
        PC pc = new PC("Lenovo", 3, 32, "RTX 3060", 27);
        System.out.println("|             Data PC            ");
        pc.tampilPC();
        System.out.println("==================================");
    }
}