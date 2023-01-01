package collection;
import java.util.HashSet;
public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // HashSet , LinkedHash Set  1- no duplicate element is allow , 2-the indexing odf elements are not in ordered manner	
	  human h1=new human("Hari",23);	
	  human h2=new human("Rama",54);
	  
//	  System.out.println(h1.hashCode());/////    hashCode()- 
//	  System.out.println(h2.hashCode());/////    hashCode()- 
//	  System.out.println(h2);////   print the object 
	  System.out.println(h1);//// 
	  System.out.println(h2.toString());  /// toString()
	  
	     int re1=h1.hashCode();
	     int re2=h2.hashCode();
	    String s1 =Integer.toHexString(re1);
	    String s2 =Integer.toHexString(re2);
	    
	  System.out.println(h1.getClass()+"@"+s1);
	  System.out.println(h2.getClass()+"@"+s2);
	}


}
class human{
	String nm;
	int age;
	human(String nm , int age){
		this.nm=nm;
		this.age=age;
	}
	
}
