
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

//VS4E -- DO NOT REMOVE THIS LINE!
public class okno extends JFrame {

    private static final long serialVersionUID = 1L;

    static long[] tab_czasow = new long[10000];
    static int k_licz_tab = 0;

    private JMenuItem jMenuItem0;
    private JMenu jMenu0;
    private JMenuBar jMenuBar0;
    private JButton jButton0;
    private JLabel jLabel0;
    private static JTextField jTextField0;
    private static JTextArea jTextArea0;
    private JScrollPane jScrollPane0;
    private JButton jButton1;
    private JLabel jLabel1;
    private static JTextField jTextField1;
    private JButton jButton2;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private static JTextField jTextField2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JButton jButton3;
    private static JTextField jTextField3;
    private JLabel jLabel6;
    protected static JTextField jTextField4;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel7;
    private static JTextField jTextField5;
    private JButton jButton6;

    private JButton jButton7;

    private JLabel jLabel8;

    private JTextField jTextField6;

    private JTextField jTextField7;

    private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";

    public okno() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GroupLayout());
        add(getJLabel0(), new Constraints(new Leading(169, 10, 10), new Leading(28, 12, 12)));
        add(getJTextField0(), new Constraints(new Leading(206, 12, 12), new Leading(24, 12, 12)));
        add(getJButton0(), new Constraints(new Leading(18, 10, 10), new Leading(18, 12, 12)));
        add(getJScrollPane0(), new Constraints(new Leading(13, 370, 10, 10), new Leading(192, 99, 10, 10)));
        add(getJButton1(), new Constraints(new Leading(18, 128, 12, 12), new Leading(62, 12, 12)));
        add(getJLabel1(), new Constraints(new Leading(169, 12, 12), new Leading(72, 12, 12)));
        add(getJTextField1(), new Constraints(new Leading(206, 82, 12, 12), new Leading(68, 12, 12)));
        add(getJLabel2(), new Constraints(new Leading(123, 10, 10), new Leading(0, 12, 12)));
        add(getJButton2(), new Constraints(new Leading(309, 10, 10), new Leading(3, 10, 10)));
        add(getJLabel3(), new Constraints(new Leading(595, 10, 10), new Leading(0, 12, 12)));
        add(getJLabel4(), new Constraints(new Leading(524, 10, 10), new Leading(28, 12, 12)));
        add(getJButton3(), new Constraints(new Leading(469, 10, 10), new Leading(98, 12, 12)));
        add(getJLabel5(), new Constraints(new Leading(615, 12, 12), new Leading(108, 12, 12)));
        add(getJLabel6(), new Constraints(new Leading(545, 12, 12), new Leading(65, 12, 12)));
        add(getJButton5(), new Constraints(new Leading(18, 128, 12, 12), new Leading(108, 12, 12)));
        add(getJLabel7(), new Constraints(new Leading(169, 12, 12), new Leading(116, 10, 10)));
        add(getJTextField5(), new Constraints(new Leading(206, 78, 12, 12), new Leading(111, 12, 12)));
        add(getJButton6(), new Constraints(new Leading(767, 82, 10, 10), new Leading(43, 10, 10)));
        add(getJButton4(), new Constraints(new Leading(769, 83, 10, 10), new Leading(3, 12, 12)));
        add(getJButton7(), new Constraints(new Leading(469, 128, 12, 12), new Leading(138, 27, 10, 10)));
        add(getJLabel8(), new Constraints(new Leading(617, 12, 12), new Leading(144, 12, 12)));
        add(getJTextField4(), new Constraints(new Leading(654, 70, 12, 12), new Leading(63, 12, 12)));
        add(getJTextField3(), new Constraints(new Leading(655, 68, 12, 12), new Leading(106, 12, 12)));
        add(getJTextField6(), new Constraints(new Leading(654, 68, 12, 12), new Leading(142, 12, 12)));
        add(getJTextField7(), new Constraints(new Leading(654, 70, 12, 12), new Leading(142, 12, 12)));
        add(getJTextField2(), new Constraints(new Leading(654, 70, 12, 12), new Leading(24, 12, 12)));
        setJMenuBar(getJMenuBar0());
        setSize(854, 333);
    }

    private JTextField getJTextField7() {
        if (jTextField7 == null) {
            jTextField7 = new JTextField();
            jTextField7.setText("jTextField7");
        }
        return jTextField7;
    }

    private JTextField getJTextField6() {
        if (jTextField6 == null) {
            jTextField6 = new JTextField();
            jTextField6.setText("");
        }
        return jTextField6;
    }

    private JLabel getJLabel8() {
        if (jLabel8 == null) {
            jLabel8 = new JLabel();
            jLabel8.setText("Czas:");
        }
        return jLabel8;
    }

    private JButton getJButton7() {
        if (jButton7 == null) {
            jButton7 = new JButton();
            jButton7.setText("Wyswietl 100");
            jButton7.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton7MouseMouseClicked(event);
                }
            });
        }
        return jButton7;
    }

    private JButton getJButton6() {
        if (jButton6 == null) {
            jButton6 = new JButton();
            jButton6.setText("Wykres");
            jButton6.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton6MouseMouseClicked(event);
                }
            });
        }
        return jButton6;
    }

    private JTextField getJTextField5() {
        if (jTextField5 == null) {
            jTextField5 = new JTextField();
            jTextField5.setText("");
        }
        return jTextField5;
    }

    private JLabel getJLabel7() {
        if (jLabel7 == null) {
            jLabel7 = new JLabel();
            jLabel7.setText("Czas:");
        }
        return jLabel7;
    }

    private JButton getJButton5() {
        if (jButton5 == null) {
            jButton5 = new JButton();
            jButton5.setText("Wyświetl 100");
            jButton5.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton5MouseMouseClicked(event);
                }
            });
        }
        return jButton5;
    }

    private JButton getJButton4() {
        if (jButton4 == null) {
            jButton4 = new JButton();
            jButton4.setText("Czyść");
            jButton4.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton4MouseMouseClicked(event);
                }
            });
        }
        return jButton4;
    }

    private JTextField getJTextField4() {
        if (jTextField4 == null) {
            jTextField4 = new JTextField();
            jTextField4.setText("10");
        }
        return jTextField4;
    }

    private JLabel getJLabel6() {
        if (jLabel6 == null) {
            jLabel6 = new JLabel();
            jLabel6.setText("Liczba powtórzeń:");
        }
        return jLabel6;
    }

    private JTextField getJTextField3() {
        if (jTextField3 == null) {
            jTextField3 = new JTextField();
            jTextField3.setText("");
        }
        return jTextField3;
    }

    private JButton getJButton3() {
        if (jButton3 == null) {
            jButton3 = new JButton();
            jButton3.setText("Wyświetl 10 000");
            jButton3.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton3MouseMouseClicked(event);
                }
            });
        }
        return jButton3;
    }

    private JLabel getJLabel5() {
        if (jLabel5 == null) {
            jLabel5 = new JLabel();
            jLabel5.setText("Czas:");
        }
        return jLabel5;
    }

    private JLabel getJLabel4() {
        if (jLabel4 == null) {
            jLabel4 = new JLabel();
            jLabel4.setText("Liczba użytkowników:");
        }
        return jLabel4;
    }

    private JTextField getJTextField2() {

        if (jTextField2 == null) {
            jTextField2 = new JTextField();
            jTextField2.setText("50");
        }
        return jTextField2;
    }

    private JLabel getJLabel3() {
        if (jLabel3 == null) {
            jLabel3 = new JLabel();
            jLabel3.setText("Dowolna liczba wątków");
        }
        return jLabel3;
    }

    private JLabel getJLabel2() {
        if (jLabel2 == null) {
            jLabel2 = new JLabel();
            jLabel2.setText("Jeden wątek");
        }
        return jLabel2;
    }

    private JButton getJButton2() {
        if (jButton2 == null) {
            jButton2 = new JButton();
            jButton2.setText("Czyść");
            jButton2.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton2MouseMouseClicked(event);
                }
            });
        }
        return jButton2;
    }

    private JTextField getJTextField1() {
        if (jTextField1 == null) {
            jTextField1 = new JTextField();
            jTextField1.setText("");
        }
        return jTextField1;
    }

    private JLabel getJLabel1() {
        if (jLabel1 == null) {
            jLabel1 = new JLabel();
            jLabel1.setText("Czas:");
        }
        return jLabel1;
    }

    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setText("Update 10 000");
            jButton1.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton1MouseMouseClicked(event);
                }
            });
        }
        return jButton1;
    }

    private JScrollPane getJScrollPane0() {
        if (jScrollPane0 == null) {
            jScrollPane0 = new JScrollPane();
            jScrollPane0.setViewportView(getJTextArea0());
        }
        return jScrollPane0;
    }

    private JTextArea getJTextArea0() {
        if (jTextArea0 == null) {
            jTextArea0 = new JTextArea();
            jTextArea0.setText("");
            //jTextArea0.setBorder(BorderFactory.createEmptyBorder(100, 100, 10, 10));
        }
        return jTextArea0;
    }

    private JTextField getJTextField0() {
        if (jTextField0 == null) {
            jTextField0 = new JTextField();
            jTextField0.setText("                          ");

        }
        return jTextField0;
    }

    private JLabel getJLabel0() {
        if (jLabel0 == null) {
            jLabel0 = new JLabel();
            jLabel0.setText("Czas:");
        }
        return jLabel0;
    }

    private JButton getJButton0() {
        if (jButton0 == null) {
            jButton0 = new JButton();
            jButton0.setText("Wyswietl 10 000");
            jButton0.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent event) {
                    jButton0MouseMouseClicked(event);
                }
            });
        }
        return jButton0;
    }

    private JMenuBar getJMenuBar0() {
        if (jMenuBar0 == null) {
            jMenuBar0 = new JMenuBar();
            jMenuBar0.add(getJMenu0());
        }
        return jMenuBar0;
    }

    private JMenu getJMenu0() {
        if (jMenu0 == null) {
            jMenu0 = new JMenu();
            jMenu0.setText("Menu");
            jMenu0.add(getJMenuItem0());
        }
        return jMenu0;
    }

    private JMenuItem getJMenuItem0() {
        if (jMenuItem0 == null) {
            jMenuItem0 = new JMenuItem();
            jMenuItem0.setText("Zakończ");
        }
        return jMenuItem0;
    }

    private static void installLnF() {
        try {
            String lnfClassname = PREFERRED_LOOK_AND_FEEL;
            if (lnfClassname == null) {
                lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
            }
            UIManager.setLookAndFeel(lnfClassname);
        } catch (Exception e) {
            System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
                    + " on this platform:" + e.getMessage());
        }
    }

    /**
     * Main entry of the class. Note: This class is only created so that you can
     * easily preview the result at runtime. It is not expected to be managed by
     * the designer. You can modify it as you like.
     */
    public static void main(String[] args) {

        installLnF();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                okno frame = new okno();
                frame.setDefaultCloseOperation(okno.EXIT_ON_CLOSE);
                frame.setTitle("okno");
                frame.getContentPane().setPreferredSize(frame.getSize());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public static void query_all_Documents(DBCollection collection) {

        int licznik = 0;

        long start = System.nanoTime();
        DBCursor cursor = collection.find();
        while (cursor.hasNext()) {
            licznik++;
            cursor.next();

        }
        long stop = System.nanoTime() - start;
        String wynik = Long.toString(stop);
        jTextField0.setText(wynik);

        jTextArea0.append("Naliczyłem: " + licznik + " dokumentów, czas wykonania to: " + wynik + " ns" + "\n");

        System.out.println("Done");
        System.out.println("Naliczyłem dokumentów: " + licznik);
        System.out.println("Czas wykonania: " + stop);

    }

    public static void query_all_Documents_v3(DBCollection collection) {
        int licznik = 0;

        long start = System.nanoTime();
        DBCursor cursor = collection.find();
        while (cursor.hasNext()) {
            licznik++;
            cursor.next();

        }
        long stop = System.nanoTime() - start;
        String wynik = Long.toString(stop);
        jTextField5.setText(wynik);

        jTextArea0.append("Czas wykonania to: " + wynik + " ns" + "\n");

        //System.out.println("Done");
        System.out.println("Naliczyłem dokumentów jednym zapytaniu: " + licznik);
        System.out.println("Czas wykonania: " + stop);
    }

    public static void query_all_Documents_v2(DBCollection collection) {

        int licznik = 0;

        long start = System.nanoTime();
        DBCursor cursor = collection.find();
        while (cursor.hasNext()) {
            licznik++;
            cursor.next();

        }
        long stop = System.nanoTime() - start;
        String wynik = Long.toString(stop);
        jTextField3.setText(wynik);

        jTextArea0.append("Czas wykonania to: " + wynik + " ns" + "\n");

			//System.out.println("Done");
        //System.out.println("Naliczyłem dokumentów jednym zapytaniu: " + licznik);
        System.out.println("Czas wykonania: " + stop);

        tab_czasow[k_licz_tab] = stop;
        System.out.println("ELEMENT TABLICY NR: " + k_licz_tab + " to: " + tab_czasow[k_licz_tab]);
        k_licz_tab++;

    }

    public static void update_all_Documents(DBCollection collection) {

        long start_update = System.nanoTime();
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("tytul", "Rambo");

        BasicDBObject searchQuery = new BasicDBObject().append("tytul", "Rocky10000");

        collection.update(searchQuery, newDocument);
        long stop_update = System.nanoTime() - start_update;
        System.out.println("Czas wykonania: " + stop_update);

        String wynik_update = Long.toString(stop_update);
        jTextField1.setText(wynik_update);
        jTextArea0.append("Czas wykonania update: " + stop_update + "\n");

    }

    private void jButton0MouseMouseClicked(MouseEvent event) {

        try {

            /*---------- nawiazanie polączenia -----------------*/
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("a01");
            DBCollection collection = db.getCollection("kolekcja");

            /*---------- operacja INSERT ------------------------*/
		        //insertDocuments(collection);
            /*=========== zliczanie atrybutow kolekcji =============*/
            query_all_Documents(collection);

            /*---------- obsługa wyjątków -----------------------*/
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }

    private void jButton1MouseMouseClicked(MouseEvent event) {
        try {

            /*---------- nawiazanie polączenia -----------------*/
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("a01");
            DBCollection collection = db.getCollection("kolekcja");

            /*======== UPDATE --------------*/
            update_all_Documents(collection);

            /*---------- obsługa wyjątków -----------------------*/
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }

    }

    private void jButton2MouseMouseClicked(MouseEvent event) {
        jTextField0.setText("");
        jTextField1.setText("");

    }

    private void jButton3MouseMouseClicked(MouseEvent event) {

        String text2 = liczba_watkow();
        int liczba_watkow = Integer.parseInt(text2);
        System.out.println("Wprowadzona liczba wątkow: " + liczba_watkow);

        p_Thread p = new p_Thread();

        for (int i = 1; i <= liczba_watkow; i++) {

            new t_Thread("watek " + i, p).start();

        }

    }

    public static String liczba_powtorzen() {

        return jTextField4.getText();

    }

    public String liczba_watkow() {

        return jTextField2.getText();
    }

    private void jButton4MouseMouseClicked(MouseEvent event) {

        jTextField2.setText("0");
        jTextField4.setText("0");
        jTextField4.setEditable(true);

    }

    private void jButton5MouseMouseClicked(MouseEvent event) {

        try {

            /*---------- nawiazanie polączenia -----------------*/
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("b01");
            DBCollection collection = db.getCollection("film");

            /*======== UPDATE --------------*/
            query_all_Documents_v3(collection);

            /*---------- obsługa wyjątków -----------------------*/
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }

    }

    private void jButton6MouseMouseClicked(MouseEvent event) {

        mongo_charts.wywolaj();
    }

    private void jButton7MouseMouseClicked(MouseEvent event) {

        String text2 = liczba_watkow();
        int liczba_watkow = Integer.parseInt(text2);
        System.out.println("Wprowadzona liczba wątkow: " + liczba_watkow);

        p_Thread_100 p_100 = new p_Thread_100();

        for (int i = 1; i <= liczba_watkow; i++) {

            new t_Thread_100("watek " + i, p_100).start();

        }

    }

}
