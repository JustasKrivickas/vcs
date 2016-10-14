package lt.vcs;

/**
 * Created by KRIVIJ on 2016-10-14.
 */
public enum Dydziai {


    SMALL("mazas","small"),
    MEDUIM("vidutinis","mediom"),
    LARGE("didelis","large");


    }

    private final String lt;
    private final String en;

    public String getLt() {
        return lt;
    }

    public String getEn() {
        return en;

    private Dydziai(String lt, String en){
        this.lt = lt;
        this.en = en;

    }
}
