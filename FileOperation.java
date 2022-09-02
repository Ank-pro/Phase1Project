package VirtualKey;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperation {

	static void opr() throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("What operation do you want to perform: ");
		System.out.println("1.Add file to existing folder");
		System.out.println("2.Delete your file");
		System.out.println("3.Search your file");
		System.out.println("4.Navigate back");
		
		int in = sc.nextInt();
		switch(in) {
		case 1:
			DirectoryOpr.addFile();
			break;
		case 2:
			DirectoryOpr.delete();
			break;
		case 3:
			DirectoryOpr.search();
			break;
		case 4:
			OptionMenu.chooseOption();
			break;
			default:
				System.out.println("Please enter correct option");
		}
	}
	}
}
