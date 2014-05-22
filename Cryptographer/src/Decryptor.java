public class Decryptor
	{
	static String startingText;
	static String decryptedSentence;

	public static void main(String[] args)
		{
		decryptor();
		}

	public static String decryptor()
		{
		startingText = Encryptor.encryptedText;
		StringBuffer unreverser = new StringBuffer(startingText);
		unreverser = unreverser.reverse();
		decryptedSentence = unreverser.toString();
		System.out.println(decryptedSentence);
		decryptedSentence = decryptedSentence.replace("jkl", "a");
		decryptedSentence = decryptedSentence.replace("bnm", "e");
		decryptedSentence = decryptedSentence.replace("fgh", "i");
		decryptedSentence = decryptedSentence.replace("zxc", "o");
		decryptedSentence = decryptedSentence.replace("lmn", "u");
		System.out.println(decryptedSentence);
		return decryptedSentence;
		}
	}