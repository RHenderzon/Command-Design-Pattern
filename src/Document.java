/**
 * 
 * @author Ryan Henderson
 * @author Shayon Ghoshroy
 * Document class, holds the document information, commands can be run on it
 * 
 */
public class Document {
	
	private String name;
	
	/**
	 * Constructor
	 * @param name - String Name of the document
	 */
	public Document(String name) {
		this.name = name;
	}
	
	/**
	 * Prints the name of the document and ... to signify the load command is now kicking in
	 * @param none
	 */
	public void load() {
		System.out.print(name + " ... ");
	}
	
	/**
	 * Prints the name of the document and ... to signify the spell command is now kicking in
	 * @param none
	 */
	public void spell() {
		System.out.print(name + " ... ");
	}
	
	/**
	 * Prints the name of the document and ... to signify the save command is now kicking in
	 * @param none
	 */
	public void save() {
		System.out.print(name + " ... ");
	}
	
	/**
	 * Prints the name of the document and ... to signify the print command is now kicking in
	 * @param none
	 */
	public void print() {
		System.out.print(name + " ... ");
	}
}
