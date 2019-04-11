package animal;

public class TournamentLauncher {

    public static void main(String[] args) {
        Course c = new Course();
        Team team = new Team();
        team.premiere();
        c.doIt(team);
        team.showResults();

    }
}
