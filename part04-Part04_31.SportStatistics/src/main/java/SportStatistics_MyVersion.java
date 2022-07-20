import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics_MyVersion {

    public static void main(String[] args) {
        // ask user for filename
        Scanner scanFile = new Scanner(System.in);
        System.out.println("File: ");
        String filename = scanFile.nextLine();

        // ask user for team name
        Scanner scanTeam = new Scanner(System.in);
        System.out.println("Team: ");
        String teamName = scanTeam.nextLine();
        Games team = new Games(teamName);

        // read match statistics from file
        try (Scanner teamScanner = new Scanner(Paths.get(filename))) {
            while (teamScanner.hasNextLine()) {
                String line = teamScanner.nextLine();
                String[] game = line.split(",");
                String homeTeam = game[0];
                String visitingTeam = game[1];
                int homeTeamPoints = Integer.valueOf(game[2]);
                int visitingTeamPoints = Integer.valueOf(game[3]);

                // If the team is either home or away, it counts as a game
                if (teamName.equals(homeTeam) || (teamName.equals(visitingTeam))) {
                    team.teamGames();

                    // The below conditions will allow for a win or loss
                    if (teamName.equals(homeTeam) && homeTeamPoints > visitingTeamPoints) {
                        // count home match as win
                        team.teamWins();
                    } else if (teamName.equals(visitingTeam) && visitingTeamPoints > homeTeamPoints) {
                        // count away match as win
                        team.teamWins();
                    } else {
                        // count any match as loss
                        team.teamLosses();
                    }
                }
            }            

        } catch (Exception e) {
            System.out.println("File does not exist: " + e);
        }

        // print games played
        System.out.println("Games: " + team.getGames());

        // print wins and losses
        System.out.println("Wins: " + team.getWins());
        System.out.println("Losses: " + team.getLosses());

        scanFile.close();
        scanTeam.close();
    }

}
