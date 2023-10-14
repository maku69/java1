import java.util.Scanner;

public class ruumalad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vali tegevus (1 - Roopkylik, 2 - Ristkylik, 3 - Kolmnurk): ");
        int valik = scanner.nextInt();

        if (valik == 1 || valik == 2) {
            System.out.print("Sisesta pikkus: ");
            int pikkus = scanner.nextInt();
            System.out.print("Sisesta laius: ");
            int laius = scanner.nextInt();
            System.out.print("Kas on vaja korgust (jah/ei): ");
            String kasKorgus = scanner.next();

            if (kasKorgus.equalsIgnoreCase("jah")) {
                System.out.print("Sisesta korgus: ");
                int korgus = scanner.nextInt();
                if (valik == 1) {
                    System.out.printf("Roopkyliku ruumala on %.2f ", pindalad.ruupkylik(pikkus, laius) * korgus);
                } else {
                    System.out.printf("Ristkyliku ruumala on %.2f ", pindalad.ristkylik(pikkus, laius) * korgus);
                }
            } else {
                System.out.println("Korgust ei ole vaja. Palun sisestage korgus.");
            }
        } else if (valik == 3) {
            System.out.print("Sisesta alus: ");
            int alus = scanner.nextInt();
            System.out.print("Sisesta korgus: ");
            int korgus = scanner.nextInt();
            System.out.printf("Kolmnurga ruumala on %.2f ", pindalad.kolmnurk(alus, korgus) * korgus);
        } else {
            System.out.println("Vigane valik! Palun sisestage kehtiv valik (1, 2 voi 3).");
        }

        scanner.close();
    }
}
