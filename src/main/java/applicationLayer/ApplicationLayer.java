package applicationLayer;
import java.util.*;

import domainLayer.DomainLayer;
import com.epam1.Implementing_Calculator.App;
public class ApplicationLayer {
	List<Object> list = new ArrayList<Object>();
	public void cal(int a,int b,char c) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	DomainLayer d=new DomainLayer();
	
	App app=new App();
	list =app.getList();
	while(c!='N'){
		
		
		switch(c){
		    case '+':float n1=d.add(a,b);
		    	list.add(n1);
		    	System.out.println(n1);
		            break;
		    case '-':float n2=d.sub(a,b);
		    list.add(n2);
		    	System.out.println(n2);
		            break;
		    case '*':float n3=d.mul(a,b);
		    list.add(n3);
		    	System.out.println(n3);
		            break;
		    case '/':float n4=d.div(a,b);
		    list.add(n4);
		    	System.out.println(n4);
		            break;
		  default:System.out.println("Invalid choice try again :)");
		  
		}
		   System.out.println("Want to calculate more...(Y/N)= ");
		   c=s.next().charAt(0);
		   list.add(c);
		   if(c!='N') {
			   System.out.println("enter any two numbers= ");
				a=s.nextInt();
				list.add(a);
				b=s.nextInt();
				list.add(b);
				System.out.println("Select type of operation( + , - , * , / ),You want to perform= ");
				
				
				c=s.next().charAt(0);
				list.add(c);
		   }
		   else
			   	break;
		}
	
}
	public  void   get() {
	      
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		} 
	    }
}
