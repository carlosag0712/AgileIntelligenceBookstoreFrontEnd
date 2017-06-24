package io.agileintelligence.utility;


import io.agileintelligence.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Created by carlosarosemena on 2017-06-13.
 */

@Component
public class MailConstructor {

    @Autowired
    private Environment env;

    public SimpleMailMessage constructResetTokenEmail(
            String contextPath, Locale locale, String token, User user, String password
    ){
        String url =  contextPath + "/newUser?token="+token;
        String message = "\nPlease click on the link to activate your account\n Your password is: "+password;

        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(user.getEmail());
        email.setSubject("Agile Intelligence - New User");
        email.setText(url+message);
        email.setFrom(env.getProperty("support.email"));
        return email;



    }
}
