package shared;

public class InputProcessor {
	public static String getValue(String command) {
		int spacei = command.indexOf(" ");
		return command.substring(spacei+1);
	}
}
