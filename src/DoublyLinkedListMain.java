public class DoublyLinkedListMain {

	public static void main(String[] args) {
		List woess = new List(5);
		woess.addElementLastPlace(7);
		woess.addElementLastPlace(7);
		woess.addElementLastPlace(77);
		woess.addElementFirstPlace(55);
		woess.deleteSpecificElement(10);
		woess.writeList();
	}

}
