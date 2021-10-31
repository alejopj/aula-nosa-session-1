package es.aulanosa.session1.turing;

public class Enigma {
	
	private final String alphabet;
	
	public Enigma(String alphabet) {
		
		this.alphabet = alphabet;
	}

	public String encrypt(String text, Integer rotation) {
		
		String encryptedText = "";
		
		if (alphabet == null || text == null || !containsAll(alphabet, text) || rotation == null) {
			return text;
		}
		
		for (int i = 0; i < text.length(); i++) {
			
			char textChar = text.charAt(i);
			int alphabetIndex = alphabet.indexOf(textChar);
			char encryptedTextChar = alphabet.charAt((alphabetIndex + rotation) % alphabet.length());
			encryptedText = encryptedText.concat("" + encryptedTextChar);
		}
		
		return encryptedText;
	}
	
	public String decrypt(String text, Integer rotation) {
		
		String decryptedText = "";
		
		if (alphabet == null || text == null || !containsAll(alphabet, text) || rotation == null) {
			return text;
		}
		
		for (int i = 0; i < text.length(); i++) {
			
			char textChar = text.charAt(i);
			int alphabetIndex = alphabet.indexOf(textChar);
			char encryptedTextChar = alphabet.charAt((alphabetIndex - rotation + alphabet.length()) % alphabet.length());
			decryptedText = decryptedText.concat("" + encryptedTextChar);
		}
		
		return decryptedText;
	}
	
	private boolean containsAll(String alphabet, String text) {
		
		char[] alphabetCharacters = alphabet.toCharArray();
		char[] textCharacters = text.toCharArray();
		int count = 0;
		
		for (int i = 0; i < textCharacters.length; i++) {
			for (int j = 0; j < alphabetCharacters.length; j++) {
				
				if (alphabetCharacters[j] == textCharacters[i]) {
					count++;
					break;
				}
			}
		}
		
		return count == textCharacters.length;
	}
	
}
