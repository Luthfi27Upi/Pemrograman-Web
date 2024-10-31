import java.lang.Math;
public class Soal2 {
    // Fungsi f(x) = 3x^3 - 2x - e^x
    public static double f(double x) {
        return 3 * x * x * x - 2 * x - Math.exp(x);
    }
    // Turunan dari f(x) untuk Newton-Raphson
    public static double fTurunan(double x) {
        return 9 * x * x - 2 - Math.exp(x);
    }
    // Fungsi g(x) untuk Iterasi Titik Tetap
    public static double g(double x) {
        return Math.cbrt((2 * x + Math.exp(x)) / 3);
    }
    // Metode Iterasi Titik Tetap
    public static void iterasiTitikTetap(double x0, double toleransi, int maxIterasi) {
        System.out.println("Metode Iterasi Titik Tetap :");
        System.out.println("Akar : f(x) = 3x^3 - 2x + e^x");
        int iterasi = 0;
        double x1;
    
        while (iterasi < maxIterasi) {
            x1 = g(x0);
            System.out.printf("Iterasi %d: x = %.6f\n", iterasi + 1, x1);
    
            if (Math.abs(x1 - x0) < toleransi) {
                System.out.printf("Akar ditemukan pada x = %.6f setelah %d iterasi.\n\n", x1, iterasi + 1);
                return;
            }
            x0 = x1;
            iterasi++;
        }
        System.out.println("Akar tidak ditemukan setelah mencapai iterasi maksimum.\n");
    }
    // Metode Newton-Raphson
    public static void newtonRaphson(double x0, double toleransi, int maxIterasi) {
        System.out.println("Metode Newton Raphson :");
        System.out.println("Akar : f(x) = 3x^3 - 2x + e^x");
        int iterasi = 0;
        double x1;
    
        while (iterasi < maxIterasi) {
            x1 = x0 - f(x0) / fTurunan(x0);
            System.out.printf("Iterasi %d: x = %.6f\n", iterasi + 1, x1);
    
            if (Math.abs(x1 - x0) < toleransi) {
                System.out.printf("Akar ditemukan pada x = %.6f setelah %d iterasi.\n\n", x1, iterasi + 1);
                return;
            }
            x0 = x1;
            iterasi++;
        }
        System.out.println("Akar tidak ditemukan setelah mencapai iterasi maksimum.\n");
    }
    // Metode Secant
    public static void secant(double x0, double x1, double toleransi, int maxIterasi) {
        System.out.println("Metode Secant :");
        System.out.println("Akar : f(x) = 3x^3 - 2x + e^x");
        int iterasi = 0;
        double x2;
    
        while (iterasi < maxIterasi) {
            x2 = x1 - f(x1) * (x1 - x0) / (f(x1) - f(x0));
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
        double x0 = 0.1;
        double x1 = 0.7;
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