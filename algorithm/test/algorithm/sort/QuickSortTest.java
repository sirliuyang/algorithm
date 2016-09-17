package algorithm.sort;

import java.util.Calendar;
import java.util.List;

public class QuickSortTest extends Common{
	public static void main(String[] args){
		Sort<Integer> sort = new QuickSort();
		Calendar cal = Calendar.getInstance();
		long start = cal.getTimeInMillis();
		List<Integer> result = sort.sort(prepareData(10000));
		long end = cal.getTimeInMillis();
		System.out.print("Time is : " + String.valueOf(end - start));
		for(int element:result){
			System.out.println(element);
		}
	}
}
