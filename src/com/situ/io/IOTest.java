package com.situ.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class IOTest {

	@Test
	public void testInputStream() throws IOException {
		InputStream inputStream = System.in;
		int content = inputStream.read();// 每次只会读取到一个字节的数据
		System.out.println(content);
		// abc
		// 97
	}

	@Test
	public void testWriteFile() throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream(new File(
				"a.txt"));
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
				fileOutputStream, "UTF-8");
		outputStreamWriter.write("大家好");
		outputStreamWriter.close();
	}

	@Test
	public void testFileReader() throws Exception {
		FileReader fileReader = new FileReader(new File("a.txt"));
		int content = 0;
		while ((content = fileReader.read()) != -1) {
			System.out.println((char) content);
		}
		fileReader.close();
	}

	@Test
	public void testInputStreamReader() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("a.txt");
		InputStreamReader inputStreamtfReader = new InputStreamReader(
				fileInputStream, "utf-8");
		int content = -1;
		while ((content = inputStreamtfReader.read()) != -1) {
			System.out.println((char)content);
		}
		inputStreamtfReader.close();
	}
}
