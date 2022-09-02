package VirtualKey;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryOpr {
	static Scanner sc = new Scanner(System.in);
	static void addFile() throws IOException{
		
		System.out.println("Enter the file name with ext: ");
		String fileName = sc.next();
		File f = new File("F:\\Java Bootcamp\\MyPhase",fileName);
			if(f.createNewFile()) {
			System.out.println("File created");
			System.out.println("------------------------------");
		}
			else {
				System.out.println("File already exist");
				System.out.println("------------------------------");
			}
	}
	
	static void delete() throws IOException {
		System.out.println("Enter file name with ext : ");
		String name = sc.next();
		File f = new File("F:\\Java Bootcamp\\MyPhase\\"+name);	
		
		if(f.delete()) {
				System.out.println("File deleted");
				System.out.println("------------------------------");
		}else {
			System.out.println("File not found");
			System.out.println("------------------------------");
		}		
			
		}
	
	static void search() {
		System.out.println("Enter file name to be searched with ext : ");
		String name = sc.next();
		File f = new File("F:\\Java Bootcamp\\MyPhase");
		String[] files = f.list();
		
		int count = 0;
		for(int i = 0;i < files.length;i++) {
			if(files[i].equalsIgnoreCase(name)) {
				System.out.println("File found");
				System.out.println("------------------------------");
			}
			else {
			count++;
			}
		}
		if(count == files.length) {
			System.out.println("File not found");
			System.out.println("------------------------------");
		}
	}
}
