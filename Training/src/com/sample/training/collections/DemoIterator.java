package com.sample.training.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        iterator.remove();
        
        
        //ListIterator
//        ListIterator<Integer> listIt  = numbers.listIterator();
//        while(listIt.hasNext()) {
//        	Integer number = listIt.next();         	
//            System.out.println(number);
//        }
//        listIt.add(8);
//    	listIt.add(9);
//    	listIt.add(7);
//    	System.out.println("list after add: "+numbers);    	
//    	while(listIt.hasPrevious()) {
//        	Integer number = listIt.previous();         	
//            System.out.println(number);
//        }
//    	listIt.remove();
    	System.out.println("list after remove: "+numbers);
       /* for (Iterator iterator2 = numbers.iterator(); iterator2.hasNext();) {
			Integer integer = (Integer) iterator2.next();
			System.out.println(" Number: "+integer);
			
		}*/
//        System.out.println("List: " + numbers);
//        for (Integer integer : numbers) {
//        	System.out.println(" Number foreach: "+integer);
//		}
//        

	}

}
