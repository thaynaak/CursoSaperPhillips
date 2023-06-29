package SaperPhillips;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula14 {
	//ArrayList

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		items.add("red");
		items.add(0, "yellow");
		display (items,"%nDisplay list contents with enhanced for statement:");
		items.add("green");
		items.add("yellow");
		display (items,"List with two new elements: ");
		items.remove("yellow");
		display(items, "List: ");
			
	}
	private static void display(ArrayList<String> items, String header) {
		System.out.printf(header);
		for (String item: items) {
			System.out.printf(" %s", item);
		}
		System.out.println(Arrays.toString(items.toArray()));
		System.out.println();
		}
	}
