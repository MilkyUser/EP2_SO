import java.lang.Thread;
import java.util.LinkedList;
import java.util.Collections;

public class ThreadPool {

    static public Thread[] pool = new Thread[100];
    static public LinkedList<Integer> freeMembers = new LinkedList<>();

    ThreadPool(){
        for (int i=0; i<100; i++){
            freeMembers.addFirst(i);
        }
        Collections.shuffle(freeMembers);
    }

    public void addThread(Thread t){
        pool[freeMembers.pop()] = t;
    }
}
