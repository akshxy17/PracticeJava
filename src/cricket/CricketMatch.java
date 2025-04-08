package cricket;

import java.util.Scanner;

public class CricketMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum overs for the match: ");
        int maxOvers = scanner.nextInt();
        
        CricketScoreBoard scoreboard = new CricketScoreBoard(maxOvers);
        
        while (!scoreboard.isInningsOver()) {
            System.out.println("1. Add Run (1-6)\n2. Add Wicket\n3. Add Extra Runs\n4. Show Score\n5. End Innings");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter runs scored (1-6): ");
                    int runs = scanner.nextInt();
                    scoreboard.addRun(runs);
                    break;
                case 2:
                    scoreboard.addWicket();
                    break;
                case 3:
                    System.out.print("Enter extra runs: ");
                    int extras = scanner.nextInt();
                    scoreboard.addExtra(extras);
                    break;
                case 4:
                    scoreboard.displayScore();
                    break;
                case 5:
                    System.out.println("Innings declared over!");
                    scoreboard.displayScore();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        System.out.println("Innings Over!");
        scoreboard.displayScore();
    }
}
