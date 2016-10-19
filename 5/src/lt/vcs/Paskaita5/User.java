package lt.vcs.Paskaita5;

/**
 * Created by KRIVIJ on 2016-10-19.
 */
public class User {

    private String vardas;
    private String pavarde;
    private final String klasesVardas;
    private  int amzius = 77;

    public int getAmzius() {
        return amzius;
    }
    public int getAmzius(int plius){
    return amzius + plius;
    }

    public int getAmzius(String plius){
        return amzius + new Integer(plius);
    }


    /**
     * User klases konstruktorius
     * @param vardas vardas
     * @param pavarde pavarde
     */

    public User(String vardas, String pavarde){
        this(vardas);
        this.pavarde = pavarde;
//        this.klasesVardas = this.getClass().getName();
    }

    public User(String vardas){
        super();
        this.vardas = vardas;
        this.klasesVardas = this.getClass().getName();
    }

    @Override
    public String toString(){
        //this.klasesVardas + ": " +//
        String result = "super: " + super.toString()+
                " "+ this.klasesVardas+ ";"
+        " vardas: "+ this.vardas +
                " pavarde: "+ this.pavarde;
        return  result;
    }

    //darom code- generate getter and setter:

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getKlasesVardas() {
        return klasesVardas;
    }
}
