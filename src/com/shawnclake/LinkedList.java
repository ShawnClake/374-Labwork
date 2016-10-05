/**
 * 
 */
package com.shawnclake;

/**
 * @author sseStudent_2
 *
 */
public class LinkedList {

	ListElement head = null;
	
	ListElement tail = null;
	
	public void addElement(ListElement le)
	{
		if(head == null)
		{
			head = le;
			tail = le;
			return;
		}
		
		ListElement current = head;
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(le);
		le.setPrevious(current);
		tail = le;
	}
	
	public ListElement getElement(int index)
	{
		ListElement current = head;
		while((current.getNext() != null) && (index > 0))
		{
			index--;
			current = current.getNext();
		}
		return current;
	}
	
	public ListElement deleteElement(int index)
	{
		ListElement current = head;
		ListElement previous = current;
		
		while((current.getNext() != null) && (index > 0))
		{
			index--;
			previous = current;
			current = current.getNext();
		}
		
		if(current.getNext() != null)
		{
			previous.setNext(current.getNext());
			current.getNext().setPrevious(previous);
		}
		
		ListElement returnElement = current;
		
		current = null;
		
		return returnElement;
	}
	
	public void printLinkedListHead() 
	{
		
		ListElement current = head;
		while(current != null)
		{
			System.out.print(current.getData() + "\n");
			current = current.getNext();
		}
		
	}
	
}
