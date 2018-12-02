package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
	public static void main(String[] args) {
		System.out.println(arList());
		
	}
	static ArrayList<int[]> arList() {
		int[] testMassive = {1,2,3,4};
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(testMassive);
		return list;
	}
}
