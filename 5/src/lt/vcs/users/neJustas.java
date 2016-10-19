package lt.vcs.users;

import lt.vcs.Paskaita5.User;

/**
 * Created by KRIVIJ on 2016-10-19.
 */
public class neJustas extends User{

    private String spalva;

    public neJustas (String spalva){
        super("neJustas");
        this.spalva = spalva;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }


    @Override
    public  String toString(){
        return super.toString() + "megsta" + this.spalva;

    }

}

