
public class ResumeGame {
	
	static Main main = new Main();
	static Teams teams = new Teams();
	
	public void resumeGame(String [] team, int [] teamGoals){
		int qtdGols = 0;
		for (int i = 0; i < teamGoals.length; i++) {
			if(teamGoals[i] != 0){
				System.out.printf("%s - %d gol(s)\n",team[i],teamGoals[i]);
				qtdGols++;
			}
		}
		
		if(qtdGols == 0) System.out.println("Não marcou gols");
	}

}
