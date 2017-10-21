package com.technicalkeeda.dao.utility;


//http://www.technicalkeeda.com/spring-tutorials/how-to-encrypt-spring-configuration-datasource-password-credentials
	
import java.util.Base64;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class EncryptedDataSource extends DriverManagerDataSource {

	@Override
	public String getPassword() {
		String password = super.getPassword();
		return decode(password);
	}

	/***
	 * Decode Password
	 */
	
	private String decode(String decode) {
		return new String(Base64.getDecoder().decode(decode.getBytes()));
	}
	
	public static void main(String[] args) {
		String pswd = "admin" ;
		byte[]   bytesEncoded = Base64.getEncoder().encode(pswd.getBytes());
		System.out.println("ecncoded value is " + new String(bytesEncoded ));
	}
	
	/*@SuppressWarnings("restriction")
	private String decode(String decode) {
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			decode = new String(decoder.decodeBuffer(decode));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return decode;
	}*/	

}