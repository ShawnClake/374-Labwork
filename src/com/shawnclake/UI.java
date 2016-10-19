/**
 * 
 */
package com.shawnclake;
import java.util.Scanner;
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
		
		Scanner in = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		System.out.println("Doubly Linked List");
		
		boolean running = true;
		
		while(running)
		{
			printMenu();
			
			String input = in.nextLine();
			
			if(input.equals("q")) {
				running = false;				
			}
			
			if(input.equals("1"))
			{
				int data = 0;
				System.out.println("Enter the data for the element (int): ");
				data = in.nextInt();
				
				ListElement le = new ListElement();
				le.setData(data);
				
				list.addElement(le);
			}
			
			if(input.equals("2"))
			{
				int index = 0;
				System.out.println("Enter the index to delete (int): ");
				index = in.nextInt();
				
				ListElement le = list.deleteElement(index);
			}
			
			
		}
		
		
		ListElement le = new ListElement();
		le.setData(5);
		
		ListElement le2 = new ListElement();
		le2.setData(10);
		
		ListElement le4 = new ListElement();
		le4.setData(7);
		
		
		
		list.addElement(le);
		list.addElement(le2);
		list.addElement(le4);
		ListElement le3 = list.deleteElement(0);
		
		list.printLinkedListHead();
		
	}
	
	public static void printMenu() {
		System.out.println("Enter 1 to add an element");
		System.out.println("Enter 2 to delete an element");
		System.out.println("Enter 3 to print from head");
		System.out.println("Enter 4 to print from tail");
		System.out.println("Enter q to exit");
	}

}
