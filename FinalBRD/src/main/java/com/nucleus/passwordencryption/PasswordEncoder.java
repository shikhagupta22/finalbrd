package com.nucleus.passwordencryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder
{
	@Autowired
	BCryptPasswordEncoder encoder;

  public String generatePassword(String password)
  {
	
		String hashedPassword = encoder.encode(password);
		System.out.println(hashedPassword);
		return hashedPassword;
		
  }
}
