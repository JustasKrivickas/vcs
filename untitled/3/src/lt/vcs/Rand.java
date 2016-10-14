package lt.vcs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by KRIVIJ on 2016-10-14.
 */
public class Rand {

    public static void main(String[] args) {
        //----------------------------
//  [0;5)
    ThreadLocalRandom.current().nextInt(5, 10 + 1);

        //----------------------------
}
}