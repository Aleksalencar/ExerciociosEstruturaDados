package linkedList;

import SimpleList.Node;

public class Exercicios {

	public static void main(String[] args) {
		JDLinkedList l1 = new JDLinkedList();
		JDLinkedList l2 = new JDLinkedList();
		try {
			l1.insertLast(new DNode("A"));
			l1.insertLast(new DNode("B"));
			l1.insertLast(new DNode("C"));
			l1.insertLast(new DNode("D"));
			l1.insertLast(new DNode("E"));
			l1.show();
			System.out.println();
			l2.insertLast(new DNode("A"));
			l2.insertLast(new DNode("B"));
			l2.insertLast(new DNode("C"));
			l2.insertLast(new DNode("D"));
			l2.insertLast(new DNode("E"));
			l2.show();
		System.out.println(l1.size);
		int ant = 4;
		//l1.insertAfter(new DNode(71), ant);
		//l1.insertBefore(new DNode (69), ant);
		l1.show();
		
		}catch(Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();	
		}
	}

}
