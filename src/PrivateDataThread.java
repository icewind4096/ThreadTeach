/**
 * Created by MMNJ002 on 2018/8/30.
 */
public class PrivateDataThread extends Thread{
    private int count = 5;

    public PrivateDataThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run(){
        super.run();
        while (count > 0){
            count --;
            System.out.println("由" + PrivateDataThread.currentThread().getName() + "计算, count = " + count);
        }
    }

    public static void main(String[] args){
        PrivateDataThread threadA = new PrivateDataThread("Thread_A");
        PrivateDataThread threadB = new PrivateDataThread("Thread_B");
        PrivateDataThread threadC = new PrivateDataThread("Thread_C");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
