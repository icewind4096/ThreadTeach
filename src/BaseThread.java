/**
 *  * Created by MMNJ002 on 2018/8/30.
 *  基本线程的使用
 */
public class BaseThread extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("My Thread");
    }

    public static void main(String[] args){
        BaseThread myThread = new BaseThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
