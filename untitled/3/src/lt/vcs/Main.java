package lt.vcs;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //-------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("ivesk zodi");
        String zodis =scan.next();

        int kiekis = 0;
        for(char raide: zodis.toCharArray()) {
if (raide == 'a'){
    kiekis++;

}

        }
        String str2 = zodis.replaceAll("a","z");


        System.out.println("zodis: "+ zodis);
        System.out.println("pakeitem raides is a i z: \""+ str2+ "\"'");
        System.out.println("a raidziu skaicius: '"+ kiekis);
        System.out.println("zodzio raidziu skaicius '"+ zodis.length());
//        System.out.println("trim() metodo rezultatas: '".concat(str2.trim()).concat( "'"));
//        String str3 = str2.replaceAll(" ","");
//        System.out.println("ivestas zodis turi numeri simboliu be tarpo: "+str3.length());




        //-------------------
    }
}
