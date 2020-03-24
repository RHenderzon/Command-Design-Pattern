/**
 * 
 * @author Ryan Henderson
 * @author Shayon Ghoshroy
 * Spell command initiates Spell Check on the linked document
 *
 */
public class SpellCommand implements Command {

	private Document document;
	
	/**
	 * Constructor
	 * @param document
	 */
	public SpellCommand(Document document) {
		this.document = document;
	}
	
	/**
	 * Executes the spell check functionality
	 * @param none
	 */
	public void execute() {
		document.spell();
		System.out.print("is being spell checked ... \n");
	}
}
