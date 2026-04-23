package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	
	private Scanner scanner = new Scanner(System.in);
	private ControlReserverTable controlReserverTable;
	
	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}
	
	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez vous reserver ?");
		System.out.println("Pour quel mois ?");
		int mois = scanner.nextInt();
		System.out.println("Pour quel jour ?");
		int jour = scanner.nextInt();
		System.out.println("Pour combien de personnes ?");
		int nbPersonnes = scanner.nextInt();
		System.out.println("Pour quel service ?");
		int numService = scanner.nextInt();
		
		int[] possibilites = controlReserverTable.trouverPossibilite(jour,mois,nbPersonnes,numService);
		for (int i = 0; i < possibilites.length; i++) {
			if(possibilites[i] != 0) {
				System.out.println("Num ro de table : " + possibilites[i]);
			}
		}
		System.out.println("Choisissez votre table ?");
		String numTable = scanner.next();
		int intNumTable = Integer.parseInt(numTable);
		controlReserverTable.reserver(numClient,intNumTable,possibilites[0]);
	}
}
