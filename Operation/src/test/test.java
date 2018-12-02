package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List list = new ArrayList<Integer>();
		int[] a = {1,2,3,4};
		for(int i = 0; i<a.length;i++) {
			list.add(a[i]);
		}
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
}
