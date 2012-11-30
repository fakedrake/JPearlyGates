package gates;

public class Node {
	Element source;
	
	Node() {
	}
	
	Node(Element ele) {
		 setSource(ele);
	}
	
	void setSource(Element ele) {
		source = ele;
	}
	
	void clearSource () {
		source = null;
	}
	
	boolean getVal() throws NoInputsException {
		if (source == null) {
			throw new NoInputsException();
		}
		
		return source.output();
	}
}

