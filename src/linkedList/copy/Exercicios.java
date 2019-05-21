package linkedList.copy;


public class Exercicios {

	public static void main(String[] args) {
		JDLinkedList l1 = new JDLinkedList();
		JDLinkedList l2 = new JDLinkedList();
		try {
			l1.insertLast(new DNode(1));
			l1.insertLast(new DNode(2));
			l1.insertLast(new DNode(3));
			l1.insertLast(new DNode(4));
			l1.insertLast(new DNode(5));
			//l1.show();
			System.out.println();
			l1.insertLast(new DNode(6));
			l1.insertLast(new DNode(7));
			l1.insertLast(new DNode(8));
			l1.insertLast(new DNode(9));
			l1.insertLast(new DNode(10));
			//l1.show();
			l1.show2();
			
		}catch(Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();	
		}


	}

}
