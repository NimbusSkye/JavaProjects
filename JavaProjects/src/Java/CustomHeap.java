package Java;
import java.util.Arrays;
public class CustomHeap {
	
	private Integer[] array;
	
	public CustomHeap (Integer[] array) {
		this.array = array;
		for (int i = array.length/2; i > 0; i--)
			downHeap (i, array.length - 1);
	}
	
	public void upHeap (int position) {
		while (position > 1) {
			int cur = position;
			if (array[cur] > array[cur/2])
				swap (array, cur, cur/2);
			cur = cur/2;
		}
	}
	
	public void downHeap (int start, int end) {
		int i = start;
		int child;
		while (2*i <= end) {
			child = 2*i;
			if (child < end) {
				if (array[child+1] > array[child]) {
					child++;
				}
			}
			if (array[child] > array[i]) {
				swap (array, i, child);
				i = child;
			}
			else
				break;
		}
	}
	
	public Integer findMin () {
		int j = 0;
		Integer[] stuff;
		if (array.length % 2 == 0)
			stuff = new Integer [array.length/2];
		else
			stuff = new Integer [array.length/2 + 1];
		for (int i = array.length/2; i < array.length; i++) {
			stuff[j] = array[i];
			j++;
		}	
		return findMinimum(stuff);
	}
	
	private static Integer findMinimum (Integer[] blargh) {
		Integer min = blargh[0];
		for (int i = 0; i < blargh.length; i++) {
			if (min > blargh[i])
				min = blargh[i];
		}
		return min;
	}

	
	private static void swap (Integer[] heap, int pos1, int pos2) {
		int temp = heap[pos1].intValue();
		heap[pos1] = new Integer (heap[pos2].intValue());
		heap[pos2] = new Integer (temp);
	}
	
	public String toString () {
		return Arrays.toString(array);
	}
	
}
