package Maps;

import java.util.*;

public class TreeMapss {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	    	  //entery is a interface with with 2 arguments key & value 
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	}

}
