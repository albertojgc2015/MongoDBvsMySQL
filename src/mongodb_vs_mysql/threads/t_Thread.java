
public class t_Thread extends Thread {

    private Thread t;
    private String threadName;
    p_Thread p_T;

    t_Thread(String name, p_Thread p_t) {
        threadName = name;
        p_T = p_t;
    }

    public void run() {
        p_T.printCount();
        System.out.println("Wątek " + threadName + " kończy.");
    }

    public void start() {
        System.out.println("Startuje " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
