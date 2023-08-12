package com.example.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//		User txnServiceUser = User.builder()
//				.phoneNumber("XXXXX-XXXXX")
//				.password(passwordEncoder.encode("service123"))
//				.authorities(UserConstants.SERVICE_AUTHORITY)
//				.email("transaction_service@gmail.com")
//				.userIdentifier(UserIdentifier.SERVICE_ID)
//				.identifierValue("T-XXXXX")
//				.build();
//		userRepository.save(txnServiceUser);
    }



}