public class DoublyLinkedListMain {

	public static void main(String[] args) {
		List woess = new List(5);
		woess.addElementLastPlace(7);
		woess.addElementLastPlace(7);
		woess.addElementLastPlace(77);
		woess.swapElement(0,3);
		woess.swapElement(0,3);
		//woess.addElementFirstPlace(55);
		//woess.deleteElementLastPlace();
		//woess.deleteElementFirstPlace();
		//woess.deleteSpecificElement(1);
		//woess.addElementSpecificPlace(1,4);
		woess.writeList();
	}

}
