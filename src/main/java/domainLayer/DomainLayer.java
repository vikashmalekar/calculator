package domainLayer;
interface get{
	float add(int a,int b);
	float sub(int a,int b);
	float mul(int a,int b);
	float div(int a,int b);
}
public class DomainLayer implements get{
	 public float add(int a,int b){
	    return a+b;
	}
	 public float sub(int a,int b){
	    return a-b;
	}
	 public float mul(int a,int b){
	    return a*b;
	}
	 public float div(int a,int b){
	    return a/b;
	}
}
