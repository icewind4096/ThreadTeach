/**
 * Created by MMNJ002 on 2018/8/30.
 */
public class InterruptThread extends Thread{
    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 5000000; i ++){
            //此处检测线程是否需要退出的状态
            if (this.interrupted() == true){
                System.out.println("线程已经是停止状态, 将要退出计算");
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("线程即将停止");
    }

    public static void main(String[] args){
        try {
            InterruptThread interruptThread = new InterruptThread();

            interruptThread.start();

            Thread.sleep(2000);

            //此处设置线程将要退出状态,并不负责退出
            interruptThread.interrupt();

            System.out.println("应用退出");
        } catch (InterruptedException e) {
            System.out.println("catch exception");
            e.printStackTrace();
        }
    }
}
