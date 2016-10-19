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
	
	public void addElement(ListElement le)
	{
		if(head == null)
		{
			head = le;
			return;
		}
		
		ListElement current = head;
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(le);
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
		
		if(index == 0)
		{
			head = head.getNext();
		}
		
		if(head == null)
		{
			return head;
		}
		
		for(int i = 0; i < index; i++)
		{
			previous = current;
			current = current.getNext();
		}
	
		ListElement returnElement = current;
		
		previous.setNext(current.getNext());
		
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
