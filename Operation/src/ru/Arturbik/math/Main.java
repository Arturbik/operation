package ru.Arturbik.math;

import java.util.Scanner;

public class Main {
	static Array ar = new Array();
	static Scanner scn = new Scanner(System.in);
	static Operation operation = new Operation();
	public static void main(String[] args) { //����� ��������
		System.out.println("�������� ��������:\n"
				+ "1) �����������\n"
				+ "2) �����������\n"
				+ "3) ���������\n");
		ar.Array(scn.nextInt());
	}
}
