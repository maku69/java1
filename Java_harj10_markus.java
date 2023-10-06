// Baasklass Loom
class Loom {
    private String nimi;

    public Loom(String nimi) {
        this.nimi = nimi;
    }

    public void heli() {
        System.out.println(nimi + " teeb heli.");
    }

    public void liigu() {
        System.out.println(nimi + " liigub.");
    }

    public void toit() {
        System.out.println(nimi + " sööb midagi üldist.");
    }
}

// Alamklass Roomaja
class Roomaja extends Loom {
    public Roomaja(String nimi) {
        super(nimi);
    }

    @Override
    public void toit() {
        System.out.println(super.nimi + " sööb putukaid.");
    }
}

// Alamklass Lind
class Lind extends Loom {
    public Lind(String nimi) {
        super(nimi);
    }

    @Override
    public void liigu() {
        System.out.println(super.nimi + " lendab.");
    }
}

// Alamklass Kala
class Kala extends Loom {
    public Kala(String nimi) {
        super(nimi);
    }

    @Override
    public void toit() {
        System.out.println(super.nimi + " sööb planktonit.");
    }
}

public class App {
    public static void main(String[] args) {
        Loom loom1 = new Loom("Karvane");
        Roomaja roomaja1 = new Roomaja("Madu");
        Lind lind1 = new Lind("Kotkas");
        Kala kala1 = new Kala("Lõhe");

        loom1.heli();
        loom1.liigu();
        loom1.toit();

        roomaja1.heli();
        roomaja1.liigu();
        roomaja1.toit();

        lind1.heli();
        lind1.liigu();
        lind1.toit();

        kala1.heli();
        kala1.liigu();
        kala1.toit();
    }
}
