package com.cdg.work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Tokenizer {
	private BufferedReader reader;
	private String data="";
	private StringTokenizer st;
	private Checker check = new Checker();
	private Writer writer;
	
	public Tokenizer(BufferedReader reader){
		this.reader = reader;
	}
	public void setWriter(Writer writer){
		this.writer=writer;
	}
	
	public void make() throws IOException{
		while((data = reader.readLine()) != null){
			st=new StringTokenizer(data);
			while(st.hasMoreTokens()){
				String str = st.nextToken();
				System.out.println(str);
				if(check.check(str)){
					if(st.hasMoreTokens()){
						if(check.nextCheck(st.nextToken())){
								System.out.println("번호도 찾음");
								writer.write("***-***");
						}
					}
				}
				else{
					writer.write(str);
				}
			}
		}
	}
}
