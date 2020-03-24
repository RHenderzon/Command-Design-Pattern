/**
 * 
 * @author Shayon Ghoshroy
 * Save command initiates saving of the linked document
 * 
 */
public class SaveCommand implements Command {

	private Document document;
	
	/**
	 * Constructor
	 * @param document
	 */
	public SaveCommand(Document document) {
		this.document = document;
	}
	
	/**
	 * Executes the save functionality
	 * @param none
	 */
	public void execute() {
		document.save();
		System.out.print("is being saved ... \n");
	}
}
