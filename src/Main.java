import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static String[] palavras;
    public static void main(String [] args) throws FileNotFoundException {

        File texto = new File("/home/bruno/EP2_SO/src/bd.txt");
        Scanner sc = new Scanner(texto);

       palavras = new String[36242];
        int i = 0;

        while (sc.hasNextLine()) {
            palavras[i] = sc.nextLine();
            i++;
        }

        ThreadPool threadPool = new ThreadPool();
        for (i=0; i<30; i++){
            threadPool.addThread(new Writer());
        }
        for (i=0; i<70; i++){
            threadPool.addThread(new Reader());
        }
        for (i=0; i<100; i++){
            System.out.printf("[%d] %s\n", i+1, ThreadPool.pool[i].getClass().getName());
        }
    }
}