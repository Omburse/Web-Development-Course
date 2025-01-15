class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0 ;
        while(i<10) {
            System.out.println("I am a Running State ");
            System.out.println("peee");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
            public void run(){
        int i = 0 ;
        while(i<10) {
            System.out.println("I need a Phone");
            System.out.println("Plz give me a water");
            i++;
        }
    }
}
public class Acces{
    public static void main(String[] args) {
        Mythread2 o = new Mythread2();
        MyThread1 m = new MyThread1();
        o.start();
        m.start();
    }
}
