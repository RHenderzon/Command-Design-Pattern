/**
 * 
 * @author Shayon Ghoshroy
 * Print command initiates printing of the linked document
 * 
 */
public class PrintCommand implements Command {

	private Document document;
	
	/**
	 * Constructor
	 * @param document
	 */
	public PrintCommand(Document document) {
		this.document = document;
	}
	
	/**
	 * Executes the spell check functionality
	 * @param none
	 */
	public void execute() {
		document.print();
		System.out.print("is being printed ... \n");
	}
	
}
