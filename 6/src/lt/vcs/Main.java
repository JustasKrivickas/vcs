package lt.vcs;

import lt.vcs.daiktai.AbstractDaiktas;
import lt.vcs.daiktai.Zaislas;
import lt.vcs.interfeisai.User;
import lt.vcs.users.AbstractUser;
import lt.vcs.users.Tomas;

public class Main {

    public static void main(String[] args) {
        User tomas1 = new Tomas("pavardė1","Tomas@email1.lt");
        Tomas tomas2 = new Tomas("pavardė2","Tomas@email2.lt");
        AbstractUser tomas3 = new Tomas("pavardė3","Tomas@email3.lt");
        AbstractDaiktas zaislas = new Zaislas("pliušinis","pimpačkiukas");

        if (tomas1 instanceof AbstractUser) {
            VcsUtils.println("tomas1 yra Abstraktus User'is");
        }
        if (tomas2 instanceof AbstractUser) {
            VcsUtils.println("tomas2 yra Abstraktus User'is");
        }
        if (tomas3 instanceof AbstractUser) {
            VcsUtils.println("tomas3 yra Abstraktus User'is");
        }


        if (tomas2 instanceof User){
            VcsUtils.println("tomas2 yra User'is");
        }
        if (tomas2 instanceof Object){
            VcsUtils.println("tomas2 yra Object'as");
        }
        if (tomas1 instanceof User){
            VcsUtils.println("tomas1 yra User'is");
        }
        if (tomas1 instanceof Object){
            VcsUtils.println("tomas1 yra Object'as");
        }
    }
}