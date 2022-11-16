package assignment;

import java.util.LinkedList;
import java.util.List;

public class RecycleBin {
	public static void main(String[] args) {
	
		List<String> s1=new LinkedList<>();
		s1.add("choky");
		s1.add("srutha");
		s1.add("roshini");
		System.out.println(s1);
		List<String> s2=new LinkedList<>();
		System.out.println(s1.removeAll(s2));
		System.out.println(s2);
		System.out.println(s1.addAll(s2));
		System.out.println(s1);


		
	}
}


