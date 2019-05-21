package circularlist;


public class Main {

	public static void main(String[] args) {
		CircularList lista = new CircularList();
		try {
			//lista.insertFirst(new DNode("pao"));
			lista.insertFirst(new DNode("1 º "));
			lista.insertLast(new DNode("A, "));
			lista.insertLast(new DNode("B, "));
			lista.insertFirst(new DNode("vai ser removido (1º)"));
			lista.insertLast(new DNode("C, "));
			lista.insertLast(new DNode("D, "));
			lista.insertLast(new DNode("vai ser removido (ultitimo)"));
			lista.show(1);
			lista.removeLast();
			lista.removeFirst();
			lista.show(2);
		} catch (Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();
			}
		}
	
		
	}
