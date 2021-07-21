package com.LockedMe;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	public void deleteFile() {
		boolean state = true;
		System.out.print("\nEnter \"complete file\" name to Delete: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);////Creating Object of Scanner Class
		String delete=in.nextLine();
		File dir = new File("C:\\Users\\OmSai\\eclipse-workspace\\Lockers Pvt Ltd");//Passing the directory path 
		String[] files = dir.list();
		if(state==true) {
		for(String file:files) {
			if(file.equals(delete)){
				File filedel = new File(delete);
				filedel.delete();//Performing delete operation
				System.out.println("File Found and Deleted.");
				state=false;
				}
			}
		}
		if(state==true) {
			System.out.println("File Not Found!");
		}
		
		
	}

}
