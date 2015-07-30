package com.cdg.work2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String argv[]) throws IOException{
		try {
			File file = new File("C:\\Users\\junhyeok\\Documents\\KT.txt");
			//BufferedReader inFile = new BufferedReader(new FileReader(file));\
			BufferedReader inFile = new BufferedReader(new InputStreamReader (new FileInputStream(file),"euc-kr"));
			//FileWriter outFile = new FileWriter("C:\\Users\\junhyeok\\Documents\\KT2.txt");
			BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\junhyeok\\Documents\\KT2.txt"));
			Writer writer = new Writer(out);
			Tokenizer token = new Tokenizer(inFile);
			token.setWriter(writer);
			token.make();
			
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find file");
		}
	}

}
