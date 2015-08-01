
import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class p_Thread extends okno {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String text = okno.liczba_powtorzen();
    int liczba_powtorzen = Integer.parseInt(text);

    long czas_start_zap = 0;
    long czas_stop_zap = 0;
    long[] tab_czas = new long[100];

    public void printCount() {

        try {
            for (int i = liczba_powtorzen; i > 0; i--) {
                System.out.println("Pętla   ---   " + i);
                try {

                    /*---------- nawiazanie polączenia -----------------*/
                    MongoClient mongo = new MongoClient("localhost", 27017);
                    DB db = mongo.getDB("a01");
                    DBCollection collection = db.getCollection("kolekcja");

                    query_all_Documents_v2(collection);

                    /*---------- obsługa wyjątków -----------------------*/
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (MongoException e) {
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {
            System.out.println("Wątek nieosiągalny.");
        }
    }

}
