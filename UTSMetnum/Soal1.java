import java.lang.Math;
public class Soal1 {
    public static double f(double x) {
        return 7 * x * x - 21 * x + Math.exp(x);
    }
    public static double fTurunan(double x) {
        return 14 * x - 21 + Math.exp(x);
    }
    public static double g(double x) {
        return Math.sqrt((21 * x - Math.exp(x)) / 7);
    }
    // Metode Iterasi Titik Tetap
    public static void iterasiTitikTetap(double x0, double toleransi, int maxIterasi) {
        System.out.println("Metode Iterasi Titik Tetap :");
        System.out.println("Akar : f(x) = 7x^2 - 21x + e^x");
        int iterasi = 0;
        double x1;

        while (iterasi < maxIterasi) {
            x1 = g(x0);
            System.out.printf("Iterasi ke-%d: x = %.6f\n", iterasi + 1, x1);

            if (Math.abs(x1 - x0) < toleransi) {
                System.out.printf("Akar ditemukan pada x = %.6f setelah %d iterasi.\n", x1, iterasi + 1);
                return;
            }
            x0 = x1;
            iterasi++;
        }
        System.out.println("Akar tidak ditemukan setelah mencapai iterasi maksimum.");
    }
    // Metode Newton Raphson
    public static void newtonRaphson(double x0, double toleransi, int maxIterasi){
        System.out.println("\nMertode Newton Raphson : ");
        System.out.println("Akar : f(x) = 7x^2 - 21x + e^x");
        int iterasi = 0;
        double x1;

        while (iterasi < maxIterasi) {
            x1 = x0 - f(x0) / fTurunan(x0);
            System.out.printf("Iterasi ke-%d: x = %.6f\n", iterasi + 1, x1);

            if (Math.abs(x1 - x0) < toleransi) {
                System.out.printf("Akar ditemukan pada x = %.6f setelah %d iterasi.\n", x1, iterasi + 1);
                return;
            }
            x0 = x1;
            iterasi++;
        }
        System.out.println("Akar tidak ditemukan setelah mencapai iterasi maksimum.");
    }
    // Metode Secant
    public static void secant(double x0, double x1, double toleransi, int maxIterasi) {
        System.out.println("\nMetode Secant :");
        System.out.println("Akar : f(x) = 7x^2 - 21x + e^x");
        int iterasi = 0;
        double x2;
        
        while (iterasi < maxIterasi) {
            x2 = x1 - (f(x1) * (x1 - x0)) / (f(x1) - f(x0));
            System.out.printf("Iterasi %d: x = %.6f\n", iterasi + 1, x2);
        
            if (Math.abs(x2 - x1) < toleransi) {
                System.out.printf("Akar ditemukan pada x = %.6f setelah %d iterasi.\n\n", x2, iterasi + 1);
                return;
            }
            x0 = x1;
            x1 = x2;
            iterasi++;
        }
        System.out.println("Akar tidak ditemukan setelah mencapai iterasi maksimum.\n");
    }
    public static void main(String[] args) {
        double x0 = 0.3;
        double x1 = 0.5;
        double toleransi = 1e-4;
        int maxIterasi = 100;
        // Menjalankan metode Iterasi Titik Tetap
        iterasiTitikTetap(x0, toleransi, maxIterasi);
        // Menjalankan metode Newton-Raphson
        newtonRaphson(x0, toleransi, maxIterasi);
        // Menjalankan metode Secant
        secant(x0, x1, toleransi, maxIterasi);        
    }
}