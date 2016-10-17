package lt.vcs;

public class Main {

    public static void main(String[] args) {
        //----------------------------------

        int p1Cash = 150; //pradine zaideju turima suma
        int p2Cash = 150;

        VcsUtils.println("Kauliuku pokeris");
        VcsUtils.println("Zaidejas 1, iveskite savo varda");
        String player1 = VcsUtils.inputWord();
        VcsUtils.println("Zaidejas 2, iveskite savo varda");
        String player2 = VcsUtils.inputWord();

        VcsUtils.println("Zaidejas 1, statykite suma");
        int player1stat = VcsUtils.inputInt();
        VcsUtils.println("Zaidejas 1 pastatė "+player1stat);
        VcsUtils.println("Zaidejas 2, jei norite pakelti, iveskit 1, kitu atveju iveskit 0");
        int player2stat = VcsUtils.inputInt();

        if(player2stat >0){
            VcsUtils.println("Zaidejas 2 kelia, iveskite pilna suma");
            int player2kelt = VcsUtils.inputInt();
            VcsUtils.println("pakelta suma lygi " +player2kelt);
                    }
else {
            VcsUtils.println("Zaidejas 2 lygina");
            int player2kelt = player1stat;
            VcsUtils.println("islyginta suma lygi " +player1stat);
        }

        VcsUtils.println("metami kauliukai....");
        VcsUtils.println(player1 + " ismete:");




//        int[] arr = {1,2,3,4,5};// pavyzdys :)
//        VcsUtils.println(intArrayToString(arr));//pagalbinio metodo naudojimo pvz, kuri issitrinkit arba uzsikomentuokit :)
//        VcsUtils.println("" + arr[1]);//priminimas kaip galima pasiekti masyvo elementus :)

        //TODO: jums prireiks jau naudotu metodu is String klases
        //P.S. nepamirskit apziureti klasiu turimu metodu dokumentacijos pagalba (Ctrl+q  arba  View->Quick Documentation)
        //P.P.S. Jei iskyla klausimu nebijokit ju uzduoti FB komentaruose po namu darbu ar rasyti PM, nors geriau komentuoti,
        // nes gali buti naudinga ir kitiems :)
        //TODO: Google is your friend ;)



        //----------------------------------
    }//-----main end-----\\

    /**
     * isvercia masyvo reiksmes i suprantama formata
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
