package compareArrayLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<>();
		Random random = new Random();
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list1.add(random.nextInt(100000));
		}
		long end1 = System.currentTimeMillis();
		System.out.println("ArrayList add current time: " + String.valueOf(end1 - start1));
		long Lstart1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list2.add(random.nextInt(100000));
		}
		long Lend1 = System.currentTimeMillis();
		System.out.println("LinkedList add current time: " + String.valueOf(Lend1 - Lstart1));
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list1.get(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("ArrayList get current time: " + String.valueOf(end2 - start2));
		long Lstart2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list2.get(i);
		}
		long Lend2 = System.currentTimeMillis();
		System.out.println("LinkedList get current time: " + String.valueOf(Lend2 - Lstart2));
		long start3 = System.currentTimeMillis();

		list1.remove(list1);

		long end3 = System.currentTimeMillis();
		System.out.println("ArrayList remove current time: " + String.valueOf(end3 - start3));
		long Lstart3 = System.currentTimeMillis();

		list2.remove(list2);

		long Lend3 = System.currentTimeMillis();
		System.out.println("LinkedList remove current time: " + String.valueOf(Lend3 - Lstart3));
	}

}
