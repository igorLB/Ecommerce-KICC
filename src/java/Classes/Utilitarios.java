package Classes;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Cristiano
 */

public class Utilitarios {
    public static Date toSqlDate(String data){
        Date res = null;
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date parsed = dateFormat2.parse(data);
            res = new java.sql.Date(parsed.getTime());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        return res;
    }
}
