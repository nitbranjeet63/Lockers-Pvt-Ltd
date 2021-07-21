package com.LockedMe;

import java.io.File;
import java.io.FilenameFilter;

public class SearchFile {
	public void searchfile() {
		try {
				File folder = new File("C:\\Users\\OmSai\\eclipse-workspace\\Lockers Pvt Ltd"); 
				FilenameFilter txtFileFilter = new FilenameFilter()//Implementing FilenameFilter to retrieve only txt files
				{
					@Override
					public boolean accept(File dir, String name)
					{
						if(name.endsWith(".txt"))
						{
							return true;
						}
						else
						{	
							return false;
						}
					}
				};
 
				File[] files = folder.listFiles(txtFileFilter);//Passing txtFileFilter to listFiles() method to retrieve only txt files
 
				for (File file : files)
				{
					System.out.println(file.getName());
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				}
		}
}
