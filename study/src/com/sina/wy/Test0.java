package com.sina.wy;

import java.util.ArrayList;
import java.util.Collection;

public class Test0 {
	public static void main(String[] args) {
		Collection<Shape> col=new ArrayList<Shape>();
		
	}
	public static Double totalArea(Collection<? extends Shape> arr){
		Double total=0.00;
		for (Shape s : arr) {
			if (s!=null) {
				total+=s.area();
			}
		}
		return total;
	}
}
