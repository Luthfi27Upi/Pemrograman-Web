public class PC extends Komputer {
    int ukuranMonitor;
    
    public PC(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, int ukuranMonitor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPC() {
        super.tampilData();
        System.out.println("| Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}