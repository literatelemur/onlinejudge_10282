import java.util.*;

public class onlinejudge_10282 {
	public static void main(String[] args) {
		// Collecting input.
		Scanner input = new Scanner(System.in);
		// String list to contain every dictionary entry.
		List<String> allEntries = new ArrayList<String>();
		// String to hold an entry for parsing after reading.
		String dicEntry = new String();
		
		// Run through all dictionary entries in the input.
		while(true){
			dicEntry = input.nextLine();
			if(dicEntry == "") {
				break;
			} else {
				// Separating english from foreign word.
				String[] split = dicEntry.split(" ");
				String engl = split[0];
				String fore = split[1];
				
				// Adding dictionary entry as a pair where even indices are foreign and even are english.
				allEntries.add(engl);
				allEntries.add(fore);
			}
		}
		
		// Desired word to find out about.
		String lookup = new String();
		// Run though all desired words in input.
		while(true) {
			lookup = input.nextLine();
			if(lookup == "") {
				break;
			}else {
				// Printing the word directly before the desired word, AKA the complement to the pair, AKA the english word..
				if(allEntries.contains(lookup)) {
					System.out.println(allEntries.get(allEntries.indexOf(lookup) - 1));
				} else {
					System.out.println("eh");
				}
			}
		}
		input.close();
	}

}
