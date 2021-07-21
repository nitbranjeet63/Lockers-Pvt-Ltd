package com.LockedMe;

import java.util.Scanner;
/*
This Class is used for Generating,Deleting A document
*/
public class Welcome {

	public static void main(String[] args) 
	{
		int ch;
		
		Scanner sc = new Scanner(System.in);//Creating Object of Scanner Class
		
		try {
			lp: while(true) {
				// displaying the menu
				System.out.println("\n---------------------File I/O Operation------------------------------");
				System.out.println("Company :-   Lockers Pvt. Ltd.");
				System.out.println("Product:-    LockedMe.com");
				System.out.println("Developer :- Ranjeet Kr. Soren(Java DEveloper SE1)\n\n");
				System.out.println("---------------------Application Main Interface---------------------------");
				System.out.println("1. Add a file to the existing directory list.");
				System.out.println("2. Delete a user specified file from the existing directory list.");
				System.out.println("3. Search all user specified file from the main directory.");
				System.out.println("4. Exit");
				System.out.println("\n           Please Enter any option to perform: ");
				ch = sc.nextInt();// Reading user Choice
				switch(ch)
				{
					case 1:
						CreateFile cfile = new CreateFile();//Creating Object of CreateFile Class
						cfile.createfile();
						break;
					case 2:
						System.out.println("-------------List of available files to delete---------------------");
						SearchFile Sfile = new SearchFile();//Creating Object of SearchFile Class
						Sfile.searchfile();
						DeleteFile Dfile = new DeleteFile();//Creating Object of DeleteFile
						Dfile.deleteFile();
						break;
					case 3:
						System.out.println("-------------List of all the files---------------------");
						SearchFile SALLfile = new SearchFile();//Creating Object of SearchFile Class
						SALLfile.searchfile();
						break;
					case 4:
						System.out.println("\nApplication Exit.");
						break lp;
					default:
						System.out.println("\nInvalid option! Please make a valid Option\n");
					
				}
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		sc.close();
}

}
