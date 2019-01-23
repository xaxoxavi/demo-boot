package com.esliceu.dwes.demoboot;

import com.esliceu.dwes.demoboot.domain.Authenticate;
import com.esliceu.dwes.demoboot.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AuthenticateComponent {

    Logger log = LogManager.getLogger(AuthenticateComponent.class);

    @Value("${extern.authenticapi.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    public void authenticate(){

        User user = new User();
        user.setUserId("bbonet");
        user.setPassword("qwerty");

        Authenticate authenticate = restTemplate.postForObject(url,user,Authenticate.class);

        log.debug(authenticate.getStatus());

    }
}
