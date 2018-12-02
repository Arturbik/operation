package ru.Arturbik.math;

import java.util.ArrayList;
import java.util.List;

public class Operation extends Array {
	static Array ar = new Array();
	static int k = 0;
	@SuppressWarnings("null")
	public void Intersection(List array_1, List array_2) { //Выполняется операция пересечения
		for(int i = 0; i < array_1.size(); i++){
	        for(int j = 0; j < array_2.size(); j++){
	            if(array_1.get(i).equals(array_2.get(j)) == true){
	               System.out.print(array_1.get(i)+" ");
	               array_1.remove(i);
	               
	            }
	        }
	    }    
	}

	public void Association(List array_1, List array_2) { //Выполняется операция объеденения
		
		
	}

	public void Subtraction(List array_1, List array_2) { //Выполняется операция вычетания
		
		
	}

	public void Intersection1(List array_1, List array_2) {
		// TODO Auto-generated method stub
		
	}
}
