package ru.Arturbik.math;

import java.util.Arrays;

public class Operation extends Array {
	static Array ar = new Array();
	static int k = 0;
	@SuppressWarnings("null")
	public void Intersection(int[] ar1, int[] ar2,int max) { //����������� �������� �����������
		//System.out.println("�� ������� �����������.");
		String[] finalArray = new String[max];
		//System.out.println(list.size());
		for(int i = 0;i<ar1.length;i++) {
			for(int j = 0;j<ar2.length;j++) {
				if((Integer)ar1[i]==(Integer)ar2[j]) {
					System.out.print(ar1[i]+" ");
					// ar1[1] = null; ??
				}
			}
		}
		
	}

	public void Association(int[] ar1, int[] ar2, int[] ar_Un) { //����������� �������� �����������
		System.out.println("�� ������� �����������.");
		ar.Array();
	}

	public void Subtraction(int[] ar1, int[] ar2, int[] ar_Un) { //����������� �������� ���������
		System.out.println("�� ������� ���������.");
		ar.Array();
	}
}
