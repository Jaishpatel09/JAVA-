class Mytheread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println("Downloading...."+(i*20)+"%");
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class multithreading2 {
    public static void main(String[] args) {
        Mytheread t1=new Mytheread();
    t1.start();
    // try {
    //     t1.join();
    // } catch (Exception e) {
    //     // TODO: handle exception
    // }

    
        for(int i=0;i<5;i++){
            System.out.println("timer"+i);
        }
    }
    
}
