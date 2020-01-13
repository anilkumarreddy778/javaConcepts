package intrv_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class V22_Count_num_duplicate_words {
	
	public static void main(String[] args) {
		duplic("hey java is java best language is java");
		
	}
	
	
	
	
	
	public static void duplic(String string)
	{
		
		String words[]=string.split(" ");
		
		Map<String,Integer> wordcount= new HashMap<String,Integer>();
		
		
		for(String word:words)
		{
			
			
			if(wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}else {wordcount.put(word, 1);}
		}
		
		Set<String> wordsInString = wordcount.keySet();
		
		for(String word:wordsInString)
		{
			if(wordcount.get(word)>1)
			{
				System.out.println(word+ " : "+ wordcount.get(word));
			}
		}
	}

}
