package asincrona;


public class secuencial {
    public static void main(String[] args){
        tarea1();
        tarea2();
        tarea3();
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
        for (int i = 0; i < 20  ; i++) {
            System.out.println("Tarea 3:"+i);
        }
    }
}
    
