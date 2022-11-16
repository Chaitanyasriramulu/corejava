package assignment;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
        ArrayList<String> seniors = new ArrayList<>();
        seniors.add("suresh");
        seniors.add("omkar");
        seniors.add("srikanth"); 
        System.out.println("seniors"+ " "+ seniors);
        ArrayList<String> juniors = new ArrayList<>();
        juniors.add("chaitanya");
        juniors.add("srutha keerthi");
        juniors.add("roshini");
        juniors.add("savitri");
        juniors.add("vishal");
        juniors.add("vardhil");
        System.out.println("juniors"+" " + juniors);
        seniors.removeAll(seniors);
        seniors.retainAll(seniors);
       



      


	}

	//private static void retainAll() {
		// TODO Auto-generated method stub
		
//}

}
