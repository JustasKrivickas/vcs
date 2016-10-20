package lt.vcs.daiktai;

import java.util.Date;


/**
 * Created by KRIVIJ on 2016-10-20.
 */
public class Zaislas extends AbstractDaiktas{



        public Zaislas(String name){
            super("Zaislas",new Date());
        }


        @Override
        public String describe() {
            return "Visi Tomai - Tomai: " + getName( )+ " " + getpurchaseDate();
        }
    }



