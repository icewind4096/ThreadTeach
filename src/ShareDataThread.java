/**
 * Created by MMNJ002 on 2018/8/30.
 */
public class ShareDataThread extends Thread{
    private int count = 5;

    @Override
    synchronized
    public void run(){
        super.run();
        while (count > 0){
            count --;
            System.out.println("由" + PrivateDataThread.currentThread().getName() + "计算, count = " + count);
        }
    }

    public static void main(String[] args){
        ShareDataThread thread = new ShareDataThread();

        Thread threadA = new Thread(thread, "A");
        Thread threadB = new Thread(thread, "B");
        Thread threadC = new Thread(thread, "C");
        Thread threadD = new Thread(thread, "D");
        Thread threadE = new Thread(thread, "E");

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }
}
