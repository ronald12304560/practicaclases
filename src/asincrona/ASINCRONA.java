package asincrona;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ASINCRONA {

    
    public static void main(String[] args) {
        ExecutorService exec1 = Executors.newSingleThreadExecutor();
        exec1.submit(() ->{
            tarea1();
            exec1.shutdown();
        });
        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        exec2.submit(() ->{
            tarea2();
            exec2.shutdown();
        });
        ExecutorService exec3 = Executors.newSingleThreadExecutor();
        exec3.submit(() ->{
            tarea3();
            exec3.shutdown();
        });
    }
    public static void tarea1(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Tarea 1:"+i);
        }
    }
    public static void tarea2(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Tarea 2:"+i);
        }
    }
    public static void tarea3(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Tarea 3:"+i);
        }
    }   
    
}
