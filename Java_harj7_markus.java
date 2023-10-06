import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_harj7_markus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Sisesta esimene arv: ");
                double arv1 = scanner.nextDouble();
                
                System.out.print("Sisesta teine arv: ");
                double arv2 = scanner.nextDouble();
                
                System.out.print("Vali aritmeetiline tehe (+, -, *, /): ");
                String tehe = scanner.next();
                
                double tulemus = 0;
                switch (tehe) {
                    case "+":
                        tulemus = arv1 + arv2;
                        break;
                    case "-":
                        tulemus = arv1 - arv2;
                        break;
                    case "*":
                        tulemus = arv1 * arv2;
                        break;
                    case "/":
                        if (arv2 != 0) {
                            tulemus = arv1 / arv2;
                        } else {
                            System.out.println("Nulliga jagamine ei ole lubatud.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Tundmatu tehe. Kasuta '+', '-', '*', '/'");
                        continue;
                }
                
                System.out.println("Tulemus: " + tulemus);
            } catch (InputMismatchException e) {
                System.out.println("Vigane sisend. Palun sisesta arvud.");
                scanner.nextLine(); // Tühjendame puhvri
                continue;
            }
            
            System.out.print("Kas soovid jätkata (jah/ei)? ");
            String vastus = scanner.next();
            if (!vastus.equalsIgnoreCase("jah")) {
                break;
            }
        }
        
        scanner.close();
    }
}
