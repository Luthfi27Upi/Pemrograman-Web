public class Laptop extends Komputer {
    String jnsBaterai;
    
    public Laptop(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLeptop() {
        super.tampilData();
        System.out.println("| Jenis Baterai: " + jnsBaterai);
    }
}