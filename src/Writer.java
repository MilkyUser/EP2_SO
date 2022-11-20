import java.lang.Thread;

public class Writer extends Thread {
    public void run(){
        Main.palavras[Main.random.nextInt(Main.palavras.length)] = "MODIFICADO";
    }
}
