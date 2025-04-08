package cricket;

import java.util.Scanner;

class Player {
    String name;
    int runs;
    int balls;
    int fours;
    int sixes;
    
    Player(String name) {
        this.name = name;
        this.runs = 0;
        this.balls = 0;
        this.fours = 0;
        this.sixes = 0;
    }

    void addRuns(int run) {
        this.runs += run;
        this.balls++;
        if (run == 4) this.fours++;
        if (run == 6) this.sixes++;
    }

    void displayStats() {
        System.out.println(name + " - Runs: " + runs + ", Balls: " + balls + ", 4s: " + fours + ", 6s: " + sixes);
    }
}

class CricketScoreboard {
    int totalRuns;
    int wickets;
    int overs;
    int balls;
    Player striker;
    Player nonStriker;
    
    CricketScoreboard(Player p1, Player p2) {
        this.totalRuns = 0;
        this.wickets = 0;
        this.overs = 0;
        this.balls = 0;
        this.striker = p1;
        this.nonStriker = p2;
    }
    
    void updateScore(int runs) {
        if (runs == -1) {
            System.out.println("Wicket! " + striker.name + " is out.");
            wickets++;
        } else {
            striker.addRuns(runs);
            totalRuns += runs;
        }
        balls++;
        if (balls == 6) {
            overs++;
            balls = 0;
            rotateStrike();
        } else if (runs % 2 != 0) {
            rotateStrike();
        }
    }
    
    void rotateStrike() {
        Player temp = striker;
        striker = nonStriker;
        nonStriker = temp;
    }
    
    void displayScore() {
        System.out.println("Score: " + totalRuns + "/" + wickets + " in " + overs + "." + balls + " overs");
        striker.displayStats();
        nonStriker.displayStats();
    }
}

public class cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Striker Name: ");
        Player p1 = new Player(sc.nextLine());
        System.out.print("Enter Non-Striker Name: ");
        Player p2 = new Player(sc.nextLine());
        
        CricketScoreboard scoreboard = new CricketScoreboard(p1, p2);
        
        while (true) {
            System.out.print("Enter runs (or -1 for wicket, 99 to end): ");
            int runs = sc.nextInt();
            if (runs == 99) break;
            scoreboard.updateScore(runs);
            scoreboard.displayScore();
        }
        sc.close();
    }
}

