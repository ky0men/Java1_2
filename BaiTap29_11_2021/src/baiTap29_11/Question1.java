package baiTap29_11;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Question1 {
	public static void main(String[] args) throws UnsupportedEncodingException, DataFormatException {
		// Compress
		String input = "The night…aching with indescribable feelings. The sound of insects chirping mixed with the sound of rain.";
		byte inputObj[] = input.getBytes("UTF-8");
		System.out.println("Byte of before compress: " + input.length());
		byte output[] = new byte[100];
		Deflater deflater = new Deflater();
		deflater.setInput(inputObj);
		deflater.finish();
		int compressDataLength = deflater.deflate(output);
		System.out.println("Byte of after compress: " + compressDataLength);
		// Decompress
		Inflater inflObj = new Inflater();
		inflObj.setInput(output, 0, output.length);
		byte resultObj[] = new byte[1024];
		int resultLength = inflObj.inflate(resultObj);
		inflObj.end();
		String strOutput = new String(resultObj, 0, resultLength);
		System.out.println("Ouput string is: " + strOutput);
	}
}
