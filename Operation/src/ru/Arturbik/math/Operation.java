package ru.Arturbik.math;

import java.util.Arrays;
import java.util.List;

public class Operation extends Array {
	static Array ar = new Array();
	public void Intersection(List array_1, List array_2) { //Выполняется операция пересечения
		for(int i = 0; i < array_1.size(); i++){
	        for(int j = 0; j < array_2.size(); j++){
	            if(array_1.get(i).equals(array_2.get(j)) == true){
	               System.out.print(array_1.get(i)+" ");
	               array_1.remove(i);
	               
	            }
	        }
	    }    
		System.exit(0);
	}

	public void Association(List array_1, List array_2) { //Выполняется операция объеденения
		for(int i = 0; i<array_1.size();i++) {
			for(int j = 0; i<array_2.size();i++) {
				if(array_1.get(i).equals(array_2.get(j))) {
					array_2.remove(j);
				}
			}
		}
		for(int i = 0; i<array_2.size();i++) {
			array_1.add(array_2.get(i));
			
		}
		for(int i = 0; i<array_1.size();i++) {
			System.out.print(array_1.get(i)+" ");
		}
	}

	public void Subtraction(List array_1, List array_2) { //Выполняется операция вычетания
		for(int i = 0; i < array_1.size(); i++){
	        for(int j = 0; j < array_2.size(); j++){
	            if(array_1.get(i).equals(array_2.get(j)) == true){
	               array_1.remove(i);
	               
	            }
	        }
	    }
		for(int i = 0; i<array_1.size();i++) {
			System.out.print(array_1.get(i)+" ");
		}
	}
	public void Dekart(List array_1, List array_2) { //Выполняется декартово умножение
		for(int i = 0; i < array_1.size(); i++) {
			for(int j = 0; j < array_2.size(); j++) {
				
			}
		}
	}
}
