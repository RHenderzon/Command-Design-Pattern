
public class SpellCommand implements Command {

	private Document document;
	
	public SpellCommand(Document document) {
		this.document = document;
	}
	
	public void execute() {
		document.spell();
		System.out.print("is being spell checked ... \n");
	}
}
