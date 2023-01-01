package collection;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		village v1=new village(555,"Nimashi");
		village v2=new village(658,"Ulashkut");
		village v3=new village(555,"Damakata");
		village v4=new village(555,"Bandhuhuda");
		Set<village> vlg=new HashSet<village>();
		vlg.add(v1);
		vlg.add(v2);
		vlg.add(v3);
		vlg.add(v4);
		  Iterator<village> it=vlg.iterator();
		  while (it.hasNext()) {
			village nsp=(village)it.next();
			nsp.print1();
		}
	}
}

}
class village{
	String nm;
	int age;
	 village(int age,String nm){
		 this.nm=nm;
		 this.age=age;
	 }
	 
	 void print1() {
		 System.out.println("Name="+nm+" "+"Age="+age);
	 }
	public  boolean equals(Object ob) {
     if(ob==this) {
    	 return true;
     }
     else if(ob==null || ob.getClass()!=this.getClass()) {
    	 return false;
     }
		
       village vn=(village)ob;
       
       return this.age==vn.age;
      
       
       
	 }
	 
}
