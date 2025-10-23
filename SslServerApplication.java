package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;

@SpringBootApplication
@RestController
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

	// Route to enable checksum return of static data
	@GetMapping("/checksum")
	public String getChecksum() {
		try {
			String data = "Hello World Check Sum!";
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] digest = md.digest(data.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : digest) {
				sb.append(String.format("%02x", b));
			}
			return "Data: " + data + "\nChecksum (SHA-256): " + sb.toString();
		} catch (Exception e) {
			return "Error generating checksum: " + e.getMessage();
		}
	}
}