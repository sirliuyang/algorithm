package algorithm.sort;

import java.util.List;

public class QuickSort implements Sort<Integer> {

	private List<Integer> list;
	private static int count = 0;

	public QuickSort() {
	}

	public QuickSort(List<Integer> list) {
		this.list = list;
		quicksort(this.list, 0, this.list.size() - 1);
	}

	public List<Integer> getList() {
		return list;
	}

	@Override
	public List<Integer> sort(List<Integer> list) {
		QuickSort quicksort = new QuickSort(list);
		System.out.println("Swap times : " + count);
		return quicksort.getList();
	}

	private void quicksort(List<Integer> list, int left, int right) {
		if (list.isEmpty() || left < 0)
			return;
		int dp = 0;
		if (left < right) {
			dp = partition(list, left, right);
			quicksort(list, left, dp - 1);
			quicksort(list, dp + 1, right);
		}
	}

	private int partition(List<Integer> list, int left, int right) {
		int pivot = list.get(left);
		while (left < right) {
			while (left < right && pivot <= list.get(right)) {
				right--;
			}
			if (left < right) {
				list.set(left++, list.get(right));
				count++;
			}
			while (left < right && pivot >= list.get(left)) {
				left++;
			}
			if (left < right) {
				list.set(right--, list.get(left));
				count++;
			}
		}
		return left;
	}
}
