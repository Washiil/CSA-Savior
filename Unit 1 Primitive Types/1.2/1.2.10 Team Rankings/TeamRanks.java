public class TeamRanks
{
    public static void main(String[] args) {
		String team1 = "Alabama";
		String team2 = "Ohio State";
		String team3 = "Florida State";
		String team4 = "USC";
		String team5 = "Clemson";
		String team6 = "Penn State";
		String team7 = "Oklahoma";
		String team8 = "Maryland";
		String team9 = "Wisconsin";
		String team10 = "Michigan";
		/*
		 * Don't edit above this line.
		 * Enter your code below this comment.
		 */
		String temp = team2; // null -> Ohio State
        team2 = team6; // Ohio State -> Penn State
        team6 = temp; // Penn State -> Ohio State
        temp = team3; // Ohio State -> Florida State
        team3 = team8; // Florida State -> Maryland
        team8 = temp; // Maryland -> Ohio State
        temp = team4;
        team4 = team10;
        team10 = temp;
        temp = team5;
        team5 = team10;
        team10 = temp;
        temp = team6;
        team6 = team10;
        team10 = temp;
        temp = team8;
        team8 = team9;
        team9 = temp;
		
		System.out.println("1. " + team1);
		System.out.println("2. " + team2);
		System.out.println("3. " + team3);
		System.out.println("4. " + team4);
		System.out.println("5. " + team5);
		System.out.println("6. " + team6);
		System.out.println("7. " + team7);
		System.out.println("8. " + team8);
		System.out.println("9. " + team9);
		System.out.println("10. " + team10);
		/*
		 * Don't edit below this line.
		 * Enter your code above this comment.
		 */
	}
}