import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_harj6_markus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arvud = new ArrayList<>();
        
        while (true) {
            System.out.println("Sisesta täisarv (jäta tühi sisend lõpetamiseks): ");
            String sisend = scanner.nextLine();
            
            if (sisend.isEmpty()) {
                break; // Katkestame tsükli, kui sisend on tühi
            }
            
            try {
                int arv = Integer.parseInt(sisend);
                arvud.add(arv);
            } catch (NumberFormatException e) {
                System.out.println("Vigane sisend. Palun sisesta täisarv.");
            }
        }
        
        if (!arvud.isEmpty()) {
            // Kui loendis on arve, siis leitakse summa ja keskmine
            int summa = leiaSumma(arvud);
            double keskmine = leiaKeskmine(arvud);
            
            // Salvestame arvud, summa ja keskmise tekstifaili
            salvestaAndmedFaili(arvud, summa, keskmine);
            
            System.out.println("Andmed on salvestatud faili.");
        } else {
            System.out.println("Andmeid ei leitud.");
        }
        
        scanner.close();
    }
    
    // Alamprogramm summa leidmiseks
    public static int leiaSumma(List<Integer> arvud) {
        int summa = 0;
        for (int arv : arvud) {
            summa += arv;
        }
        return summa;
    }
    
    // Alamprogramm keskmise leidmiseks
    public static double leiaKeskmine(List<Integer> arvud) {
        int summa = leiaSumma(arvud);
        return (double) summa / arvud.size();
    }
    
    // Alamprogramm andmete salvestamiseks tekstifaili
    public static void salvestaAndmedFaili(List<Integer> arvud, int summa, double keskmine) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("andmed.txt"))) {
            for (int arv : arvud) {
                writer.write(Integer.toString(arv));
                writer.newLine();
            }
            writer.write("Summa: " + summa);
            writer.newLine();
            writer.write("Keskmine: " + keskmine);
        } catch (IOException e) {
            System.out.println("Viga tekstifaili salvestamisel: " + e.getMessage());
        }
    }
}
