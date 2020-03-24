import java.util.HashMap;

/**
*
*@author william Desmarteau
*@param none
*
*/
public class InputHandler {
	private HashMap<String, command> commands;
	/**
	* Constructor
	*@param none
	*/
	public InputHandler() {
		HashMap<String, command> commands =
				new HashMap<>();
		commands.put("load", LoadCommand());
		commands.put("Save", SaveCommand());
		commands.put("Spell", SpellCheckCommand());
		commands.put("Print", PrintCommand());
	}
	/**
	* Checks map with given key
	* @param string data is the key
	*/
	public void inputEntered(String data) {
		commands.get(data);
	}
}

