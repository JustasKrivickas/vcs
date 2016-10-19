package lt.vcs.users;

import lt.vcs.Paskaita5.User;

/**
 * vaikinė klasė
 * Created by KRIVIJ on 2016-10-19.
 */
public class Justas extends User {

    private String hobis;

    public Justas (String hobis){
        super("Justas");
        this.hobis = hobis;
    }

    public String getHobis() {
        return hobis;
    }

    public void setHobis(String hobis) {
        this.hobis = hobis;
    }


    @Override
    public  String toString(){
        return super.toString() + "megsta" + this.hobis;

    }

}
