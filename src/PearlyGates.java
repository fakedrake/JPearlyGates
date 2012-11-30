
import gates.*;

public class PearlyGates {
	public static void main(String[] args) {
		BreadBoard bb = new BreadBoard(4,10);
		
		// Inputs
		bb.addInput(new Input(false),0);
		bb.addInput(new Input(true),1);
		
		// Outputs
		bb.addGate(new AndGate(),0,1,0,1);
		
		try {
			System.out.println(bb.getOutput(1,0));
		} catch (NoInputsException e) {
			System.out.println("Problem with the connections.");
		}
	}
}
