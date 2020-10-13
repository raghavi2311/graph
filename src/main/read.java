package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class read {
	
	static int w;
	static int s;
	public static boolean calculate(String path)
	{
		try {
			File file = new File(path); 
	        FileInputStream fileStream;
			fileStream = new FileInputStream(file);
	        InputStreamReader input = new InputStreamReader(fileStream); 
	        BufferedReader reader = new BufferedReader(input); 

	        String line; 
	        // Reading line by line from the  
	        // file until a null is returned 
	        try
	        {
				while((line = reader.readLine()) != null) 
				{                   
				    // \\s+ is the space delimiter in java 
				    String[] wordList = line.split("\\s+"); 
				    for(int i = 0; i < wordList.length; i++)
				    {
				    	if(wordList[i].length() > 3)
				    	{
				    		w++;
				    	}
				    }
				        
				    // [!?.:]+ is the sentence delimiter in java 
				    String[] sentenceList = line.split("[!?.:]+"); 
				    s += sentenceList.length;   
				}
		        fileStream.close();

			} 
	        catch (IOException e) 
	        {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found (or) Path given is incorrect");
			return false;
		}
		return true; 
	}
	
	public static int get_tot_words()
	{
		return w;
	}
	public static int get_tot_sentences()
	{
		return s;
	}
	public static double get_averag()
	{
		double avg = w/s;
		return avg;
	}
}
