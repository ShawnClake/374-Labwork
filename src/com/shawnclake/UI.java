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
		
		LinkedList list = new LinkedList();
		
		list.addElement(le);
		
		list.printLinkedListHead();
		
	}

}
