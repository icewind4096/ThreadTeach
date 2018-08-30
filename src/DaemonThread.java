/**
 * Created by MMNJ002 on 2018/8/30.
 */
public class DaemonThread implements Runnable {

    @Override
    public void run() {
        while (true){
            System.out.println("不退出");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DaemonThread());
        //setDaemon=true, 说明是守护线程, 当jvm发现只有守护线程时, JVM会退出，并终止守护线程
        //setDaemon=false, 说明不是一般线程, 程序永远不会结束，并且JVM也不会退出
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(3000);
        System.out.println("应用程序退出了");
    }
}
