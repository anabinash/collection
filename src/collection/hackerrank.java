package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util. HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class hackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=4;
       String s=know(a);
       System.out.println(s.getClass());
       worker rama=new worker("Rama", 45);
       worker pankaj=new worker("Pankaj", 77);
       worker pankaj2=new worker("Pankaj", 77);
       worker muna=new worker("Muna", 55);
       worker rakesh3=new worker("Rakesh", 55);
       worker rakesh4=new worker("Rakesh", 55);
       
       Set<worker> ss=new  TreeSet<worker>();
       ss.add(rama);
       ss.add(pankaj);
       ss.add(pankaj2);       
       ss.add(muna);
       ss.add(rakesh3);
       ss.add(rakesh4);
     Iterator<worker> it=ss. iterator();
      while(it.hasNext()) {
    	 worker wr= (worker)it.next();  
    	  wr.display();  
      }    
	}
	public static String know(int no)
	{
		return  String.valueOf(no);
	}

}
class worker implements Comparable  {
	String nm;
	int age;
	 worker(String nm, int age){
		 this.nm=nm;
		 this.age=age;
	 }
	public void display() {
		System.out.println(nm+" "+age);
	}
	  public int compareTo(Object ob) {
		  worker ww=(worker)ob;
		  if(this.age>ww.age) {return 1;}
		  else if(this.age<ww.age) {return -1;}
		  else {return 0;}		  
	  }
}

