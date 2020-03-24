/**
 * 
 * @author Ryan Henderson
 * Document class, hold the document information, commands can be run on it
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
	
	public void load() {
		System.out.print(name + " ... ");
	}
	
	public void spell() {
		System.out.print(name + " ... ");
	}
	
	public void save() {
		System.out.print(name + " ... ");
	}
	
	public void print() {
		System.out.print(name + " ... ");
	}
}
