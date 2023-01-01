package collection;

import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;


public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Map<Integer, String>  ss=new HashMap<Integer,String>();
	  ss.put(12,"sonu");
	  ss.put(22,"Sila");
	  ss.put(13,"Abinash");
	  ss.put(13,"Tiger");
	  ss.put(15,"lucky");
	  ss.put(14,"popi");
           Set s= ss.entrySet();
        Iterator it=s.iterator();
        while(it.hasNext()) {
        	 Map.Entry m =(Map.Entry)it.next();
        	 System.out.println(m.getKey()+": "+m.getValue() );  
        	 
        	 
        }
        Set l=ss.keySet();
         Iterator itr=l.iterator();
         while(itr.hasNext()) {
        	Integer i =(Integer)itr.next();
        	System.out.println(i);
         }
         
           Collection  ll=ss.values();
            Iterator itrr=ll.iterator();
            while(itrr.hasNext()) {
            	  String sc =(String)itrr.next();
            	System.out.println(sc);
            	
            }
                 
        
    }
}
