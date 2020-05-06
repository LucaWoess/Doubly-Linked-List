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
	
	public void addElementLastPlace(int value) {
		Element lastElement = getLastElement();
		Element newElement = new Element(value);
		lastElement.nextAddress = newElement;
		newElement.prevAddress = lastElement;
	}
	
	public void addElementFirstPlace(int value) {
		Element newElement = new Element(value);
		Element elem = getLastElement();
		addElementLastPlace(0);
		while(elem != null) {
			elem.nextAddress.value = elem.value;
			elem = elem.prevAddress;
		}
		headElement.value = newElement.value;
	}
	
	public void addSpecificElement(int index,int value) {
		Element newElement = new Element(value);
		if(index == 0) {
			addElementFirstPlace(value);
			return;
		}
		if(index>=length()) {
			System.out.println("The List isn´t that long!");
			return;	
		}
		if(index<0) {
			System.out.println("The number must be positive!");
			return;
		}
		addElementLastPlace(0);
		while(index < length()-1) {
			
			
		}
	}
	
	public void deleteSpecificElement(int index) {
		Element deleteElement = headElement;
		Element lastElement = null;
		if(index==0) {
			headElement=headElement.nextAddress;
			return;
		}
		if(index<0) {
			System.out.println("The number must be positive!");
			return;
		}
		if(index>=length()) {
			System.out.println("The List isn´t that long!");
			return;
		}
		while(index > 0)
		{
			lastElement = deleteElement;
			deleteElement = deleteElement.nextAddress;
			index--;
		}
		lastElement.nextAddress = deleteElement.nextAddress;

	}
	
	public void writeList() {
		Element elem = headElement;
		while(elem != null) {
			System.out.println(elem.value);
			elem = elem.nextAddress;
		}
	}

	public int length() {
		int lenght = 1;
		Element nextElement = headElement.nextAddress;
		while(nextElement != null) {
			lenght++;
			nextElement=nextElement.nextAddress;
		}
		return lenght;
	}
}
