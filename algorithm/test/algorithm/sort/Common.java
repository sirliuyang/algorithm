package algorithm.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Common {
	public static List<Integer> list;
	
	public static List<Integer> prepareData(int size){
		list = new ArrayList<Integer>();
		while(size>0){
			list.add(genData());
			size--;
		}
		return list;
	}
	
	public static Integer genData(){
		Random random = new Random();
		return random.nextInt(33554432);
	}
}
