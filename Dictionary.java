/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Dictionary {
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	
	public void populateDict() {
		String currentLine;
		String currentWord;
		String currentDef;
		try {
			Scanner textIn = new Scanner(new File("WordValuePairs.txt"));
			while(textIn.hasNextLine()) { //While there is still input
				currentLine = textIn.nextLine();
				for(int i = 0; i < currentLine.length(); i++) { //For each char in currentLine
					if(currentLine.charAt(i)=='\u0009') { //If current char is unicode tab
						currentWord = currentLine.substring(0,i); //Substring of chars before tab
						currentDef = currentLine.substring(i+1, currentLine.length()); //Substring of chars after tab
						dictionary.put(currentWord, currentDef);
					}
				}
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}//end try/catch
	}//end populateDict()
	
	public String getDef(String word) {
		return dictionary.get(word);
	}
	
	public String toString() {
		return dictionary.toString();
	}
}
