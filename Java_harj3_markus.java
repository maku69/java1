//markus pilv

public class Java_harj3_markus {
    public static void main(String[] args) {
        // massiiv antud arvudest
        int[] arvud = {12, 5, 10, 10, 28, 17, 5, 19, 0, 13, 0, 22, 7, 0, 17, 2, 24, 1, 13, 29, 0, 7, 16, 8, 7, 4, 27, 8, 8, 23, 26, 25, 15, 2, 26, 1};

        // väljastab esimese elemendi väärtuse
        System.out.println("Esimene arv massiivis: " + arvud[0]);

        // väljastab viimase elemendi väärtuse
        System.out.println("Viimane arv massiivis: " + arvud[arvud.length - 1]);

        // leiab elementide arvu massiivis
        int elementideArv = arvud.length;
        System.out.println("arv massiivis: " + elementideArv);

        // leiab elementide summa massiivis
        int summa = 0;
        for (int arv : arvud) {
            summa += arv;
        }
        System.out.println("summa massiivis: " + summa);

        // leiab arvude  keskmine
        double keskmine = (double) summa / elementideArv;
        System.out.println("keskmine: " + keskmine);

        // mitmemõõtmeline massiiv kuupäevade ja temperatuuridega
        int[][] kuupäevaTemperatuurid = {
            {1, 23},
            {2, 15},
            {3, 29},
            {4, 15},
            {5, 26},
            {6, 17},
            {7, 26},
            {8, 15},
            {9, 28},
            {10, 12},
            {11, 24},
            {12, 16},
            {13, 21},
            {14, 10},
            {15, 10},
            {16, 26},
            {17, 27},
            {18, 19},
            {19, 14},
            {20, 14},
            {21, 14},
            {22, 26},
            {23, 20},
            {24, 28},
            {25, 29},
            {26, 11},
            {27, 28},
            {28, 19},
            {29, 25},
            {30, 12}
        };

        // väljastab ainult temperatuurid
        System.out.println("Temperatuurid:");
        for (int i = 0; i < kuupäevaTemperatuurid.length; i++) {
            System.out.println("Päev " + kuupäevaTemperatuurid[i][0] + ": " + kuupäevaTemperatuurid[i][1]);
        }
    }
}
