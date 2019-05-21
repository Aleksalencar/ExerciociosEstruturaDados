package linkedList.copy;

import auxiliares.UnderflowException;

public class JDLinkedList {
	
	protected DNode head;
	protected DNode tail;
	protected int size; 
	
	public JDLinkedList(){ 
		head = null; 
		tail = null; 
		size = 0; 

	}
	public boolean isEmpty() {
		return head == null;
	}
	
	public DNode getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
	return head;
	}
		
	public DNode getLast() throws UnderflowException{
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}
	public void insertFirst(DNode novoNode) {
		if (isEmpty()) {
		head = novoNode;
		tail = novoNode;
		size++;
		} else {
		novoNode.setNext(head);
		head.setPrevius(novoNode);
		head = novoNode;
		size++;
		}
		}
	public void insertLast(DNode novoNode) {
		if (isEmpty()) {
		insertFirst(novoNode);
		} else {
		tail.setNext(novoNode);
		novoNode.setPrevius(tail);
		tail = novoNode;
		size ++;
		}
		}
	
	
	public DNode removeFirst() throws UnderflowException {
	if (isEmpty()) {
		throw new UnderflowException();
	}
	DNode removedItem = head;
	if (head == tail) {
		head = tail = null;
	} else {
		head.getNext().setPrevius(null);
		head = head.getNext();
	}
	size--;
	return removedItem;
	}
	
	public void removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		if (head == tail) {
			head = tail = null;
		} else {
			tail.getPrevius().setNext(null);
			tail= tail.getPrevius();
		}
	}
	
	public void insertAfter(DNode n, int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos > size) { 
			throw new IndexOutOfBoundsException();
		}
		if (pos == size) {
			insertLast(n);
		} else {
			long posAtual;
			DNode current;
			if (pos < size / 2) {
				posAtual = 0;
				current = head;
			} else {
				posAtual = size -1;
				current = tail;
			}
			if(current == head ) {
				while (posAtual < pos) {
					current = current.getNext();
					posAtual ++;
				}
			}else {
				while (posAtual > pos) {
					current = current.getPrevius();
					posAtual --;
				}
			}
			n.setNext(current.getNext());
			n.setPrevius(current);
			current.getNext().setPrevius(n);
			current.setNext(n);
			size ++;
		}
	
	}
		
	public void insertBefore(DNode n,int ant) throws UnderflowException {
		if (ant < 0 || ant> size) { 
			throw new IndexOutOfBoundsException();
		}
		if (ant == size) {
			insertLast(n);
		} else {
			long antAtual;
			DNode current;
			if (ant< size / 2) {
				antAtual = 0;
				current = head;
			}else {
			antAtual = size -1;
			current = tail;
			}
			if (current == head) {
				while (antAtual < ant) {
					current = current.getNext();
					antAtual ++;
				}
			}else {
				while (antAtual > ant) {
					current = current.getPrevius();
					antAtual --;
				}
			}
			n.setPrevius(current.getPrevius());
			n.setNext(current);
			current.getPrevius().setNext(n);
			current.setPrevius(n);
			size++;
			
		}
		
	}
		
	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista é: ");
			DNode current = head;
			while (current != null) {		
				System.out.print(current.getElement()+ " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}	
	}
	public void show2() {
		DNode current = head;
		for (int i = 0; i < size/2; i++) {
			System.out.print(current.getElement()+ " ");
			current = current.getNext();
		}
	}	
}
