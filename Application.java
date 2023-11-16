/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

public class Application {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Dictionary myDict = new Dictionary();
		myDict.populateDict();
		System.out.println(myDict.toString());
		
		System.out.println("\nSearching for words \"quidnunc\", \"dandiprat\", \"laver\", \"poltroon\", \"sippet\"\n");
		
		String word = "quidnunc";
		System.out.println(word + " (" + word.hashCode() + "): " + myDict.getDef(word));
		word = "dandiprat";
		System.out.println(word + " (" + word.hashCode() + "): " + myDict.getDef(word));
		word = "laver";
		System.out.println(word + " (" + word.hashCode() + "): " + myDict.getDef(word));
		word = "poltroon";
		System.out.println(word + " (" + word.hashCode() + "): " + myDict.getDef(word));
		word = "sippet";
		System.out.println(word + " (" + word.hashCode() + "): " + myDict.getDef(word));
	}

}
