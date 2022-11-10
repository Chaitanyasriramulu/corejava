package assignment;

import java.util.Date;

public class current_Date {
	int n=100;
	static void convert12(String str)
	{
	    int h1 = (int)str.charAt(0) - '0';
	    int h2 = (int)str.charAt(1)- '0';
	 
	    int hh = h1 * 10 + h2;
	 
	    String Meridien;
	    if (hh < 12) {
	        Meridien = "AM";
	    }
	    else
	        Meridien = "PM";
	 
	    hh %= 12;
	 
	    if (hh == 0) {
	        System.out.print("12");
	 
	        for (int i = 2; i < 8; ++i) {
	        System.out.print(str.charAt(i));
	        }
	    }
	    else {
	        System.out.print(hh);
	        for (int i = 2; i < 8; ++i) {
	        System.out.print(str.charAt(i));
	        }
	    }
	 
	System.out.println(" "+Meridien);
	}
	 
	public static void main(String ar[])
	{
	 
	    String str = "17:35:20";
	    convert12(str);
	 
	}


}