package com.ashiq.palindrome;

import java.io.File;
import java.util.*;

public class Palindrome_check {
	public static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {

		
		StringPermutation("angle");
		System.out.println(list);
		System.out.println("Run Complete");
		
		

	}
	
	
	static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
    private static void StringPermutation(String permutation, String input)
    {   Palindrome_check p = new Palindrome_check();
        if(input.length() == 0)
        {         
          	 p.search(permutation);
        	         	       	
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {   
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
	
	
	
	public void search(String searchTerm) {

	    
		boolean found = false;
		String fielpath = "words.txt";
		String word = "";
		

		try {
			
			Scanner x;
			x = new Scanner(new File(fielpath));
			x.useDelimiter("[^A-Za-z]+");
			
			while (x.hasNext() && !found) {
				
				word = x.next();
			
				
				if (word.equals(searchTerm)) {
					
					found = true;
				}
				
			}
			x.close();
			
			
		} catch (Exception e) {
			
		}
		
		if (found) {
			
			list.add(searchTerm);
		
								
		}
		else {
			
		}
		
		
		
	}



	}

