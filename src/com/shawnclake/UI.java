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
			
			if(input.equals("3"))
			{
				list.printLinkedListHead();
			}
			
			if(input.equals("4"))
			{
				list.printLinkedListTail();
			}
			
			if(input.equals("5"))
			{
				int index = 0;
				System.out.println("Enter the index to print (int): ");
				index = in.nextInt();
				
				System.out.println(list.getElement(index).getData());
			}
			
		}
		
	}
	
	public static void printMenu() {
		System.out.println("Enter 1 to add an element");
		System.out.println("Enter 2 to delete an element");
		System.out.println("Enter 3 to print from head");
		System.out.println("Enter 4 to print from tail");
		System.out.println("Enter 5 to print a node");
		System.out.println("Enter q to exit");
	}

}
