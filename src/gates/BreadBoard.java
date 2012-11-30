package gates;

import java.util.*;

public class BreadBoard {
	int columns, rows;
	
	Vector<Vector<Node> > nodes = new Vector<Vector<Node> >();
	List<Gate> gates = new LinkedList<Gate>();
	
	public BreadBoard(int c, int r) {
		columns = c;
		rows = r;
		
		// Populate the nodes
		for (int col=0; col<c; col++) {
			nodes.add(new Vector<Node>());
			for (int row=0; row<r; row++) {
				nodes.lastElement().add(new Node());
			}
		}
	}
	
	public void addGate(Gate g, int in1, int in2, int out, int in_col) {
		// Try to add a gate given the output row
		Vector<Node> inputs = nodes.get(in_col-1);
		Vector<Node> outputs = nodes.get(in_col);
		
		g.addInput(inputs.get(in1));
		g.addInput(inputs.get(in2));
		
		outputs.get(out).setSource(g);
		
		gates.add(g);
	}
	
	public void addInput(Input i, int row) {
		addInput(i, row, 0);
	}
	
	public void addInput(Input i, int row, int col) {
		nodes.get(col).get(row).setSource(i);
	}
		
	public boolean getOutput(int col, int row) throws NoInputsException {
		return nodes.get(col).get(row).getVal();
	}
	
}
