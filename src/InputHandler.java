import java.util.HashMap;

/**
*
* @author William Desmarteau
* @author Ryan Henderson
*
*/
public class InputHandler {
	
	private HashMap<String, Command> commands;
	private Document document;
	
	/**
	* Constructor
	*@param document - document for commands to be issued on
	*/
	public InputHandler(Document document) {
		this.document = document;
		HashMap<String, Command> commands = new HashMap<>();
		commands.put("load", new LoadCommand(this.document));
		commands.put("save", new SaveCommand(this.document));
		commands.put("spell", new SpellCommand(this.document));
		commands.put("print", new PrintCommand(this.document));
	}
	
	/**
	* Checks map with given key
	* @param string data is the key
	*/
	public void inputEntered(String data) {
		commands.get(data).execute();
	}
}