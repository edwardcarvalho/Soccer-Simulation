public class GameActions {

	Main mainFoot = new Main();
	Teams teams = new Teams();

	public static void playGame(double movimentoTeams) {

		movimentoTeams = Math.random() * 3.5;

		switch ((int) movimentoTeams) {
		case 0:
			double movimentoTeamA = (Math.random()) * 4;
			if ((int) movimentoTeamA < 3) {
				System.out.println("Segue o jogo, bola rolando!");
				Main.minutosDeJogo += 5;
				break;

			} else {
				System.out.printf("GOOOOOOLLLLLLLLLLL do %s\n", Main.teamA);
				double stricker = (Math.random() * 10) + 1;
				String nomeMarcador = Main.teamPlayers[(int) stricker];
				System.out.printf("%s é o matador!!!\n", nomeMarcador.toUpperCase());
				Main.teamPlayersGoals[(int) stricker]++;
				Main.goalTeamA++;
				Main.minutosDeJogo += 5;
				System.out.printf("Placar : %s %d x %d %s\n", Main.teamA, Main.goalTeamA, Main.goalTeamB, Main.teamB);
				break;
			}

		case 1:
			double movimentoTeamB = (Math.random()) * 4;
			if ((int) movimentoTeamB < 3) {
				System.out.println("Segue o jogo, bola rolando!");
				Main.minutosDeJogo += 5;
				break;

			} else {
				System.out.printf("GOOOOOOLLLLLLLLLLL do %s\n", Main.teamB);
				double stricker = (Math.random() * 10) + 1;
				String nomeMarcador = Main.teamOpponents[(int) stricker];
				System.out.printf("%s é o matador!!!\n", nomeMarcador.toUpperCase());
				Main.teamOpponentsGoals[(int) stricker]++;
				Main.goalTeamB++;
				Main.minutosDeJogo += 5;
				System.out.printf("Placar : %s %d x %d %s\n", Main.teamA, Main.goalTeamA, Main.goalTeamB, Main.teamB);
				break;

			}

		default:
			System.out.println("Segue o jogo, bola rolando!");
			Main.minutosDeJogo += 5;
		}
	}
}
