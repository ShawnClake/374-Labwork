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
	
}
