package mx.com.superq.cursos.threads.Threadsimplo;

public class Tarea implements Runnable {

    @Override
    public void run() {
        System.out.println("Numero de tarea :"+Thread.currentThread().getName());
    }
}//fin de la clase
