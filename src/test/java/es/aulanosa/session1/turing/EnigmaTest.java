package es.aulanosa.session1.turing;

import org.junit.Assert;
import org.junit.Test;

public class EnigmaTest {
	
	private static final String ALPHABET = " ,.ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String DECRYPTED_TEXT = "We can only see a short distance ahead, but we can see plenty there that needs to be done.";
	private static final Integer ROTATION = 3;
	private static final String ENCRYPTED_TEXT = "ZhAfdqArqo,AvhhAdAvkruwAglvwdqfhAdkhdgBAexwAzhAfdqAvhhAsohqw,AwkhuhAwkdwAqhhgvAwrAehAgrqhC";

	/* Happy path */
	
	/**
	 * Given an alphabet
	 * And a text
	 * And a rotation
	 * When the text is encrypted
	 * Then the encrypted text is returned
	 */
	@Test
	public void encryptText() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = DECRYPTED_TEXT;
		Integer rotation = ROTATION;
		String encrypted = enigma.encrypt(text, rotation);
		String expected = ENCRYPTED_TEXT;
		Assert.assertEquals(expected, encrypted);
	}
	
	/**
	 * Given an alphabet
	 * And a text
	 * And a rotation
	 * When the text is decrypted
	 * Then the decrypted text is returned
	 */
	@Test
	public void decryptText() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = ENCRYPTED_TEXT;
		Integer rotation = ROTATION;
		String decrypted = enigma.decrypt(text, rotation);
		String expected = DECRYPTED_TEXT;
		Assert.assertEquals(expected, decrypted);
	}
	
	/* Unhappy path */
	
	/**
	 * Given a null alphabet
	 * And a text
	 * And a rotation
	 * When the text is encrypted
	 * Then the same text is returned
	 */
	@Test
	public void encryptTextWithNullAlphabet() {
		
		String alphabet = null;
		Enigma enigma = new Enigma(alphabet);
		String text = DECRYPTED_TEXT;
		Integer rotation = ROTATION;
		String encrypted = enigma.encrypt(text, rotation);
		String expected = DECRYPTED_TEXT;
		Assert.assertEquals(expected, encrypted);
	}
	
	/**
	 * Given a null alphabet
	 * And a text
	 * And a rotation
	 * When the text is decrypted
	 * Then the same text is returned
	 */
	@Test
	public void decryptTextWithNullAlphabet() {
		
		String alphabet = null;
		Enigma enigma = new Enigma(alphabet);
		String text = ENCRYPTED_TEXT;
		Integer rotation = ROTATION;
		String decrypted = enigma.decrypt(text, rotation);
		String expected = ENCRYPTED_TEXT;
		Assert.assertEquals(expected, decrypted);
	}
	
	/**
	 * Given an empty alphabet
	 * And a text
	 * And a rotation
	 * When the text is encrypted
	 * Then the same text is returned
	 */
	@Test
	public void encryptTextWithEmptyAlphabet() {
		
		String alphabet = "";
		Enigma enigma = new Enigma(alphabet);
		String text = DECRYPTED_TEXT;
		Integer rotation = ROTATION;
		String encrypted = enigma.encrypt(text, rotation);
		String expected = DECRYPTED_TEXT;
		Assert.assertEquals(expected, encrypted);
	}
	
	/**
	 * Given an empty alphabet
	 * And a text
	 * And a rotation
	 * When the text is decrypted
	 * Then the same text is returned
	 */
	@Test
	public void decryptTextWithEmptyAlphabet() {
		
		String alphabet = "";
		Enigma enigma = new Enigma(alphabet);
		String text = ENCRYPTED_TEXT;
		Integer rotation = ROTATION;
		String decrypted = enigma.decrypt(text, rotation);
		String expected = ENCRYPTED_TEXT;
		Assert.assertEquals(expected, decrypted);
	}
	
	/**
	 * Given an alphabet
	 * And a null text
	 * And a rotation
	 * When the text is encrypted
	 * Then the null text is returned
	 */
	@Test
	public void encryptTextWithNullText() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = null;
		Integer rotation = ROTATION;
		String encrypted = enigma.encrypt(text, rotation);
		String expected = null;
		Assert.assertEquals(expected, encrypted);
	}
	
	/**
	 * Given an alphabet
	 * And a null text
	 * And a rotation
	 * When the text is decrypted
	 * Then the null text is returned
	 */
	@Test
	public void decryptTextWithNullText() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = null;
		Integer rotation = ROTATION;
		String decrypted = enigma.decrypt(text, rotation);
		String expected = null;
		Assert.assertEquals(expected, decrypted);
	}
	
	/**
	 * Given an alphabet
	 * And an empty text
	 * And a rotation
	 * When the text is encrypted
	 * Then the empty text is returned
	 */
	@Test
	public void encryptTextWithEmptyText() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = "";
		Integer rotation = ROTATION;
		String encrypted = enigma.encrypt(text, rotation);
		String expected = "";
		Assert.assertEquals(expected, encrypted);
	}
	
	/**
	 * Given an alphabet
	 * And an empty text
	 * And a rotation
	 * When the text is decrypted
	 * Then the empty text is returned
	 */
	@Test
	public void decryptTextWithEmptyText() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = "";
		Integer rotation = ROTATION;
		String decrypted = enigma.decrypt(text, rotation);
		String expected = "";
		Assert.assertEquals(expected, decrypted);
	}
	
	/**
	 * Given an alphabet
	 * And a text
	 * And a null rotation
	 * When the text is encrypted
	 * Then the same text is returned
	 */
	@Test
	public void encryptTextWithNullRotation() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = DECRYPTED_TEXT;
		Integer rotation = null;
		String encrypted = enigma.encrypt(text, rotation);
		String expected = DECRYPTED_TEXT;
		Assert.assertEquals(expected, encrypted);
	}
	
	/**
	 * Given an alphabet
	 * And a text
	 * And a null rotation
	 * When the text is decrypted
	 * Then the same text is returned
	 */
	@Test
	public void decryptTextWithNullRotation() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = ENCRYPTED_TEXT;
		Integer rotation = null;
		String decrypted = enigma.decrypt(text, rotation);
		String expected = ENCRYPTED_TEXT;
		Assert.assertEquals(expected, decrypted);
	}
	
	/**
	 * Given an alphabet
	 * And a text with characters not contained in the alphabet
	 * And a rotation
	 * When the text is encrypted
	 * Then the provided text is returned
	 */
	@Test
	public void encryptTextWithUnknownCharacters() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = DECRYPTED_TEXT + "ñ";
		Integer rotation = ROTATION;
		String encrypted = enigma.encrypt(text, rotation);
		String expected = text;
		Assert.assertEquals(expected, encrypted);
	}
	
	/**
	 * Given an alphabet
	 * And a text with characters not contained in the alphabet
	 * And a rotation
	 * When the text is decrypted
	 * Then the provided text is returned
	 */
	@Test
	public void decryptTextWithUnknownCharacters() {
		
		String alphabet = ALPHABET;
		Enigma enigma = new Enigma(alphabet);
		String text = ENCRYPTED_TEXT + "ñ";
		Integer rotation = ROTATION;
		String decrypted = enigma.decrypt(text, rotation);
		String expected = text;
		Assert.assertEquals(expected, decrypted);
	}
	
}
