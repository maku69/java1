//markus pilv

import java.util.Scanner;

public class Java_harj4_markus {
    public static void main(String[] args) {
        // Loome skanneri kasutaja sisendi lugemiseks
        Scanner scanner = new Scanner(System.in);

        // Küsime kasutajalt suvalist teksti
        System.out.print("Sisestage suvaline tekst: ");
        String kasutajaTekst = scanner.nextLine();

        // Muudame kasutaja teksti suurtähtedeks
        String suurtahedTekst = kasutajaTekst.toUpperCase();

        // Väljastame kogu lause
        System.out.println("Sisestatud lause suurtähtedega: " + suurtahedTekst);

        // Väljastame kasutaja teksti märkide arvu
        int markideArv = kasutajaTekst.length();
        System.out.println("Sisestatud teksti märkide arv: " + markideArv);

        // Väljastame kasutaja teksti sõnade arvu
        String[] sonad = kasutajaTekst.split("\\s+");
        int sonadeArv = sonad.length;
        System.out.println("Sisestatud teksti sonade arv: " + sonadeArv);

        // Väljastame kasutaja sisestatud lause esimese sõna vormindatuna
        String esimeneSonarida = sonad.length > 0 ? sonad[0] : "";
        System.out.printf("Esimene sona lauses: %s%n", esimeneSonarida);

        // Sulgeme skanneri
        scanner.close();
    }
}
