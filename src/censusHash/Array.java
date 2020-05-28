package censusHash;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Array {
	

		//LastNames lastNames;
		String lineIn;
		LastNames names = new LastNames();
		Map<String, LastNames> map = new HashMap<String, LastNames>();
		
		public void create()  throws FileNotFoundException {
			@SuppressWarnings("resource")
			Scanner inFile = new Scanner(new File("LastNames2000Census.txt"));
			
			while(inFile.hasNext()) {				
				names = new LastNames();

				//get the next line and delimit on comma
				lineIn = inFile.nextLine();				
				String[] nextString = lineIn.split(",");
				
				//set the variable with the delimited information
				names.setName(nextString[0]);
				names.setRank(Integer.parseInt(nextString[1]));
				names.setOccurs(nextString[2]);
				names.setPerHundred(nextString[3]);
				names.setPerThousand(nextString[4]);
				
				//add this name instance to the hashmap
				map.put(names.getName(), names);				
				
			}	
		}
		
		public void find() {
			 Scanner keyboard = new Scanner(System.in);
			 String response = null;
			do {
				System.out.println("Please enter a name.");
				response = keyboard.nextLine().toUpperCase();
				if(map.get(response) == null)
					System.out.println("name not found");
				else	
					System.out.println(map.get(response));
				
				System.out.println("Would you like to search any other names?");
				System.out.println("Y or y if yes");
				
				response = keyboard.nextLine();
			} while(response.charAt(0) == 'y' || response.charAt(0) == 'Y');
			
			keyboard.close();
			System.out.println("Thank you, Have a nice day");
 }
}
