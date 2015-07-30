package com.cdg.work2;

import java.io.BufferedWriter;
import java.io.IOException;

public class Writer {
	private BufferedWriter file;
	public Writer(BufferedWriter out){
		this.file=out;
	}
	public void write(String str) throws IOException{
		file.write(str);
	}

}
