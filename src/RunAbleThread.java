/**
 * Created by MMNJ002 on 2018/8/30.
 */

public class RunAbleThread {
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run able thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
