package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length == 0)
		{
			System.out.println("usage: java -jar <path-to-jar-file> <path-to-text-file>" + "or" + "usage: java -jar <path-to-jar-file> <option> <path-to-text-file>");
		}
		if(args.length == 1)
		{
			if(args[0].compareTo("--team") == 0)
			{
				System.out.print("Team Details: \n" + "170010023 - Tejaswi Vykuntam\n" + "180010022 - M.Raghavi Reddy\n" + "180010026 - Purnima Priyadarshini\n" + "180010035 - Srishti Suman\n");
			}
			else if(args[0].compareTo("--help") == 0) 
			{
		        File file = new File("C:\\Users\\Admin\\Downloads\\README.md");// "C:\\Users\\Admin\\Downloads\\README.md" --> path to README.md
		        FileInputStream fileStream = new FileInputStream(file); 
		        InputStreamReader input = new InputStreamReader(fileStream); 
		        BufferedReader reader = new BufferedReader(input); 
		          
		        String line;
		        while((line = reader.readLine()) != null) 
		        {                   
		             System.out.println(line);
		        }
		        fileStream.close();
			}
			else
			{
				read.calculate(args[0]);
				System.out.println("The average number of words per sentence in the essay is: " + read.get_averag());
			}
		}
		if(args.length == 2)
		{
			if(read.calculate(args[1]) == true)
			{
				if(args[0].compareTo("-s") == 0)
				{
					System.out.println("Total number of sentences in the essay are: " + read.get_tot_sentences());
				}
				else if(args[0].compareTo("-w") == 0)
				{
					System.out.println("Total number of words in the essay are: " + read.get_tot_words());
				}
				else if(args[0].compareTo("-a") == 0)
				{
					System.out.println("Total number of words in the essay are: " + read.get_tot_words());
					System.out.println("Total number of sentences in the essay are: " + read.get_tot_sentences());
					System.out.println("The average number of words per sentence in the essay is: " + read.get_averag());
				}
				else
				{
					System.out.println("Option choosen is NOT AVAILABLE");
					System.out.println("Available options:\n--team\n--help\n-w\n-s\n-a");
				}
			}
		}
		if(args.length > 2)
		{
			System.out.println("More arguments were given than expected");
			System.out.println("usage: java -jar <path-to-jar-file> <path-to-text-file>" + "or" + "usage: java -jar <path-to-jar-file> <option> <path-to-text-file>");
			System.out.println("Available options:\n-w\n-s\n-a");
		}
	}

}
