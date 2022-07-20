public class Games {
    
    String team;
    int games = 0;
    int wins = 0;
    int losses = 0;

    public Games(String teamName) {
        this.team = teamName;
    }

    // tally win
    public void teamWins() {
        this.wins++;
    }

    // tally loss
    public void teamLosses() {
        this.losses++;
    }

    // tally game played
    public void teamGames() {
        this.games++;
    }

    // get wins
    public int getWins() {
        return this.wins;
    }

    // get losses
    public int getLosses() {
        return this.losses;
    }

    // get games played
    public int getGames() {
        return this.games;
    }
}
