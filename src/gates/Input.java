package gates;

public class Input implements Element {
	boolean value;
	
	public Input() {
		value = false;
	}
	
	public Input(boolean val) {
		value = val;
	}
	
	@Override
	public boolean output() {
		return value;
	}

}
