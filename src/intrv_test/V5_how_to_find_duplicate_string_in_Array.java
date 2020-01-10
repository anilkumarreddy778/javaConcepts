package intrv_test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class V5_how_to_find_duplicate_string_in_Array {
	
	
	public static void main(String[] args)
	{
		
		String names[]= {"java","rubey","c","javascript","java","c"};
		
		
		//time complexity is more 0(nxn)
		for(int i=0;i<names.length;i++)
		{
			
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j])) {
					System.out.println("duplicate elenent is "+names[i]);	
				}
			}
		}
		
		//2 useing HASHSet : java collection : it stores unique values.
		
	//	set is Interface ---- Hashset is class -- time complexicty is o(n)
		Set<String > store = new HashSet<String>();
		
		for(String name:names) {
			
			if(store.add(name)== false) {
				
				System.out.println("duplicate element is "+name);
			}
		}
		
	// 3 using HashMap  --- store in key and value formate 
		
		//Map is interface ----- HashMap is class 
		Map<String , Integer> storemap = new HashMap<String , Integer>();
		
		for (String name2:names)
		{
			
			Integer count = storemap.get(name2);
			if(count==null)
			{
				
				storemap.put(name2, 1);
			}else {
				
				storemap.put(name2, ++count);
			}
		}
		
		//get the values from this hashmap
		
		Set<Entry<String, Integer>> entryset=storemap.entrySet();
		for(Entry<String, Integer> entry : entryset)
		{
			if(entry.getValue()>1)
			{
			System.out.println(entry.getKey());
			}
		}
	}

}
