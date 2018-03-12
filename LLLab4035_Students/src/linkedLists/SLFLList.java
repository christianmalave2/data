package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import java.util.NoSuchElementException;

import linkedLists.LinkedList;
import linkedLists.AbstractDLList.DNode;

public class SLFLList<E> extends SLList<E>
{
	private SNode<E> first, last;   // reference to the first node and to the last node
	int length; 
	
	public SLFLList() {       // to create an empty list instance
		first = last = null; 
		length = 0; 
	}
	
	
	public void addFirstNode(Node<E> nuevo) {
		// TODO Auto-generated method stub
		SNode<E>SLFnuevo=(SNode<E>)nuevo;
		SLFnuevo.setNext(first);
		length++;
		
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		// TODO Auto-generated method stub
		SNode<E>SLFnuevo=(SNode<E>)nuevo;
		SNode<E>SLFtarget=(SNode<E>)target;
		SLFnuevo.setNext(SLFtarget.getNext());
		SLFtarget.setNext(SLFnuevo);
		length++;

		
	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		// TODO Auto-generated method stub
		SNode<E>SLFTarget=(SNode<E>)target;
		SNode<E>SLFnuevo=(SNode<E>)nuevo;		
		SNode<E>SLFtemp=first;
		while(SLFtemp.getNext()!=SLFTarget)
			SLFtemp=SLFtemp.getNext();
		SLFtemp.setNext(SLFnuevo);
		SLFnuevo.setNext(SLFTarget);
		
		
	}

	public Node<E> getFirstNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(first==null)
			throw new NoSuchElementException("OUT OF BOUNDS");
		
		return first;
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(first==null)
			throw new NoSuchElementException("OUT OF BOUNDS");
		
		return last;
	}

	public Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException {
		// TODO Auto-generated method stub
		SNode<E>SLFTarget=(SNode<E>)target;
		if(SLFTarget.getNext()==last || first==null)
			throw new NoSuchElementException("dwfcecvecvevc");
		
		return SLFTarget.getNext();
	}

	public Node<E> getNodeBefore(Node<E> target) throws NoSuchElementException {
		// TODO Auto-generated method stub
		SNode<E>SLFTarget=(SNode<E>)target;
		SNode<E>SLFtemp=first;
		if(length<=1 || first==null)
			throw new NoSuchElementException("ddddd");
		while(SLFtemp.getNext()!=SLFTarget)
			SLFtemp=SLFtemp.getNext();
		return SLFtemp;
		
	}

	public int length() {
		// TODO Auto-generated method stub
		return this.length;
	}

	public void removeNode(Node<E> target) {
		// TODO Auto-generated method stub
		SNode<E>SLFTarget=(SNode<E>)target;
		
		if(target==first){
			first=SLFTarget.getNext();
		}
		else if(target==last){
			SNode<E>SLFtemp = first;
			while(SLFtemp.getNext()!=last)
				SLFtemp=SLFtemp.getNext();
			last=SLFtemp;
			last.setNext(null);
		}
		else{
			SNode<E>SLFtemp = first;
			while(SLFtemp.getNext()!=SLFTarget)
				SLFtemp=SLFtemp.getNext();
			SLFtemp.setNext(SLFTarget.getNext());
			SLFTarget.setNext(null);
		}
		length--;		
	}
	
	public Node<E> createNewNode() {
		return new SNode<E>();
	}

	public Object[] toArray() {
		Object[] array = new Object[this.length()]; 
		SNode<E> tmp = first;
		
	    for (int i =0;i<length;i++) {
	        array[i] = tmp.getElement();
	        tmp = tmp.getNext();	        	    }
	    return array;
	}
	
	
}
