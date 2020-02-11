package com.epam1.Implementing_Calculator;
import applicationLayer.ApplicationLayer;

import java.util.*;
/**
 * Hello world!
 *
 */
interface Main {
	public List<Object> getList();
	/* 
	 Hence LAYERED ARCHITECTURE and SOLID,DRY,KISS,YAGNA Principles are implemented..!!
	 */
}
public class App implements Main
{static ArrayList<Object> list = new ArrayList<Object>();
    public static void main( String[] args )
    {
    	System.out.println("LAYERED ARCHITECTURE and SOLID,DRY,KISS,YAGNA Principles are also implemented..!!");
        ApplicationLayer ap=new ApplicationLayer();
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        System.out.println("Enter any 2 numbers= ");
        int a,b;
        a=s.nextInt();
        list.add(a);
        b=s.nextInt();
        list.add(b);
        System.out.println("Select type of operation( + , - , * , / ),You want to perform= ");
        char c=s.next().charAt(0);
        list.add(c);
        ap.cal(a,b,c);
        
        ap.get();
        
        
        
        
    }
    public  List<Object> getList() {
       return list;
    }
}
