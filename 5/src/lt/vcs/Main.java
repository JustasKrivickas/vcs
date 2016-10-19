package lt.vcs;


import lt.vcs.Paskaita5.User;

public class Main {

    public static void main(String[] args) {
	// klasė būtų identifikuojama, jei nebūtų prieš tai apibūdintas Main metodas:  lt.vcs.Main

VcsUtils.println(
        (new User("vardauskas", "pavardauskas")).toString());


    }
}
