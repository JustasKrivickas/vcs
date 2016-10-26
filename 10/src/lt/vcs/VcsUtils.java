package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Klase skirta pagalbiniams metodams
 */
public class VcsUtils {

    /**
     * Metodas isveda teksta i nauja eilute cmd lange su laiku priekyje
     */
    public static void println(String text) {
        Date data = new Date();
        String formatas = "'['HH:mm:ss:SSS']' ";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        System.out.println(sdf.format(data) + text);
    }

    /**
     * perskaito zodi ivesta per cmd
     * @return perskaityta zodi
     */
    public static String inputWord() {
        return newScanner().next();
    }

    /**
     * perskaito eilute ivesta per cmd
     * @return perskaityta eilute
     */
    public static String inputLine() {
        return newScanner().nextLine();
    }

    /**
     * perskaito integeri(sveika skaiciu) ivesta per cmd
     * @return perskaityta integeri
     */
    public static int inputInt() {
        return newScanner().nextInt();
    }

    /**
     * Pagalbinis metodas naujam Scanner objektui gauti
     * @return naujas Scanner objektas
     */
    private static Scanner newScanner() {
        return new Scanner(System.in);
    }

    public static int kaulsk01 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk02 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk03 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk04 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk05 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk06 = ThreadLocalRandom.current().nextInt(1, 1 + 6);

    public static int kaulsk07 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk08 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk09 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk10 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk11 = ThreadLocalRandom.current().nextInt(1, 1 + 6);
    public static int kaulsk12 = ThreadLocalRandom.current().nextInt(1, 1 + 6);

}
