
public class t_Thread_100 extends Thread {

    private Thread t;
    private String threadName;

    p_Thread_100 p_T_100;

    t_Thread_100(String name, p_Thread_100 p_t_100) {
        threadName = name;
        p_T_100 = p_t_100;
    }

    public void run() {
        p_T_100.printCount();
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
