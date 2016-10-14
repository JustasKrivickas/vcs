package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by KRIVIJ on 2016-10-14.
 */
public class Data {

    public static void main(String[] args) {
        //--------------------------main start

        Date data = new Date();
        String formatas ="'data: ' yyyy-MM-dd '---' 'laikas: ' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        String musuData = sdf.format(data);


        System.out.println(musuData);










        //--------------------------main end

    }
}
