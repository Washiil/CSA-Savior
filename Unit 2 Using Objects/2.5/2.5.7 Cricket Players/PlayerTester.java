public class PlayerTester
{
    public static void main(String[] args) {
       
       CricketPlayer lara = new CricketPlayer("Brian Lara","Bears");
       CricketPlayer allen = new CricketPlayer("Fabian Allen");
       
       lara.addMatch(5, 5);
       lara.addMatch(5, 5);
       lara.addMatch(5, 5);
       lara.addMatch(5, 5);
       lara.addMatch(5, 5);
       
       allen.addMatch(5, 5);
       allen.addMatch(5, 5);
       allen.addMatch(5, 5);
       allen.addMatch(5, 5);
       allen.addMatch(5, 5);
       
       System.out.println("Brian Lara's Stats:");
       lara.printRunsScored();
       lara.printBallsBowled();
       System.out.println(lara);
       
       System.out.println("Fabian Allen");
       allen.printRunsScored();
       allen.printBallsBowled();
       System.out.println(allen);
    }
}