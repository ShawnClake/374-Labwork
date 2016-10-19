/**
 * 
 */
package com.shawnclake;

/**
 * @author sseStudent_2
 *
 */
public class UI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListElement le = new ListElement();
		le.setData(5);
		
		ListElement le2 = new ListElement();
		le2.setData(10);
		
		ListElement le4 = new ListElement();
		le4.setData(7);
		
		LinkedList list = new LinkedList();
		
		list.addElement(le);
		list.addElement(le2);
		list.addElement(le4);
		ListElement le3 = list.deleteElement(0);
		
		list.printLinkedListHead();
		
	}

}
