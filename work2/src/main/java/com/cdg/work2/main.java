package com.cdg.work2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
	public static void main(String argv[]) throws IOException{
		try {
			File file = new File("C:\\Program Files\\KT.txt");
			BufferedReader inFile = new BufferedReader(new FileReader(file));
	
			tokenizer token = new tokenizer(inFile);
			token.make();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find file");
		}
	}

}
