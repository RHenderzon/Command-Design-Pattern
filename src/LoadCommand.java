/**
 * 
 * @author Ryan Henderson
 * @author Shayon Ghoshroy
 * Load command initiates the loading of the linked document
 */
public class LoadCommand implements Command {
	
	private Document document;
	
	/**
	 * Constructor
	 * @param document
	 */
	public LoadCommand(Document document) {
		this.document = document;
	}
	
	/**
	 * Executes the load functionality
	 * @param none
	 */
	public void execute() {
		document.load();
		System.out.print("is being loaded ... \n");
	}
}
