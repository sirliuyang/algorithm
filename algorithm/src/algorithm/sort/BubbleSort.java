package algorithm.sort;

import java.util.List;

public class BubbleSort implements Sort<Integer> {
	private int count;

	@Override
	public List<Integer> sort(List<Integer> list) {
		count = 0;
		int length = list.size();
		for(int i=0;i<length;i++){
			for(int j=i;j<length;j++){
				if(list.get(i)>list.get(j)){
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					count++;
				}
			}
		}
		System.out.println("Swap times : " + count);
		return list;
	}
}
