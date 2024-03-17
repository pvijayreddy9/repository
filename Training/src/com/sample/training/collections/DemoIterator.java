package com.sample.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        Iterator<Integer> iterator = numbers.iterator();
        
        while (iterator.hasNext()) {        	
            Integer number = iterator.next();            
            System.out.println(number);
        }
       /* for (Iterator iterator2 = numbers.iterator(); iterator2.hasNext();) {
			Integer integer = (Integer) iterator2.next();
			System.out.println(" Number: "+integer);
			
		}*/
        for (Integer integer : numbers) {
        	System.out.println(" Number foreach: "+integer);
		}

	}

}
