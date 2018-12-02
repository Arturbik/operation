package ru.Arturbik.math;

import java.util.Scanner;

public class Array {
	static Operation op = new Operation();
	static Scanner scn = new Scanner(System.in);
	static int a, b;
	public void Array() {
		System.out.println("Идет создание первого массива. Сколько в первом множестве элементов?");
		 int array_1[] = new int[a=scn.nextInt()];
		 for(int i = 0;i<array_1.length;i++) {
			 System.out.println("Введите элемент массива №"+(i+1));
			 array_1[i] = scn.nextInt();
		 }
		 System.out.println("Идет создание второго массива. Сколько во втором множестве элементов?");
		 int array_2[] = new int[b =scn.nextInt()];
		 for(int i = 0;i<array_2.length;i++) {
			 System.out.println("Введите элемент массива №"+(i+1));
			 array_2[i] = scn.nextInt();
		 } 
		 op.Intersection(array_1, array_2,Math.max(a, b));
	}
}

