package thread.Rendu;

import java.util.ArrayList;

public class ImplementThreads implements Runnable {
     int num = 0;
     int compteur = 0;
     ArrayList<Thread> listeThread = new ArrayList<Thread>();
     //Part 1
    public ImplementThreads(int num) {
        this.num = num;
    }
    public void createThread(int n){
        for(int i = 0; i < n; i++){
            ImplementThreads rnb = new ImplementThreads(compteur);
            Thread a = new Thread(rnb);
            listeThread.add(a);
            if (i < 10) {
                a.setPriority(Thread.MIN_PRIORITY + i);
                System.out.println("Niveau de priorite du thread "+compteur+" : " + a.getPriority());
                System.out.println("Id du thread : " + a.getId());
            }
            a.start();
            compteur +=1;
        }
    }
        @Override
        public void run() {

            for(int n = 0; n < 4; n++){
                System.out.println("hello "+num+" "+n);
            }
        }

        //Part 2
    public void killThreadById(long num){
        for (Thread idThread : listeThread) {
            long x = idThread.getId();
            if ( x == num) {
                idThread.interrupt();
                listeThread.remove(idThread);
                System.out.println("Le thread d'index "+ num + " a été tué");
                break;
            }
        }
    }

    public void killRemainThreads(){
        for (Thread idThread : listeThread) {
            idThread.interrupt();
        }
        listeThread.clear();
        System.out.println("Tous les threads on été tués");
    }


}
