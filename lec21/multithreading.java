class Mytheread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i+"ti");
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        Mytheread T1=new Mytheread();
    T1.start();
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
    
}
