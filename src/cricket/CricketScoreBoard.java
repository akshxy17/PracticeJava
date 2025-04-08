package cricket;

class CricketScoreBoard {
    private int totalRuns;
    private int totalWickets;
    private int totalOvers;
    private int ballsInCurrentOver;
    private final int maxOvers;
    private final int maxWickets = 10;

    public CricketScoreBoard(int maxOvers) {
        this.totalRuns = 0;
        this.totalWickets = 0;
        this.totalOvers = 0;
        this.ballsInCurrentOver = 0;
        this.maxOvers = maxOvers;
    }

    public void addRun(int runs) {
        if (totalOvers >= maxOvers || totalWickets >= maxWickets) {
            System.out.println("Innings over! No more runs can be added.");
            return;
        }
        totalRuns += runs;
        updateBalls();
    }

    public void addWicket() {
        if (totalOvers >= maxOvers || totalWickets >= maxWickets) {
            System.out.println("Innings over! No more wickets can be taken.");
            return;
        }
        totalWickets++;
        updateBalls();
        if (totalWickets == maxWickets) {
            System.out.println("All out! Innings over.");
        }
    }

    public void addExtra(int runs) {
        totalRuns += runs;
    }

    private void updateBalls() {
        ballsInCurrentOver++;
        if (ballsInCurrentOver == 6) {
            totalOvers++;
            ballsInCurrentOver = 0;
        }
    }

    public void displayScore() {
        System.out.println("Current Score: " + totalRuns + "/" + totalWickets);
        System.out.println("Overs: " + totalOvers + "." + ballsInCurrentOver + " (Max: " + maxOvers + ")");
    }

    public boolean isInningsOver() {
        return totalOvers >= maxOvers || totalWickets >= maxWickets;
    }
}