package ru.Arturbik.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
	static Operation op = new Operation();
	static Scanner scn = new Scanner(System.in);
	static int a, b;
	public void Array() {
		System.out.println("���� �������� ������� �������. ������� � ������ ��������� ���������?");
		 List array_1 = new ArrayList<Integer>();
		 int max = scn.nextInt();
		 for(int i = 0;i<max;i++) {
			 System.out.println("������� ������� ������� �"+(i+1));
			 int a = scn.nextInt();
			 array_1.add(a);
		 }
		 System.out.println("���� �������� ������� �������. ������� �� ������ ��������� ���������?");
		 List array_2 = new ArrayList<Integer>();
		 max = scn.nextInt();
		 for(int i = 0;i<max;i++) {
			 System.out.println("������� ������� ������� �"+(i+1));
			 int a = scn.nextInt();
			 array_2.add(a);
		 }
		 op.Intersection(array_1, array_2,Math.max(a, b));
	}
}

