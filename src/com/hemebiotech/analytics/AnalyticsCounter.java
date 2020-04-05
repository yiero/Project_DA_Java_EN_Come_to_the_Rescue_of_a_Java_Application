package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {		
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader reader = null;
		
			FileReader fileReader = new FileReader("symptoms.txt");		//d�claration du fileReader qui cible le dossier texte � lire.
			reader = new BufferedReader(fileReader);
		
		MyMap symptoms = new MyMap();   								//Mettre en "relation" la class MyMap avec AnalyticsCounter et lui donner un nom ici "symptoms".
		
		String line;	
		line = reader.readLine();
		
		while (line != null) {
			
			symptoms.showLine(line);									//faire appel aux 2 m�thodes de la class MyMap appel�e "symptoms" 
			symptoms.countSymptoms(line);								//
			
			line = reader.readLine();
		}
		reader.close();					//fermeture 
		System.out.println(symptoms.sort);   							//afficher la liste des symptomes dans l'ordre alphab�tique.
	
		FileWriter writer = new FileWriter ("result.out");
		writer.write(symptoms.sort.toString());
		writer.close();													//reporter les r�sultats sur un fichier texte inclu dans le dossier.
	}
	//CREER UNE NOUVELLE BRANCH TEO GORI, PUSH ET COMMIT AVEC CETTE BRANCH 
}

	