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
		commands.put("load", new LoadCommand(document));
		commands.put("Save", new Savecommand(document));
		commands.put("Spell", new SpellCommand(document));
		commands.put("Print", new PrintCommand(document));
	}
	
	/**
	* Checks map with given key
	* @param string data is the key
	*/
	public void inputEntered(String data) {
		commands.get(data).execute();
	}
}