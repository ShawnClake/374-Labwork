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
	
	int length = 0;
	
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
		
		length++;
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
		
		if(index == 0)
		{
			head = head.getNext();
		}
		
		if(head == null)
		{
			tail = null;
			length = 0;
			return head;
		}
		
		ListElement current = head;
		
		if(length > 0 && index > length)
		{
			index = length;
		}
		
		for(int i = 0; i < index; i++)
		{
			current = current.getNext();
		}
		
		if(index == length)
		{
			ListElement returnElement = current;
			
			current.getPrevious().setNext(current.getNext());
			tail = current.getPrevious();
			
			current = null;
			
			return returnElement;
		}
			
		ListElement returnElement = current;
		
		current.getNext().setPrevious(current.getPrevious());
		current.getPrevious().setNext(current.getNext());
		
		current = null;
		
		length--;
		
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
	
	public void printLinkedListTail()
	{
		ListElement current = tail;
		while(current != null)
		{
			System.out.print(current.getData() + "\n");
			current = current.getPrevious();
		}
	}
	
}
