package thread;

import thread.Rendu.ImplementThreads;

import java.util.Scanner;

public class Main {
    //Part 1
    public static void main(String[] args) {
        //Part1
        ImplementThreads a = new ImplementThreads(0);
        Scanner nbThread = new Scanner(System.in);
        System.out.println("Combien de thread voulez-vous ?");
        int mesThreads = nbThread.nextInt();
        a.createThread(mesThreads);

        //Part2
        System.out.println("Entrez : kill ID ou exit");
        Scanner cin = new Scanner(System.in);
        String cmd = cin.nextLine();
        if (cmd.equals("kill ID")) {
            System.out.println("Entrez l'ID");
            long id = cin.nextInt();
            a.killThreadById(id);
            } else if (cmd.equals("exit")) {
                a.killRemainThreads();
                    } else {
                        System.out.println("Erreurs, veuillez choisir entre kill ID ou exit");
                        }

    }
}
