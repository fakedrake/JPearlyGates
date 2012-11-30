package gates;

import java.util.*;

public abstract class Gate implements Element {
	List<Node> inputs = new LinkedList<Node>();

	Gate() {
	}

	Gate(Node in1, Node in2) {
		addInput(in1);
		addInput(in2);
	}

	public void clearInputs() {
		inputs.clear();
	}

	public void addInput(Node in) {
		inputs.add(in);
	}

	@Override
	public boolean output() throws NoInputsException {
		boolean result = false, first = true;
		
		if (inputs.isEmpty()) {
			throw new NoInputsException();
		}
		
		for (Node i : inputs) {
			if (first) {
				first = false;
				result = i.getVal();
			} else {
				result = operate(result, i.getVal());
			}
		}

		return result;
	}
	
	abstract boolean operate(boolean in1, boolean in2);

}
