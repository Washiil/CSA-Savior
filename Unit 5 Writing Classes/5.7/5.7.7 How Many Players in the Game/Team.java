public class Team
{
    public static int totalTeams = 0;
    public static int minTeams = 6;
    
    public Team() {
        totalTeams += 1;
    }
    
    public static boolean tournamentReady() {
        if (totalTeams >= minTeams) return true;
        return false;
    }
}