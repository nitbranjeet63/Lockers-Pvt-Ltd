package com.LockedMe;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFile {
	public void createfile() {
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		try {
			System.out.println("Enter the file name: ");
			String filename=sc.nextLine()+".txt";
			FileOutputStream fileout = new FileOutputStream(filename,true);
			System.out.println("Enter file content:");
			String str =sc.nextLine()+"\n";
			byte[] b = str.getBytes();
			fileout.write(b);
			fileout.close();
			System.out.println("File saved");
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
}

