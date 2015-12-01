import java.util.Scanner;

public class Teams {

	static Scanner sc = new Scanner(System.in);
	public static int optionPlayer = 0;
	public static int optionOpponent = 0;
	public static String[] teams = { "São Paulo", "Corinthians", "Santos", "Palmeiras" };

	public static String[] chooseTeamPlayer() {

		String[] teamPlayer = null;

		while (optionPlayer <= 0 || optionPlayer > 4) {

			System.out.println("Escolha seu time: (1) São Paulo (2) Corithians (3) Santos (4) Palmeiras");
			optionPlayer = sc.nextInt();

			switch (optionPlayer) {

			case 1:
				String[] SaoPaulo = { "Rogério Ceni", "Carlinhos", "Bruno", "Lucão", "Rodrigo Caio", "Thiago Mendes",
						"Wesley", "PH Ganso", "Michel Bastos", "Alexandre Pato", "Luis Fabiano" };
				return teamPlayer = SaoPaulo;

			case 2:
				String[] Corinthians = { "Cassio", "Fagner", "Uendel", "Gil", "Felipe", "Ralf", "Elias",
						"Renato Augusto", "Jádson", "Vágner Love", "Malcon" };
				return teamPlayer = Corinthians;

			case 3:
				String[] Santos = { "Vanderlei", "Zeca", "Victor Ferraz", "David Brás", "Gustavo Henrique",
						"Lucas Lima", "Thiago Maia", "Marquinhos Gabriel", "Geuvânio", "Ricardo Oliveira",
						"Gabriel 'Gabigol'" };
				return teamPlayer = Santos;

			case 4:
				String[] Palmeiras = { "Fernando Prass", "Lucas", "Egidio", "Victor Ramos", "Jackson", "Arouca",
						"Zé Roberto", "Robinho", "Gabriel Jesus", "Lucas Barrios", "Dudu" };
				return Palmeiras;

			default:
				System.out.println("Opcao Inválida.");
				break;

			}
		}
		return teamPlayer;
	}

	public static String[] chooseTeamOpponent() {

		String[] teamOpponent = null;

		while (optionOpponent <= 0 || optionOpponent > 4) {

			System.out.println("Escolha o seu Adversário: (1) São Paulo (2) Corithians (3) Santos (4) Palmeiras");
			optionOpponent = sc.nextInt();

			if (optionOpponent != optionPlayer) {

				switch (optionOpponent) {

				case 1:
					String[] SaoPaulo = { "Rogério Ceni", "Carlinhos", "Bruno", "Lucao", "Rodrigo Caio",
							"Thiago Mendes", "Wesley", "PH Ganso", "Michel Bastos", "Alexandre Pato", "Luis Fabiano" };
					return teamOpponent = SaoPaulo;

				case 2:
					String[] Corinthians = { "Cassio", "Fagner", "Uendel", "Gil", "Felipe", "Ralf", "Elias",
							"Renato Augusto", "Jádson", "Vágner Love", "Malcon" };
					return teamOpponent = Corinthians;

				case 3:
					String[] Santos = { "Vanderlei", "Zeca", "Victor Ferraz", "David Brás", "Gustavo Henrique",
							"Lucas Lima", "Thiago Maia", "Marquinhos Gabriel", "Geuvanio", "Ricardo Oliveira",
							"Gabigol" };
					return teamOpponent = Santos;

				case 4:
					String[] Palmeiras = { "Fernando Prass", "Lucas", "Egidio", "Victor Ramos", "Jackson", "Arouca",
							"Zé Roberto", "Robinho", "Gabriel Jesus", "Lucas Barrios", "Dudu" };
					return Palmeiras;

				default:
					System.out.println("Opcao Inválida.");
					break;

				}
			} else {
				System.out.println("Time ja escolhido.");
				optionOpponent = 0;
			}
		}
		return teamOpponent;
	}

}
