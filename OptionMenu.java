package VirtualKey;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OptionMenu {
	
	static void chooseOption() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Here you can interact with my project by selecting one of the options given below :");
		while(true) {
		System.out.println("1.Get current file names in ascending order");
		System.out.println("2.I want to do File operations in directory");
		System.out.println("3.Exit");
				
		int opt = sc.nextInt();
		switch(opt) {
		case 1:
			OptionMenu.getFilesInAscending();
			break;
		case 2:
			try {
				FileOperation.opr();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			break;
			default:
				System.out.println("Please enter correct option");
				System.out.println("------------------------------");
		}
		if(opt == 3) {
			break;
		}
		}
	}
	
	
	static void getFilesInAscending() {
		File f = new File("F:\\Java Bootcamp\\MyPhase");
		String[] str = f.list();
		List<String> list = new ArrayList<String>();
		for(int i = 0;i < str.length;i++) {
			list.add(str[i]);
		}
		Collections.sort(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------");
	}
	}

