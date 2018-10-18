package mx.com.superq.cursos.threads.Threadsimplo;

public class ThreadMain {

    public static void main(String[]args){

       Tarea tarea=new Tarea();

        for (int i=1;i<=100;i++){
            new Thread(tarea, String.valueOf(i)).start();
        }

        System.out.println("--------------------------------------");

    }//main
}//fin de la clase
