package com.web.automation.utilities;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;
import com.web.automation.accelerators.ActionsLibrary;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.internal.Base64Encoder;

import sun.*;
public class EncryptionDecryption extends ActionsLibrary
{
	private static final String ALGO = "AES";
	private static final byte[] keyValue = new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };

	/**
	 * @author Ravi krishna
	 * @param Data
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("restriction")
	public static String encrypt(String Data) throws Exception 
	{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(Data.getBytes());
		String encryptedValue = new Base64Encoder().encode(encVal);
		return encryptedValue;
	}

	/**
	 * @author Ravi krishna
	 * @param encryptedData
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("restriction")
	public static String decrypt(String encryptedData) throws Exception
	{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decordedValue = new Base64Encoder().decode(encryptedData);
		byte[] decValue = c.doFinal(decordedValue);
		String decryptedValue = new String(decValue);
		return decryptedValue;
	}
	
	/**
	 * @author Ravi krishna
	 * @return
	 * @throws Exception
	 */
	private static Key generateKey() throws Exception
	{
		Key key = new SecretKeySpec(keyValue, ALGO);
		return key;
	}
}