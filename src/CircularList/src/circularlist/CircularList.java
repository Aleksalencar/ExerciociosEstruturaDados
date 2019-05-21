package circularlist;

public class CircularList {
	 
	
	protected DNode head;
	protected DNode tail;
	protected int size;
	
	public CircularList() { //Construtor
		head = null;
		tail = null;
		size = 0;
	}
	
	public Boolean isEmpty() {
		return head == null;
	}

	/*
	  	if (isEmpty()) {
			System.out.println("A lista esta vazia");
		} else {
		
		}
	*/
	
	// public DNode getFirst/Last () throws Exceptions (){ }
	public DNode getFirst () throws Exception {
		if (isEmpty()) {
			throw new Exception();
		} 
		return head;
	}
	
	public DNode getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception();
		} 
		return tail;
	}
	
	// public void insertFirst/Last (DNode newNode ) { }
	
	public void insertFirst(DNode newNode) {
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			newNode.SetNext(newNode);
			newNode.SetPrevius(newNode);
			size ++;
		} else {
			newNode.SetNext(tail);
			head.SetPrevius(newNode);
			head = newNode;
			size ++;
		}
	}
	
	public void insertLast(DNode newNode) {
		if (isEmpty()) {
			insertFirst(newNode);
		} else {
			newNode.SetPrevius(tail);
			newNode.SetNext(head);
			tail.SetNext(newNode);
			head.SetPrevius(newNode);
			tail = newNode;
			size ++;
		}		
	}
	
	public void removeFirst() throws Exception{
		if (isEmpty()) {
			throw new Exception ();
		}
		if(head == tail) {
			head = tail = null;
		}else {
			
			head.getNext().SetPrevius(tail);
			tail.SetNext(head.getNext());			
			head = head.getNext();
			
			/* head.SetNext(null); // apaga as referencias
			head.SetPrevius(null);*/
			
		}
		size --;
	}
	
	public void removeLast() throws Exception{
		if (isEmpty()) {
			throw new Exception ();
		}
		if(head == tail) {
			head = tail = null;
		}else {
			tail.getPrevious().SetNext(head);
			head.SetPrevius(tail.getPrevious());
			tail = tail.getPrevious();
			
			
			
		}
		
	}
	public void show(int i) {
		System.out.println("A lista é :");
		for (int j = 1; j <= i ; j++) {
			if (isEmpty()) {
				
				System.out.println("A lista esta vazia");
			
			} else {
				DNode current = head;
				do {
				
					System.out.println(current.getElement());
					current = current.getNext();
				
				} while (current != head);
			}
		System.out.println();
		}
		
	}
		
	}
	
