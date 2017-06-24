package io.agileintelligence.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by carlosarosemena on 2017-06-10.
 */

@Component
public class SecurityUtility {

    private static final String SALT = "salt";

    @Bean
    public static BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }

    @Bean
    public static  String randomPassword() {
        String SATLCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while(salt.length()<18){
            int index = (int) (rnd.nextFloat()*SATLCHARS.length());
            salt.append(SATLCHARS.charAt(index));
        }

        String saltStr = salt.toString();
        return saltStr;
    }


}
