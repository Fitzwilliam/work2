package com.cdg.work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class tokenizer {
	private BufferedReader reader;
	private String data="";
	private StringTokenizer st;
	
	tokenizer(BufferedReader reader){
		this.reader = reader;
	}
	
	public void make() throws IOException{
		while((data = reader.readLine()) != null){
			st=new StringTokenizer(data);
			while(st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}
		}
	}
}
