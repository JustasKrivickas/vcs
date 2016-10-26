package lt.vcs;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {


        Connection conn = VcsDbUtils.connect("antroji");

        Statement state = conn.createStatement();


        //pirmas
//        int updatedCount = 0;
//        for (int i = 1; i<6; i++) {
//            updatedCount+= state.executeUpdate(
//                    "insert into person (vardas, pavarde) values('Tomas"
//                    + i+ "','Tomauskas"
//                    + i+"')");
//        }
//
//        VcsUtils.println("Viso pakeista: " + updatedCount);
//pirmas


//antras
//        ResultSet result = state.executeQuery("select * from person where vardas like 'Tomas_'");
//        while (result.next()){
//
//                  VcsUtils.println(result.getString("vardas")+ "\t"
//                  + result.getString("pavarde")
//                  );
//        }
//antras

        //trecias

        int updateTable = 0;
        for (int i = 1; i<11; i++) {
            updateTable += state.executeUpdate(
                    "insert into person (vardas, pavarde) values('vardauskas','"
                            + i + "pavardauskas"
                            + i + "')");
        }
            VcsUtils.println("Viso pakeista: " + updateTable);

        ResultSet result = state.executeQuery("select * from person where vardas = 'vardauskas'");
        while (result.next()){

                  VcsUtils.println(result.getString("vardas")+ "\t"
                  + result.getString("pavarde")
                  );
        }



            //trecias



            VcsDbUtils.disconnect(conn);
        }


    }



