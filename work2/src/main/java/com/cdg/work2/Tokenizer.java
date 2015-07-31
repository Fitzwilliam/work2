package com.cdg.work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Tokenizer {
	private BufferedReader reader;
	private String data="";
	private StringTokenizer token;
	private Checker check = new Checker();
	private Writer writer;
	
	public Tokenizer(BufferedReader reader){
		this.reader = reader;
	}
	public void setWriter(Writer writer){
		this.writer=writer;
	}
	
	public void make() throws IOException{
		String tmp="";
		while((data = reader.readLine()) != null){
			token=new StringTokenizer(data);
			while(token.hasMoreTokens()){
				String str = token.nextToken();
				System.out.println(str);
				if(check.check(str)){
					writer.write(str+" ");
					if(token.hasMoreTokens()){
						if(check.nextCheck(tmp=token.nextToken())){
							switch(check.whatPattern()){
								case 0:
									writer.write("******-******* ");
									break;
								case 1:
									writer.write("***-****-**** ");
									break;
								case 2:
									writer.write("****-****-**** ");
									break;
								case 3:
									writer.write("**-******-** ");
									break;
							}
						}
						else{
							writer.write(tmp+" ");
						}
					}
				}
				else{
					writer.write(str+" ");
				}
			}
			writer.write("\r\n");
		}
	}
}
