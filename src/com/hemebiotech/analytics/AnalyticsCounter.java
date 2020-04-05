package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headacheCount = 0;	
	private static int rashCount = 0;		
	private static int pupilCount = 0;		
	
	public static void main(String args[]) throws Exception {
		 //first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt")); //open FileReader
		String line = reader.readLine();

		int i = 0;	
		int headCount = 0;	// counts headaches
		while (line != null) {
		 i++;	
			System.out.println("symptom from file: " + line);
			
			if (line.equals("headache")) {
				headacheCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rash")) {
				//rashCount++;
			}
			else if (line.contains("pupils")) {
				//pupilCount++;
			}

			line = reader.readLine(); // get another symptom
			
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
	    writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
	CREER UNE NOUVELLE BRANCH TEO GORI, PUSH ET COMMIT AVEC CETTE BRANCH 
}
