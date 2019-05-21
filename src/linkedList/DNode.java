package linkedList;
public class DNode{
	
		private String element;
		private DNode previous;
		private DNode next; 
		
		public DNode(String element2, DNode p, DNode n) {
			element = element2;
			previous = p;
			next = n;
			
		}
		public DNode(String element) { 
			this(element, null, null);
		}

		public String getElement(){ return element; }
		public DNode getNext(){ return next; }
		public DNode getPrevius() { return previous;}
		public void setElement(String newElem){ element = newElem; }
		public void setNext(DNode newNext){ next = newNext; }
		public void setPrevius(DNode newPrevius) { previous = newPrevius; }

}
