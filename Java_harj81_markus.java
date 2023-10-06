import java.util.Scanner;

public class Java_harj81_markus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vali ruumala arvutamise tüüp: ");
        System.out.println("1. Risttahukas");
        System.out.println("2. Silinder");
        int valik = scanner.nextInt();

        switch (valik) {
            case 1:
                System.out.print("Sisesta risttahuka pikkus: ");
                double pikkus = scanner.nextDouble();
                System.out.print("Sisesta risttahuka laius: ");
                double laius = scanner.nextDouble();
                System.out.print("Sisesta risttahuka korgus: ");
                double korgus = scanner.nextDouble();
                double risttahuRuumala = arvutaRisttahuRuumala(pikkus, laius, korgus);
                System.out.println("Risttahuka ruumala on: " + risttahuRuumala);
                break;

            case 2:
                System.out.print("Sisesta silindri raadius: ");
                double raadius = scanner.nextDouble();
                System.out.print("Sisesta silindri kõrgus: ");
                double korgusSilinder = scanner.nextDouble();
                double silindriRuumala = arvutaSilindriRuumala(raadius, korgusSilinder);
                System.out.println("Silindri ruumala on: " + silindriRuumala);
                break;

            default:
                System.out.println("Vigane valik!");
        }
        scanner.close();
    }

    // Meetod risttahuka ruumala arvutamiseks
    public static double arvutaRisttahuRuumala(double pikkus, double laius, double korgus) {
        return pikkus * laius * korgus;
    }

    // Meetod silindri ruumala arvutamiseks
    public static double arvutaSilindriRuumala(double raadius, double korgus) {
        return Math.PI * Math.pow(raadius, 2) * korgus;
    }
}
