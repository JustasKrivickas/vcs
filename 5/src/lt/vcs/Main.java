package lt.vcs;


import lt.vcs.Paskaita5.User;
import lt.vcs.paketas.PaketoKlase;
import lt.vcs.users.Justas;
import lt.vcs.users.neJustas;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
	// klasė būtų identifikuojama, jei nebūtų prieš tai apibūdintas Main metodas:  lt.vcs.Main

        User justas = new Justas("tinginiauti");
        User useris = new User("vardauskas", "pavardauskas");
        User pk = new Justas("tekstas");
        User nejustas = new neJustas("zalia");
        User ndklase = new Ndklase("prekinisZenklas");

        if(ndklase instanceof Ndklase){
            VcsUtils.println("Ndklase");
            Ndklase tikraiNdklase = (Ndklase)ndklase;
            VcsUtils.println
                    (tikraiNdklase.getPrz());
        }


        if(justas instanceof Justas){
           VcsUtils.println("Justas mldc");
            Justas tikraiJustas = (Justas)justas;
           VcsUtils.println
                   (tikraiJustas.getHobis());
        }


        if (pk instanceof User) {
            VcsUtils.println("paketas yra");
        }


VcsUtils.println(
        (useris).toString()
        );

        VcsUtils.println(
                (justas).toString()
        );

        VcsUtils.println(
                (nejustas).toString()
        );
    }
}
