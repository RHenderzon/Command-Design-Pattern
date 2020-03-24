/**
 * 
 * @author Ryan Henderson
 *
 */

public class LoadCommand implements Command {
	
	private Document document;
	
	public LoadCommand(Document document) {
		this.document = document;
	}
	
	public void execute() {
		document.load();
		System.out.print("is being loaded ... \n");
	}
}
