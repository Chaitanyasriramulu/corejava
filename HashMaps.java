package assignment;

import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
	    
		Map<Float,Double> numbers=(Map<Float, Double>) new HashMaps();  
    numbers.put( 5.0f, 19.99d);
    numbers.put( 3.9f, 20.57d);
    numbers.put( 6.9f,30.55d);
    System.out.println(numbers);
	

    int hash = numbers.hashCode(); 
    
    System.out.println("Hashcode for list:" + hash);
	}
}

