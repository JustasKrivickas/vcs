package lt.vcs;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        //----------------------------------

        VcsUtils.println("Kauliuku pokeris");
        VcsUtils.println("Zaidejas 1, iveskite savo varda");
        String player1 = VcsUtils.inputWord();
        VcsUtils.println("Zaidejas 2, iveskite savo varda");
        String player2 = VcsUtils.inputWord();

//        boolean zaisti = true;
//        String pasirinkimas = "y";
//        while (zaisti) {
//            Game newGame = new Game(new Player(player1), new Player(player2));
//            newGame.start();
//            VcsUtils.println("Ar norite zaisti toliau? (y - taip; n - ne)");
//            pasirinkimas = VcsUtils.inputWord();
//            zaisti = "y".equalsIgnoreCase(pasirinkimas);
//        }


        int p1Cash = 150; //pradine zaideju turima suma
        int p2Cash = 150;

        int player1stat = 0;
        int player2stat = 0;


            do {
                VcsUtils.println("Zaidejas 1, statykite ");
                player1stat = VcsUtils.inputInt();
                VcsUtils.println("Zaidejas 1 stato " + player1stat);
                VcsUtils.println("Zaidejas 2, statykite ");
                player2stat = VcsUtils.inputInt();

                if (player2stat > player1stat) {
                    VcsUtils.println("Zaidejas 2 stato " + player2stat);


                    if (player2stat == player1stat) {
                        return;
                    }

                } else {

                    player2stat = player1stat;
                    VcsUtils.println("Islyginta suma lygi " + player2stat);
                }


        }
        while (player1stat != player2stat);

        VcsUtils.println("metami kauliukai....");
        VcsUtils.println(player1 + " ismete:");

        int kaulsk1 = VcsUtils.kaulsk01;
        int kaulsk2 = VcsUtils.kaulsk02;
        int kaulsk3 = VcsUtils.kaulsk03;
        int kaulsk4 = VcsUtils.kaulsk04;
        int kaulsk5 = VcsUtils.kaulsk05;
        int kaulsk6 = VcsUtils.kaulsk06;

        int kaulsk7 = VcsUtils.kaulsk07;
        int kaulsk8 = VcsUtils.kaulsk08;
        int kaulsk9 = VcsUtils.kaulsk09;
        int kaulsk100 = VcsUtils.kaulsk10;
        int kaulsk110 = VcsUtils.kaulsk11;
        int kaulsk120 = VcsUtils.kaulsk12;

        int kiekis1 = 0;


        int[] arr1 = {kaulsk1,kaulsk2,kaulsk3,kaulsk4,kaulsk5,kaulsk6};
        VcsUtils.println(intArrayToString(arr1));


        VcsUtils.println(player2 + " ismete:");

        int[] arr2 = {kaulsk7,kaulsk8,kaulsk9,kaulsk100,kaulsk110,kaulsk120};
        VcsUtils.println(intArrayToString(arr2));


//---------------------mano rašytas

//        int[] arr = {1, 3, 5};// pavyzdys :)
//        VcsUtils.println(intArrayToString(arr));//pagalbinio metodo naudojimo pvz, kuri issitrinkit arba uzsikomentuokit :)
//        VcsUtils.println("" + arr[1]);//priminimas kaip galima pasiekti masyvo elementus :)

        //TODO: jums prireiks jau naudotu metodu is String klases
        //P.S. nepamirskit apziureti klasiu turimu metodu dokumentacijos pagalba (Ctrl+q  arba  View->Quick Documentation)
        //P.P.S. Jei iskyla klausimu nebijokit ju uzduoti FB komentaruose po namu darbu ar rasyti PM, nors geriau komentuoti,
        // nes gali buti naudinga ir kitiems :)
        //TODO: Google is your friend ;)


        //----------------------------------
    }//-----main end-----\\

    private static int getSum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    private static void reRollDice(int[] hand, int dicePos) {
        hand[dicePos-1] = rand();
    }

    private static int[] rollHand() {
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = rand();
        }
        return result;
    }

    private static int rand() {
        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }

    /**
     * isvercia masyvo reiksmes i suprantama formata
     *
     * @param arr masyvas, kuri versim
     * @return suprantama masyvo tekstine reprezentacija
     */
    private static String intArrayToString(int[] arr) {
        String result = "";
        for (int val : arr) {
            result += "[" + val + "] ";
        }
        return result.trim();
    }


    //TODO: nebijokit pasirasyti sau pagalbiniu metodu, jei reikia/norit, jie padaro koda tvarkingesni
    // pvz galit pasirasyti metoda pagalbini random generavimui kad nereiktu pastoviai rasyti ilgu litaniju
    // ThreadLocalRandom.current().nextInt(min, max + 1);
    //TODO: nepamirskit kad main metodas statinis todel ir pagalbiniai metodai turetu buti statiniai, kad
    //juos butu galima naudoti main metode

}
