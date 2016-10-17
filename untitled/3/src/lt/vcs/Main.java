package lt.vcs;

import org.omg.DynamicAny.DynSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        //-------------------
//        Scanner scan = new Scanner(System.in);
//        System.out.println("ivesk zodi");
//        String zodis =scan.next();
//        int kiekis = 0;
//        char[] masyvas = zodis.toCharArray();
        String[] strMass = new String [3];
        strMass[0]= "nulis";
        strMass[1]= "vienas";
        strMass[2]= "du";
//        String[] mass = {"0","1","2"};


        for (int i=0; i < strMass.length; i++){
            strMass[i] = "cia bus "+i;
        }

        for (String elementas : strMass){
            VcsUtils.println(elementas);

        }

        for (Dydziai dydis: Dydziai.values()){
            VcsUtils.println(dydis.toString());
            VcsUtils.println(dydis.getLt());
            VcsUtils.println(dydis.getEn());

            switch (dydis){
                case SMALL:
                    VcsUtils.println("cha cha");
                    break;
                case MEDIUM:
                    VcsUtils.println("dar paaugsi");
                    break;
                case LARGE:
                    VcsUtils.println("ohoho");
                    break;
            }


     }

        List<String> listas = Arrays.asList(strMass);





//        for(char raide: zodis.toCharArray()) {
//            if (raide == 'a'){
//              kiekis++;
//
//}

//        }
//        String str2 = zodis.replaceAll("a","z");
//

//        System.out.println("zodis: "+ zodis);
//        System.out.println("pakeitem raides is a i z: \""+ str2+ "\"'");
//        System.out.println("a raidziu skaicius: '"+ kiekis);
//        System.out.println("zodzio raidziu skaicius '"+ zodis.length());
//        System.out.println("trim() metodo rezultatas: '".concat(str2.trim()).concat( "'"));
//        String str3 = str2.replaceAll(" ","");
//        System.out.println("ivestas zodis turi numeri simboliu be tarpo: "+str3.length());




        //-------------------
    }
}
