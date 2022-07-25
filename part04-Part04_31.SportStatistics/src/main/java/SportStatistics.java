import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        // ask user for filename
        Scanner scanFile = new Scanner(System.in);
        System.out.println("File: ");
        String filename = scanFile.nextLine();

        // ask user for team name
        System.out.println("Team: ");
        String teamName = scanFile.nextLine();

        Games chosenTeam = new Games(teamName);

        // read match statistics from file
        try (Scanner teamScanner = new Scanner(Paths.get(filename))) {
            while (teamScanner.hasNextLine()) {

                String line = teamScanner.nextLine();
                
                // split the line that's read into individual values
                String[] game = line.split(",");
                String homeTeam = game[0];
                String visitingTeam = game[1];
                int homeTeamPoints = Integer.valueOf(game[2]);
                int visitingTeamPoints = Integer.valueOf(game[3]);

                // If the team is either home or away, it counts as a game
                if (teamName.equals(homeTeam) || (teamName.equals(visitingTeam))) {
                    chosenTeam.teamGames();

                    // The below conditions will allow for a win or loss
                    if (teamName.equals(homeTeam) && homeTeamPoints > visitingTeamPoints) {
                        // count home match as win
                        chosenTeam.teamWins();
                    } else if (teamName.equals(visitingTeam) && visitingTeamPoints > homeTeamPoints) {
                        // count away match as win
                        chosenTeam.teamWins();
                    } else {
                        // count any match as loss
                        chosenTeam.teamLosses();
                    }
                }
            }            

        } catch (Exception e) {
            System.out.println("File does not exist: " + e);
        }

        // print games played
        System.out.println("Games: " + chosenTeam.getGames());

        // print wins and losses
        System.out.println("Wins: " + chosenTeam.getWins());
        System.out.println("Losses: " + chosenTeam.getLosses());

        scanFile.close();
    }
}
