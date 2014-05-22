import java.util.Scanner;

public class Encryptor
	{
	static String encryptedText;
	static String sentence;

	public static void main(String[] args)
		{
		encryptor();
		}

	public static String encryptor()
		{
		System.out.println("Input a sentence");
		Scanner userInput1 = new Scanner(System.in);
		sentence = userInput1.nextLine();
		sentence = sentence.replace("a", "jkl");
		sentence = sentence.replace("e", "bnm");
		sentence = sentence.replace("i", "fgh");
		sentence = sentence.replace("o", "zxc");
		sentence = sentence.replace("u", "lmn");
		StringBuffer reverser = new StringBuffer(sentence);
		reverser = reverser.reverse();
		encryptedText = reverser.toString();
		System.out.println(encryptedText);
		return encryptedText;
		}
	}
