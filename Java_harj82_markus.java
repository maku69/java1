// Mobiiltelefoni klass
class Mobiiltelefon {
    // Omadused
    private String mark;
    private String mudel;
    private int akuTase;

    // Konstruktor
    public Mobiiltelefon(String mark, String mudel) {
        this.mark = mark;
        this.mudel = mudel;
        this.akuTase = 100; // Alustame täis akuga
    }

    // Tegevus: Kontrolli aku taset
    public int akuTase() {
        return akuTase;
    }

    // Tegevus: Lae telefoni
    public void laeTelefon() {
        akuTase = 100; // Lae aku täis
        System.out.println(mark + " " + mudel + " on laetud.");
    }

    // Tegevus: Saada sõnum
    public void saadaSõnum(String saaja, String sõnum) {
        System.out.println(mark + " " + mudel + " saadab sõnumi \"" + sõnum + "\" kasutajale " + saaja + ".");
    }
}

public class Telefonid {
    public static void main(String[] args) {
        // Loome iPhone'i objekti
        Mobiiltelefon iphone = new Mobiiltelefon("Apple", "iPhone 12");

        // Kontrollime aku taset
        int akuTase1 = iphone.akuTase();
        System.out.println("Aku tase: " + akuTase1 + "%");

        // Laeme telefoni
        iphone.laeTelefon();

        // Saadame sõnumi
        iphone.saadaSõnum("Sõber", "Tere! Kuidas sul läheb?");

        // Loome Samsungi objekti
        Mobiiltelefon samsung = new Mobiiltelefon("Samsung", "Galaxy S21");

        // Kontrollime aku taset
        int akuTase2 = samsung.akuTase();
        System.out.println("Aku tase: " + akuTase2 + "%");

        // Laeme telefoni
        samsung.laeTelefon();

        // Saadame sõnumi
        samsung.saadaSõnum("Kolleeg", "Täna kohtume koosolekul.");
    }
}
