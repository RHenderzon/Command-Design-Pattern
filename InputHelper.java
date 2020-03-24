import java.util.HashMap;

public class InputHandler {
	private HashMap<String, command> commands;
	
	public InputHandler() {
		HashMap<String, command> commands =
				new HashMap<>();
		commands.put("load", LoadCommand());
		commands.put("Save", SaveCommand());
		commands.put("Spell", SpellCheckCommand());
		commands.put("Print", PrintCommand());
	}
	public void inputEntered(String data) {
		commands.get(data);
	}
}

