package assignment;

import java.util.Map;
import java.util.HashMap;
public class HashMap1 {
	public static void main(String[] args) {
	    Map<String,Integer> numbers= (Map<String, Integer>) new HashMap();  
    numbers.put("chaitanya", 10);
    numbers.put("srutha", 20);
    numbers.put("roshini",30);
    System.out.println(numbers);
    
    Map<Float,Double> number=new HashMap<>();  
    number.put(12.323f, 10d);
    number.put(12.323f, 20d);
    number.put(12.323f, 30d);
    System.out.println(number);
	}

}
