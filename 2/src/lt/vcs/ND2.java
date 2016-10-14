package lt.vcs;

/**
 * Created by KRIVIJ on 2016-10-14.
 */

import java.util.Scanner;

/**
 * Parašyt programą, kuri paprašo įvesti žodį/sakinį, jį išskaido į atskiras raides, suskaičiuoti,
 * kiek "a" raidžių įvesta.
 * Tarpų neskaičiuot, įpushint į repoz.
 */
public class ND2 {
    public static void main(String[] args) {

            Scanner input = new Scanner( System.in );


            System.out.println("Iveskite žodį ar sakinį: ");
            String ivestis = input.nextLine();
            System.out.println("Įvesties ilgis: " + ivestis.length());


        for(char skaidom : ivestis.toCharArray())
        {
            System.out.println(skaidom);
        }

    }



}
