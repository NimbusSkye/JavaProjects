package Java;
import java.util.LinkedList;
public class MergeSort {
	private static LinkedList<Integer> merge (LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> merged = new LinkedList<Integer>();
		while (!list1.isEmpty() && !list2.isEmpty()) {
			if (list1.getFirst() < list2.getFirst())
				merged.add(list1.removeFirst());
			else
				merged.add(list2.removeFirst());
		}
		while (!list1.isEmpty())
			merged.add(list1.removeFirst());
		while (!list2.isEmpty())
			merged.add(list2.removeFirst());
		return merged;
	}
	
	public static LinkedList<Integer> mergeSort (LinkedList<Integer> list) {
		if (list.size() <= 1)
			return list;
		int breakpoint = list.size()/2;
		LinkedList<Integer> list1 = new LinkedList<Integer>();	
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		for (int i = 0; i < breakpoint; i++)
			list1.add(list.removeFirst());
		while (!list.isEmpty())
			list2.add(list.removeFirst());
		list1 = mergeSort(list1);
		list2 = mergeSort(list2);
		return merge(list1, list2);
	}
}
