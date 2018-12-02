package ru.Arturbik.math;

import java.util.Scanner;

public class Main {
	static Array ar = new Array();
	static Scanner scn = new Scanner(System.in);
	static Operation operation = new Operation();
	public static void main(String[] args) { //Выбор операции
		System.out.println("Выберите операцию:\n"
				+ "1) Пересечение\n"
				+ "2) Объеденение\n"
				+ "3) Вычитание\n");
		ar.Array(scn.nextInt());
	}
}
