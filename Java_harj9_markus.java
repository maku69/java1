import java.time.LocalDate;

// Klass Tsikkel
class Tsikkel {
    private String mark;
    private String mudel;
    private int aasta;
    private int kiirus;

    // Konstruktor
    public Tsikkel(String mark, String mudel, int aasta, int kiirus) {
        this.mark = mark;
        this.mudel = mudel;
        this.aasta = aasta;
        this.kiirus = kiirus;
    }

    // Meetod kiirendamiseks
    public void kiirenda() {
        kiirus += 10;
    }
}

// Klass Sõitja
class Sõitja {
    private String nimi;
    private int vanus;
    private LocalDate registreerimiseAeg;

    // Konstruktor
    public Sõitja(String nimi) {
        this.nimi = nimi;
        this.vanus = 18; // Alustame vanusega 18
        this.registreerimiseAeg = LocalDate.now();
    }

    // Meetod treenimiseks
    public void treeni(int tundideArv) {
        vanus -= tundideArv / 10; // Sõitmine noorendab sõitjat
    }
}

// Klass Treeningrada
class Treeningrada {
    private String nimi;
    private int pikkus;

    // Konstruktor
    public Treeningrada(String nimi, int pikkus) {
        this.nimi = nimi;
        this.pikkus = pikkus;
    }
}

// Klass Motoklubi ühendab tsiklid, sõitjad ja treeningradad
class Motoklubi {
    private Tsikkel[] tsiklid;
    private Sõitja[] sõitjad;
    private Treeningrada[] treeningradad;

    // Konstruktor
    public Motoklubi(Tsikkel[] tsiklid, Sõitja[] sõitjad, Treeningrada[] treeningradad) {
        this.tsiklid = tsiklid;
        this.sõitjad = sõitjad;
        this.treeningradad = treeningradad;
    }

    // Meetod treeningu korraldamiseks
    public void korraldaTreening() {
        for (Sõitja sõitja : sõitjad) {
            sõitja.treeni(2); // Kõik sõitjad treenivad 2 tundi
        }
        System.out.println("Treening lõppenud!");
    }
}

public class TreeningProgramm {
    public static void main(String[] args) {
        // Loome mõned tsiklid
        Tsikkel tsikkel1 = new Tsikkel("Honda", "CBR600RR", 2022, 250);
        Tsikkel tsikkel2 = new Tsikkel("Kawasaki", "Ninja ZX-10R", 2023, 280);

        // Loome mõned sõitjad
        Sõitja sõitja1 = new Sõitja("Maria Maasikas");
        Sõitja sõitja2 = new Sõitja("Jaan Järve");

        // Loome mõned treeningradad
        Treeningrada rada1 = new Treeningrada("Rada A", 5);
        Treeningrada rada2 = new Treeningrada("Rada B", 7);

        // Loome motoklubi ja lisame sinna tsiklid, sõitjad ja treeningradad
        Tsikkel[] tsiklid = {tsikkel1, tsikkel2};
        Sõitja[] sõitjad = {sõitja1, sõitja2};
        Treeningrada[] treeningradad = {rada1, rada2};
        Motoklubi klubi = new Motoklubi(tsiklid, sõitjad, treeningradad);

        // Korraldame treeningu
        klubi.korraldaTreening();
    }
}
