package lt.vcs.daiktai;

import lt.vcs.interfeisai.Daiktas;
import lt.vcs.interfeisai.VcsEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by KRIVIJ on 2016-10-20.
 */
public abstract class AbstractDaiktas implements Daiktas, VcsEntity {


    private String name;
    private Date purcaheDate;


    public AbstractDaiktas(String name, Date purcaheDate) {
        this.name = name;
        this.purcaheDate = purcaheDate;
    }

    public String getName() {
        return (name);
    }

    public Date getpurchaseDate() {
        return (purcaheDate);
    }

    public String getid() {

        SimpleDateFormat sdf = new SimpleDateFormat("['ss']''['mm'][]'HH']'");
return name + "-" +sdf.format(purcaheDate);
    }
}