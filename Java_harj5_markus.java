// Markus Pilv
// See programm võimaldab kasutajal sisestada kaks arvu ja teostada jagamistehet, kontrollides tingimusi.

import java.util.Scanner;

public class Java_harj5_markus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) { // Teostame jagamistehet kolm korda
            System.out.println("Sisesta esimene arv: ");
            double esimeneArv = scanner.nextDouble();
            
            System.out.println("Sisesta teine arv (jagaja): ");
            double jagaja = scanner.nextDouble();
            
            if (jagaja != 0 && esimeneArv >= 0 && jagaja > 0) {
                double tulemus = esimeneArv / jagaja;
                System.out.println("Tulemus: " + tulemus);
            } else {
                System.out.println("Midagi on valesti. Jagada ei saa.");
            }
        }
        
        scanner.close();
    }
}
