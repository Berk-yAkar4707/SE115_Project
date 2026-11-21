import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Mission: Collect the relics and escape");
        System.out.println("S: Start / X: Exit / R: Relic / H: Hazard");
        System.out.println("C: Supply cache / .: Empty / @: Player");

        do {
            System.out.println("1 - New game");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            int choice=sc.nextInt();



            if (choice==1) {
                Expedition_ exp = new Expedition_();

                System.out.println("New session created.");

                System.out.println("Status: " + exp.getStatus());

                System.out.println("Position: " + exp.getRow() + ", " + exp.getColumn());

                System.out.println("Energy: " + exp.getEnergy() + "/" + exp.getMaxEnergy());

                System.out.println("Relics: " + exp.getCollectedRelics() + "/" + exp.getRequiredRelics());

                System.out.println("Moves: " + exp.getMoves());

                System.out.println("Score: " + exp.getScore());

            } else if (choice==0) {
                running = false;

            } else {
                System.out.println("Invalid choice");
            }

        } while (running);
        // empty for next stages

        System.out.println("Goodbye!");
    }
}
