package graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 
public class CaesarCipher1 {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\eclipse-java-2022-03-R-win32-x86_64\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		byte[] key = { 10, 20, 30, 40 };
		int keyVal = (int)(Math.random() * key.length)+1;
		/*
		String plaintext;
		while((plaintext = br.readLine()) != null){
			System.out.println(encode(plaintext, keyVal));
			System.out.println(decode(
					encode(plaintext, keyVal), keyVal));
			
		}
		*/
		String plaintext = br.readLine();
		System.out.println(encode(plaintext, keyVal));
		System.out.println(decode(
				encode(plaintext, keyVal), keyVal));
		
		fr.close();

	}
	public static String decode(String enc, int offset) {
		return encode(enc, 26 - offset);
	}
	public static String encode(String enc, int offset) {
		
		offset = offset % 26 + 26;
		StringBuilder encoded = new StringBuilder();
		for (char i : enc.toCharArray()) {
			if (Character.isLetter(i)) {
			   if (Character.isUpperCase(i)) {
				encoded.append((char) ('A' + (i - 'A' + offset) % 26));
			   } else {
				encoded.append((char) ('a' + (i - 'a' + offset) % 26));
				}
			} else {
				encoded.append(i);			}
		}
		return encoded.toString();
	}
}
