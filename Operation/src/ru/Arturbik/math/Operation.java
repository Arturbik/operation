package ru.Arturbik.math;

import java.util.ArrayList;
import java.util.List;

public class Operation extends Array {
	static Array ar = new Array();
	static int k = 0;
	@SuppressWarnings("null")
	public void Intersection(List array_1, List array_2,int max) { //Выполняется операция пересечения
		//System.out.println("Вы выбрали Пересечение.");
		for(int i = 0; i < array_1.size(); i++){
	        for(int j = 0; j < array_2.size(); j++){
	            if(array_1.get(i).equals(array_2.get(j)) == true){
	               System.out.print(array_1.get(i)+" ");
	               array_1.remove(i);
	               
	            }
	        }
	    }    
	}

	public void Association(int[] ar1, int[] ar2, int[] ar_Un) { //Выполняется операция объеденения
		System.out.println("Вы выбрали Объеденение.");
		ar.Array();
	}

	public void Subtraction(int[] ar1, int[] ar2, int[] ar_Un) { //Выполняется операция вычетания
		System.out.println("Вы выбрали Вычетание.");
		ar.Array();
	}
}
