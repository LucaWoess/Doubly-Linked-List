public class List {
	Element headElement;
	
	public List(int headValue) {
		this.headElement = new Element(headValue);
	}
	
	public Element getLastElement() {
		Element lastElement = headElement;
		while(lastElement.nextAddress != null) {
			lastElement = lastElement.nextAddress;
		}
		return lastElement;
	}
	
	public void addElement(int value) {
		Element lastElement = getLastElement();
		Element newElement = new Element(value);
		lastElement.nextAddress = newElement;
		newElement.prevAddress = lastElement;
	}
	
	public void writeList() {
		Element elem = headElement;
		while(elem != null) {
			System.out.println(elem.value);
			elem = elem.nextAddress;
		}
	}

	/*public int lenght() {
		int lenght = 1;
		Element nextElement = headElem.address;
		while(nextElement != null) {
			lenght++;
			nextElement=nextElement.address;
		}
		return lenght;
	}*/
}
