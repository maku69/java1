//markus pilv

public class Java_harj2_markus {
    public static void main(String[] args) {
        // tollidest meetriteks
        double tollid = 36.0;
        double meetrid = tollidMeetriteks(tollid);
        System.out.println(tollid + " tolli on " + meetrid + " meetrit.");

        // ellipsi pindala leidmine
        double raadius1 = 5.0;
        double raadius2 = 3.0;
        double pindala = ellipsiPindala(raadius1, raadius2);
        System.out.printf("Ellipsi pindala on %.2f ruutmeetrit.%n", pindala);

        // minutite teisendamiseks tundideks ja minutiteks
        int minutid = 135;
        tundideJaMinutiteTeisendus(minutid);

        // kahe sportlase kiiruse leidmiseks
        double distants1 = 10.0;
        double aeg1 = 1.5;
        double kiirus1 = leiaKiirus(distants1, aeg1);

        double distants2 = 8.0;
        double aeg2 = 1.2;
        double kiirus2 = leiaKiirus(distants2, aeg2);

        System.out.printf("Sportlase 1 kiirus on %.2f km/h.%n", kiirus1);
        System.out.printf("Sportlase 2 kiirus on %.2f km/h.%n", kiirus2);

        // kahe sportlase kiiruste vahe leidmiseks
        double kiirusteVahe = kiirusteVahe(kiirus1, kiirus2);
        System.out.printf("Sportlaste kiiruste vahe on %.2f km/h.%n", kiirusteVahe);
    }

    // tollidest meetriteks teisendamiseks
    public static double tollidMeetriteks(double tollid) {
        return tollid * 0.0254;
    }

    // ellipsi pindala leidmiseks
    public static double ellipsiPindala(double raadius1, double raadius2) {
        double pindala = Math.PI * raadius1 * raadius2;
        return pindala;
    }

    // minutite teisendamiseks tundideks ja minutiteks
    public static void tundideJaMinutiteTeisendus(int minutid) {
        int tunnid = minutid / 60;
        int uuedMinutid = minutid % 60;
        System.out.println(minutid + " minutit on " + tunnid + " tundi ja " + uuedMinutid + " minutit.");
    }

    // sportlase kiiruse leidmiseks (distants (km), aeg (h))
    public static double leiaKiirus(double distants, double aeg) {
        return distants / aeg;
    }

    // kahe sportlase kiiruste vahe leidmiseks (positiivne vahe)
    public static double kiirusteVahe(double kiirus1, double kiirus2) {
        return Math.abs(kiirus1 - kiirus2);
    }
}
