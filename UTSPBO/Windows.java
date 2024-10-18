public class Windows extends Laptop {
    String fitur;
    
    public Windows(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai, String fitur) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.fitur = fitur;
    }
    
    public void tampilWindows() {
        super.tampilLeptop();
        System.out.println("| Fitur: " + fitur);
    }
}