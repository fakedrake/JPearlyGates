package gates;

public class OrGate extends Gate {

	@Override
	boolean operate(boolean in1, boolean in2) {
		return in1 || in2;
	}

}
