import java.util.Scanner;
import java.util.Timer;

public class Main {

	public static String teamA;
	public static String teamB;
	public static int goalTeamA = 0;
	public static int goalTeamB = 0;
	public static int minutosDeJogo = 0;
	public static Scanner sc;
	public static GameActions gameActions;
	public static Teams teams;
	public static String[] teamPlayers;
	public static int[] teamPlayersGoals = new int[11];
	public static String[] teamOpponents;
	public static int[] teamOpponentsGoals = new int[11];
	public static ResumeGame resumeGame;
	public static Timer timer;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		gameActions = new GameActions();
		teams = new Teams();
		resumeGame = new ResumeGame();
		timer = new Timer();

		teamPlayers = Teams.chooseTeamPlayer();
		teamA = Teams.teams[Teams.optionPlayer - 1];
		teamOpponents = Teams.chooseTeamOpponent();
		teamB = Teams.teams[Teams.optionOpponent - 1];

		System.out.println("Inicia a Partida!\n");
		System.out.printf("%s %d x %d %s\n", teamA, goalTeamA, goalTeamB, teamB);

		while (minutosDeJogo != 45) {
			System.out.println("\nAperte um numero para jogar!\n");
			GameActions.playGame(sc.nextDouble());
			System.out.printf("Tempo de jogo: %d minutos / 1° tempo\n", minutosDeJogo);
			if (minutosDeJogo >= 45) {
				System.out.println("Fim do 1° tempo:");
				System.out.printf("%s %d x %d %s\n\n", teamA, goalTeamA, goalTeamB, teamB);
			}
		}
		System.out.println("Inicio do 2° Tempo!!\n");
		System.out.printf("%s %d x %d %s\n", teamA, goalTeamA, goalTeamB, teamB);
		while (minutosDeJogo != 90) {
			System.out.println("\nAperte um numero para jogar!\n");
			GameActions.playGame(sc.nextDouble());
			System.out.printf("Tempo de jogo: %d minutos / 2° tempo\n", minutosDeJogo);
		}

		System.out.println("\nFim de Jogo!!");
		System.out.printf("%s %d x %d %s\n\n", teamA, goalTeamA, goalTeamB, teamB);
		System.out.println("");
		System.out.println(teamA);
		resumeGame.resumeGame(teamPlayers, teamPlayersGoals);
		System.out.println("");
		System.out.println(teamB);
		resumeGame.resumeGame(teamOpponents, teamOpponentsGoals);

	}

}
