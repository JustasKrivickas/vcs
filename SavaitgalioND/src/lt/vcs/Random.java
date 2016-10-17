package lt.vcs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by KRIVIJ on 2016-10-17.
 */
public class Random {
    public static void main(String[] args) {
        //----------------------------
//  [0;5)
        ThreadLocalRandom.current().nextInt(1, 6 + 1);

        /* ---------------------------- */
    }
}


