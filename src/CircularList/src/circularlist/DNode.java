package circularlist;
public class DNode {
	private	String element;
	private	DNode previus;
	private	DNode next;
	
	public DNode(String element, DNode previus, DNode next) {
		// TODO Auto-generated constructor stub
		this.element = element;
		this.next = next;
		this.previus = previus;
	}
	public DNode (String elements) {
		this(elements, null, null);
	}
									
								//Gatters
											
	//Retorna o conetudo desse node	
	public String getElement() {
		return element;
	}
	//Retorna a referência para o node anterior
	public DNode getPrevious() {
		return previus;
	}
	//Retorna a referência para o próximo node
	public DNode getNext() {
		return next;
	}
	
								//Settters
	
	public void SetElement (String newelement) {
		element = newelement;		
	}
	
	public void SetNext(DNode newnext) {
		next = newnext;
	}
	
	public void SetPrevius(DNode newprevius) {
		previus = newprevius;
	}
}
