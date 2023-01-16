package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1 };
		int n = 3; // size of array
		int index = 0;
		//take a list, to print our output ,, list also take null value as output
		List<Integer> list = new ArrayList<Integer>();
		printAllSub(arr, n, index, list);

	}

	private static void printAllSub(int[] arr, int n, int index, List<Integer> list) {

		if (index == n) {
			for (Integer it : list) {
				System.out.print(it + " ");
			}
			System.out.println();
		//when we reach last index we return to our take or not take method line so do return 
			return;

		}
		// take or not take from the given index operation
		// notTake
		//means we will move onto next index without considering present index ele
		printAllSub(arr, n, index + 1, list);

		// take the index value and add it in list and do take ops
		list.add(arr[index]);
		printAllSub(arr, n, index + 1, list);
		//we are adding the element in list to do our take ops,,so we have to remove it to  
		// make it to normal list like without taking that element
		// remove the last entered element from list means size()-1 index ele from list
		//we cant do list.remove(index) it will go outofbound exception
		list.remove(list.size() - 1);

	}

}
