package lt.vcs;

import java.util.Scanner;

public class Main {

    /**
     * Mūsų pasisveikinimo klasė
     * @param args
     */

    public static void main(String[] args) {


        Scanner input = new Scanner( System.in );
        String ivedimas = input.next();
        if (ivedimas.equals("ab")){
	System.out.println("Įvestas teisingas žodis");
    }
    else{
            System.out.println("Įvestas ne tas žodis");
    }
    }

}
