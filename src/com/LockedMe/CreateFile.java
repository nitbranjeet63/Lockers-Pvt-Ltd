package com.LockedMe;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFile {
	public void createfile() {
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);//Creating Object of Scanner Class
		try {
			System.out.println("Enter the file name: ");
			String filename=sc.nextLine()+".txt";//Saving file with .txt Extension for readability
			FileOutputStream fileout = new FileOutputStream(filename,true);//Creating Object of FileOutputStream Class and file will be create to the current directory
			System.out.println("Enter file content:");
			String str =sc.nextLine()+"\n";
			byte[] b = str.getBytes();//Converting String to Array
			fileout.write(b);//Performing write operation on file
			fileout.close();
			System.out.println("File saved");
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
}

