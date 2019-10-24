package com.exercise26streams.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteApp {

	public static void main(String[] args) {
		// Constants declaration
		final int LIMIT = 24;
		// Variables declaration
		int table = 0;
		// TODO Auto-generated method stub
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		Scanner scan = new Scanner(System.in);
		
		
		try {
			// Direct myFile to the path that I want 
			myFile = new File("f:\\a\\b.txt");
			// Create a new file 
			//myWriter = new FileWriter(myFile);
			// Write in the file leaving with what is already in it
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			// Make the MULTIPICATION TABLE that the user ask
			System.out.println("Input the multipication table");
			table = scan.nextInt();
			for(int i = 0; i < LIMIT; i++) {
				//System.out.format("%d x %d = %d \n",table,i,table*i);
				myBuffer.write(String.format("%d x %d = %d \n",table,i,table*i));
			}
			// Write times 'LIMIT'  -> "El Macho"
			/*
			for(int i = 0; i < LIMIT; i++) {
				myBuffer.write("El Macho");
			}*/
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				myBuffer.close();
				myWriter = null;
				myFile = null;
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
