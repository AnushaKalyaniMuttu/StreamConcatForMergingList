package com.bean.inter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reversal {

	

public static void main (String [] args) {
	
	List<Integer> list1=Arrays.asList(1,2,3);
	list1.add(1);
	list1.add(2);
	list1.add(3);
	List<Integer> list2=Arrays.asList(1,2,3,4);
	list2.add(4);
	list2.add(5);
	list2.add(3);
	List<Integer> merged=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
	
	
}	
	  
	

}
