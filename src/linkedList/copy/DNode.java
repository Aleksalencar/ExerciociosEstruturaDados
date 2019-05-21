package linkedList.copy;
public class DNode{
	
		private int element;
		private DNode previous;
		private DNode next; 
		
		public DNode(int element2, DNode p, DNode n) {
			element = element2;
			previous = p;
			next = n;
			
		}
		public DNode(int element) { 
			this(element, null, null);
		}

		public int getElement(){ return element; }
		public DNode getNext(){ return next; }
		public DNode getPrevius() { return previous;}
		public void setElement(int newElem){ element = newElem; }
		public void setNext(DNode newNext){ next = newNext; }
		public void setPrevius(DNode newPrevius) { previous = newPrevius; }

}
