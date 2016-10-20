package lt.vcs.users;

import lt.vcs.Paskaita5.User;

import javax.jws.soap.SOAPBinding;

/**
 * Created by KRIVIJ on 2016-10-19.
 */
public class Ndklase extends User{

        private String Prz;

        public Ndklase (String Prz){
            super("Ndklase");
            this.Prz = Prz;
        }

        public String getPrz() {
            return Prz;
        }

        public void setPrz(String Prz) {
            this.Prz = Prz;
        }


        @Override
        public  String toString(){
            return super.toString() + "megsta" + this.Prz;

        }

    }


